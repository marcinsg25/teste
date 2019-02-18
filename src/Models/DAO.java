
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
    public static final byte INCLUSAOUSUARIO = 3;
    public static final byte ALTERACAOUSUARIO = 4;
    public static final byte EXCLUSAOUSUARIO = 5;
    public static final byte INCLUSAOENDERECO = 6;
    public static final byte ALTERACAOENDERECO = 7;
    
    
    
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
    
    //<editor-fold defaultstate="collapsed" desc=" MÉTODO ATUALIZAR ">
    public String atualizar(int operacao){
        men = "Operação realizada com sucesso!";
        try{
            switch (operacao){
                
                // FUNCIONARIO
                case INCLUSAOFUNCIONARIO:
                sql = "insert into funcionario values(null,?,?,?,?,?,?,?,?,?)";
                bd.getConnection();
                statement = bd.connection.prepareStatement(sql);
               statement.setString(1, funcionario.getNomeFuncionario());
                statement.setString(2, funcionario.getCpfFuncionario());
                statement.setString(3, funcionario.getRgFuncionario());
                statement.setString(4, funcionario.getTelFuncionario());
                statement.setString(5, funcionario.getCelFuncionario());
                statement.setString(6, funcionario.getEmailFuncionario());
                statement.setString(7, funcionario.getDataNascFuncionario());
                statement.setInt(8, funcionario.getFkEnderecoFuncionario());
                statement.setInt(9, funcionario.getFkUsuarioFuncionario());
                
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
                statement.setInt(8, funcionario.getFkEnderecoFuncionario());
                statement.setInt(9, funcionario.getFkUsuarioFuncionario());
                statement.executeUpdate();
                statement.close();
                break;
                
                //USUARIO
                case INCLUSAOUSUARIO:
                sql = "insert into Usuario values(null,?,?,?,?)";
                bd.getConnection();
                statement = bd.connection.prepareStatement(sql);
                statement.setString(1, usuario.getLoginUsuario());
                statement.setString(2, usuario.getPerfilUsuario());
                statement.setString(3, usuario.getSenhaUsuario());
                statement.setString(4, usuario.getConfirmacaoSenhaUsuario());
                
                statement.executeUpdate();
                statement.close();
                JOptionPane.showMessageDialog(null,usuario.getLoginUsuario());
                JOptionPane.showMessageDialog(null,usuario.getPerfilUsuario());
                JOptionPane.showMessageDialog(null,usuario.getSenhaUsuario());
                JOptionPane.showMessageDialog(null,usuario.getConfirmacaoSenhaUsuario());
               
                
                
                
                break;
                case ALTERACAOUSUARIO:
                sql = "update Usuario set   = ?,  = ?," 
                + "   = ?,   = ?,  = ? where = ?";
                bd.getConnection();
                statement = bd.connection.prepareStatement(sql);
                statement.setString(6, usuario.getLoginUsuario());
                statement.setString(1, usuario.getLoginUsuario());
                statement.setString(2, usuario.getPerfilUsuario());
                statement.setString(3, usuario.getSenhaUsuario());
                statement.setString(4, usuario.getConfirmacaoSenhaUsuario());
                
                statement.executeUpdate();
                statement.close();
                break;
                case EXCLUSAOUSUARIO:
                sql = "delete from Usuario where  = ?";
                bd.getConnection();
                statement = bd.connection.prepareStatement(sql);
                statement.setString(1, usuario.getIdUsuario());
                statement.executeUpdate();
                statement.close();
                break;
                // ENDERECO
                case INCLUSAOENDERECO:
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
                statement.close();
                break;
                case ALTERACAOENDERECO:
                sql = "update endereco set   = ?,  = ?, = ?, = ?," 
                + "   = ?,   = ?,   = ?,  = ? where = ?";
                bd.getConnection();
                statement = bd.connection.prepareStatement(sql);
                 statement.setString(8, endereco.getCep());
                statement.setString(1, endereco.getCep());
                statement.setString(2, endereco.getBairro());
                statement.setString(3, endereco.getLogradouro());
                statement.setString(4, endereco.getComplemento());
                statement.setString(5, endereco.getNumero());
                statement.setString(6, endereco.getCidade());
                statement.setString(7, endereco.getEstado());
               
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
