
package Models;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class DAO {
    
    public Funcionario funcionario;
    public Usuario usuario;
    public Endereco endereco;
    
    public ConexaoBD bd;
    private PreparedStatement statement;
    public Statement stm;
    public ResultSet resultSet;
    private String men, sql;
    public String Acesso;
    
    
    public static final byte INCLUSAOFUNCIONARIO = 1;
    public static final byte ALTERACAOFUNCIONARIO = 2;
    public static final byte ALTERAÇAOUSUARIO = 3;
    public static final byte EXCLUSAOUSUARIO = 4;
   
    
    
    
    
     //<editor-fold defaultstate="collapsed" desc=" MÉTODO LOGIN ">
    public boolean consultar(String login, String senha) {
        boolean autenticado = false;
       
        try {
           
           sql = "select * from usuario where login= ? and senha=?";
           bd.getConnection();
           statement = bd.connection.prepareStatement(sql);
           statement.setString(1, login);
           statement.setString(2, senha);
            ResultSet rs = statement.executeQuery();
            if (rs.next()) {
               Acesso = rs.getString("perfil");
               autenticado = true;
            } else {
                rs.close();
                return autenticado;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        return autenticado;
    }
     //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc=" METODO DAO "> 
    public DAO(){
        bd = new ConexaoBD ();
       
        funcionario = new Funcionario();
        usuario = new Usuario();
        endereco = new Endereco();
      
        if(!bd.getConnection()){
            JOptionPane.showMessageDialog(null, "Falha ao conectar, o sistema será fechado");
            System.exit(0);
        }
    }
     //</editor-fold>
  
    //<editor-fold defaultstate="collapsed" desc=" EXECUTAR SQL "> 
    public void executaSQL(String sql){
        try {
            boolean resp;
            resp = bd.getConnection();
            if (resp == true) {
                // tipo case sensitive e pode percorrer tanto do início para o fim quanto do fim para o início
                stm = bd.connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);  
                resultSet = stm.executeQuery(sql);
            } else {
                JOptionPane.showMessageDialog(null, "Não conectou.");
            }
        } catch (SQLException erro) {}
    }
    //</editor-fold>
    
     //<editor-fold defaultstate="collapsed" desc=" EXECUTAR SQL CHAVES ESTRANGEIRAS "> 
    public ResultSet RunSQL(String sql){
    try {
            boolean resp;
            resp = bd.getConnection();
            if (resp == true) {
                // tipo case sensitive e pode percorrer tanto do início para o fim quanto do fim para o início
                stm = bd.connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);  
                resultSet = stm.executeQuery(sql);
                return resultSet;
            } else {
                JOptionPane.showMessageDialog(null, "Não conectou.");
                return null;
            }
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro de sintaxe: \n" + erro.toString());
            return null;
        }
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc=" MÉTODO ATUALIZAR ">
    public String atualizar(int operacao){
        men = "Operação realizada com sucesso!";
        try{
            switch (operacao){
                
                // ENDERECO
            case INCLUSAOFUNCIONARIO:
                
               sql = "insert into endereco values(null,?,?,?,?,?,?,?)";
                bd.getConnection();
                statement = bd.connection.prepareStatement(sql);
                statement.setString(1, endereco.getCep());
                statement.setString(2, endereco.getBairro());
                statement.setString(3, endereco.getLogradouro());
                statement.setString(4, endereco.getComplemento());
                statement.setString(5, endereco.getNumero());
                statement.setString(6, endereco.getCidade());
                statement.setString(7, endereco.getEstado());
                
                statement.executeUpdate();
                
               
               
                sql = "select* from endereco where cep =? and logradouro =? and numero =?";
                bd.getConnection();
                statement = bd.connection.prepareStatement(sql);
                statement.setString(1, endereco.getCep());
                statement.setString(2, endereco.getLogradouro());
                statement.setString(3, endereco.getNumero());
                ResultSet fk = statement.executeQuery();
                fk.next();
                String FKend = fk.getString("idendereco");


               
                
               // FUNCIONARIO
                
                sql = "insert into funcionario values(null,?,?,?,?,?,?,?,?)";
                bd.getConnection();
                statement = bd.connection.prepareStatement(sql);
                statement.setString(1, funcionario.getNomeFuncionario());
                statement.setString(2, funcionario.getCpfFuncionario());
                statement.setString(3, funcionario.getRgFuncionario());
                statement.setString(4, funcionario.getTelFuncionario());
                statement.setString(5, funcionario.getCelFuncionario());
                statement.setString(6, funcionario.getEmailFuncionario());
                statement.setString(7, funcionario.getDataNascFuncionario());
                statement.setString(8, FKend);
         
                statement.executeUpdate();
                
                
                sql = "select* from funcionario where cpf =? and rg =?";
                bd.getConnection();
                statement = bd.connection.prepareStatement(sql);
                statement.setString(1, funcionario.getCpfFuncionario());
                statement.setString(2, funcionario.getRgFuncionario());
                ResultSet fk2 = statement.executeQuery();
                fk2.next();
                String FKfcn = fk2.getString("idfuncionario");
               
                 // USUARIO
                sql = "insert into usuario values(null,?,?,?,?,?)";
                bd.getConnection();
                statement = bd.connection.prepareStatement(sql);
                statement.setString(1, usuario.getLoginUsuario());
                statement.setString(2, usuario.getPerfilUsuario());
                statement.setString(3, usuario.getSenhaUsuario());
                statement.setString(4, usuario.getConfirmacaoSenhaUsuario());
                statement.setString(5,FKfcn);
                
                statement.executeUpdate();
                statement.close();
                
                
                break;
                
            case ALTERACAOFUNCIONARIO:
               
               sql = "SELECT idfuncionario FROM funcionario INNER JOIN endereco ON "
                       + "endereco.idendereco = funcionario.FKendereco INNER JOIN usuario ON "
                       + "usuario.idUsuario = usuario.FKfuncionario WHERE cpf =? and rg =? ";
                 bd.getConnection();
                 statement = bd.connection.prepareStatement(sql);
                 statement.setString(1, funcionario.getCpfFuncionario());
                 statement.setString(2, funcionario.getRgFuncionario());
                  ResultSet cv = statement.executeQuery();
                        cv.next();
                    String cvf = cv.getString("idfuncionario");
                   
                sql = "update funcionario set  nomeFuncionario = ?,  cpf = ?, rg = ?, telefone = ?," 
                + "  celular = ?,  email = ?,  dataNascimento= ? where idfuncionario = ?";
                bd.getConnection();
                statement = bd.connection.prepareStatement(sql);
                statement.setString(8, cvf);
                statement.setString(1, funcionario.getNomeFuncionario());
                statement.setString(2, funcionario.getCpfFuncionario());
                statement.setString(3, funcionario.getRgFuncionario());
                statement.setString(4, funcionario.getTelFuncionario());
                statement.setString(5, funcionario.getCelFuncionario());
                statement.setString(6, funcionario.getEmailFuncionario());
                statement.setString(7, funcionario.getDataNascFuncionario());
               
               
                statement.executeUpdate();
                
                
               
             sql = "update endereco set cep  = ?, bairro = ?, logradouro = ?, complemento = ?," 
                + "  numero = ?,  cidade = ?,  estado = ?  where idendereco = ?";
                bd.getConnection();
                statement = bd.connection.prepareStatement(sql);
                 statement.setString(8, cvf);
                statement.setString(1, endereco.getCep());
                statement.setString(2, endereco.getBairro());
                statement.setString(3, endereco.getLogradouro());
                statement.setString(4, endereco.getComplemento());
                statement.setString(5, endereco.getNumero());
                statement.setString(6, endereco.getCidade());
                statement.setString(7, endereco.getEstado());
                statement.executeUpdate();
                
                

                sql = "update usuario set  login = ?,  perfil= ?," 
                + "  senha = ?,  confiSenha = ? where idUsuario= ?";
                bd.getConnection();
                statement = bd.connection.prepareStatement(sql);
                statement.setString(5,  cvf);
                statement.setString(1, usuario.getLoginUsuario());
                statement.setString(2, usuario.getPerfilUsuario());
                statement.setString(3, usuario.getSenhaUsuario());
                statement.setString(4, usuario.getConfirmacaoSenhaUsuario());
               
                statement.executeUpdate();
                
                statement.close();
     
                break;
                
                //USUARIO
                case ALTERAÇAOUSUARIO:
                sql = "insert into Usuario values(null,?,?,?,?,?)";
                bd.getConnection();
                statement = bd.connection.prepareStatement(sql);
                statement.setString(1, usuario.getLoginUsuario());
                statement.setString(2, usuario.getPerfilUsuario());
                statement.setString(3, usuario.getSenhaUsuario());
                statement.setString(4, usuario.getConfirmacaoSenhaUsuario());
                statement.setString(5, usuario.getFkFuncionarioUsuario());
                
                statement.executeUpdate();
                statement.close();
               
                break;
                
                case EXCLUSAOUSUARIO:
                sql = "delete from usuario where  = ?";
                bd.getConnection();
                statement = bd.connection.prepareStatement(sql);
                statement.setString(1, usuario.getIdUsuario());
                statement.executeUpdate();
                statement.close();
                break;
     
    
                 default:
                men = "Falha na operação!"; break;
            }
        }catch(SQLException erro){
            men = "Falha na operação: \n" + erro.toString();
        }
        return men;
    }
    //</editor-fold>
    
     
     //<editor-fold defaultstate="collapsed" desc=" pesquia endereco ">
    public boolean cslEndereco(String cep) {
        boolean autenticado = false;
       
        try {
           
           sql = "select * from endereco where cep= ?";
           bd.getConnection();
           statement = bd.connection.prepareStatement(sql);
           statement.setString(1, cep);
            ResultSet rs = statement.executeQuery();
            if (rs.next()) {
               Acesso = rs.getString("cep");
               autenticado = true;
            } else {
                rs.close();
                return autenticado;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        return autenticado;
    }
     //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc=" pesquia cpf">
    public boolean cslcpf(String cpf) {
        boolean autenticado = false;
       
        try {
           
           sql = "select * from funcionario where cpf= ?";
           bd.getConnection();
           statement = bd.connection.prepareStatement(sql);
           statement.setString(1, cpf);
            ResultSet rs = statement.executeQuery();
            if (rs.next()) {
               Acesso = rs.getString("cpf");
               autenticado = true;
            } else {
                rs.close();
                return autenticado;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        return autenticado;
    }
     //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc=" pesquia usuario">
    public boolean csluser(String login) {
        boolean autenticado = false;
       
        try {
           
           sql = "select * from usuario where login= ?";
           bd.getConnection();
           statement = bd.connection.prepareStatement(sql);
           statement.setString(1, login);
            ResultSet rs = statement.executeQuery();
            if (rs.next()) {
               Acesso = rs.getString("login");
               autenticado = true;
            } else {
                rs.close();
                return autenticado;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        return autenticado;
    }
     //</editor-fold>
    
}
