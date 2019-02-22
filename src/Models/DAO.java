
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
    
    
    
    public static final byte INCLUSAOFUNCIONARIO = 1;
    public static final byte ALTERACAOFUNCIONARIO = 2;
    public static final byte ALTERAÇAOUSUARIO = 3;
    public static final byte EXCLUSAOUSUARIO = 4;
   
    
    
    //<editor-fold defaultstate="collapsed" desc=" MÉTODO LOCALIZAR MARCA ">
    public String funcionario(){
        String men = "Sucesso";
        sql = "select * idendereco from endereco where cep = ? and logradouro = ? and numero = ?" ;
        try{
            bd.getConnection();
            statement = bd.connection.prepareStatement(sql);
            statement.setString(1, endereco.getCep());
            statement.setString(2, endereco.getLogradouro());
            statement.setString(3, endereco.getNumero());
            resultSet = statement.executeQuery();
            if (resultSet == null){
                sql = "insert into endereco (cep, bairro, logradouro, complemento, numero, cidade, estado) values ("
                        + "?,?,?,?,?,?,?)";
                statement = bd.connection.prepareStatement(sql);
                statement.setString(1, endereco.getCep());
                statement.setString(2, endereco.getBairro());
                statement.setString(3, endereco.getLogradouro());
                statement.setString(4, endereco.getComplemento());
                statement.setString(5, endereco.getNumero());
                statement.setString(6, endereco.getCidade());
                statement.setString(7, endereco.getEstado());  
                statement.executeUpdate();
                statement.close();
            }
            else{
                String x = resultSet.getString("idendereco");
                statement.close();
            } 
            sql = "insert into funcionario (nomeFuncionario, cpf, rg, telefone, celular, email, dataNascimento, FKendereco) values(?,?,?,?,?,?,?,?)";
            statement = bd.connection.prepareStatement(sql);
            statement.setString(1, funcionario.getNomeFuncionario());
            statement.setString(2, funcionario.getCpfFuncionario());
            statement.setString(3, funcionario.getRgFuncionario());
            statement.setString(4, funcionario.getTelFuncionario());
            statement.setString(5, funcionario.getCelFuncionario());
            statement.setString(6, funcionario.getEmailFuncionario());
            statement.setString(7, funcionario.getDataNascFuncionario());
            statement.setString(8, funcionario.getFkEnderecoFuncionario());
            statement.executeUpdate();
            statement.close();
            
            
        }catch(SQLException erro){
            men = "Falha na operação : \n" + erro.toString();
        }
        return men;
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
        } catch (SQLException erro) {JOptionPane.showMessageDialog(null,"fUNCIONA PORRA");}
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
               sql = "update Funcionario set   = ?,  = ?,  = ?,  = ?," 
                + "   = ?,   = ?,   = ?,  = ? where = ?";
                bd.getConnection();
                statement = bd.connection.prepareStatement(sql);
                statement.setString(10, funcionario.getIdFuncionario());
                statement.setString(1, funcionario.getNomeFuncionario());
                statement.setString(2, funcionario.getCpfFuncionario());
                statement.setString(3, funcionario.getRgFuncionario());
                statement.setString(4, funcionario.getTelFuncionario());
                statement.setString(5, funcionario.getCelFuncionario());
                statement.setString(6, funcionario.getEmailFuncionario());
                statement.setString(7, funcionario.getDataNascFuncionario());
                statement.setString(8, funcionario.getFkEnderecoFuncionario());
               
               
     
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
}
