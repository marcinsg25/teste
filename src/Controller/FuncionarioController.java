
package Controller;

import Models.DAO;
import java.sql.ResultSet;
import java.util.Date;

public class FuncionarioController {
    
    public String salvarFuncionario( String nomeFuncionario,  String cpfFuncionario,  
            String rgFuncionario,  String telFuncionario,  String celFuncionario,  String emailFuncionario,  
            String dataNascFuncionario ){
        DAO dao = new DAO();
        dao.funcionario.setNomeFuncionario(nomeFuncionario);
        dao.funcionario.setCpfFuncionario(cpfFuncionario);
        dao.funcionario.setRgFuncionario(rgFuncionario);
        dao.funcionario.setTelFuncionario(telFuncionario);
        dao.funcionario.setCelFuncionario(celFuncionario);
        dao.funcionario.setEmailFuncionario(emailFuncionario);
        
        String data10 = dataNascFuncionario;
        String data1 = data10.replaceAll("/","");
        String data2 = data1.substring(0,2);
        String data3 = data1.substring(2,4);
        String data4 = data1.substring(4,8);
        String dataC = data4 + "-" + data3 + "-" + data2;
       
      
        dao.funcionario.setDataNascFuncionario(dataC);
        
        
       // dao.funcionario.setFkEnderecoFuncionario(fkEnderecoFuncionario);
       // dao.funcionario.setFkUsuarioFuncionario(fkUsuarioFuncionario);
       
        String msgInclusao = dao.funcionario();
        return msgInclusao;
    }
     
    public String alterarFuncionario(String idFuncionario,  String nomeFuncionario,  String cpfFuncionario,  
            String rgFuncionario,  String telFuncionario,  String celFuncionario,  String emailFuncionario,  
            String dataNascFuncionario,  String fkEnderecoFuncionario ){
        DAO dao = new DAO();
        dao.funcionario.setIdFuncionario(idFuncionario);
        dao.funcionario.setNomeFuncionario(nomeFuncionario);
        dao.funcionario.setCpfFuncionario(cpfFuncionario);
        dao.funcionario.setRgFuncionario(rgFuncionario);
        dao.funcionario.setTelFuncionario(telFuncionario);
        dao.funcionario.setCelFuncionario(celFuncionario);
        dao.funcionario.setEmailFuncionario(emailFuncionario);
        dao.funcionario.setDataNascFuncionario(dataNascFuncionario);
        dao.funcionario.setFkEnderecoFuncionario(fkEnderecoFuncionario);
     
       
        String msgInclusao = dao.atualizar(DAO.ALTERACAOFUNCIONARIO);
        return msgInclusao;
    }
    
    public boolean logarBD(){
         DAO dao = new DAO();
         boolean resp = dao.bd.getConnection();
         return resp;
         
     }
    
    public ResultSet fkEstrangeira(String sql){
        DAO dao = new DAO();
        return dao.RunSQL(sql);
    }
    
    
    
}
