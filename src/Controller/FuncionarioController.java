
package Controller;

import Models.DAO;
import java.util.Date;

public class FuncionarioController {
    
    public String salvarFuncionario( String nomeFuncionario,  String cpfFuncionario,  
            String rgFuncionario,  String telFuncionario,  String celFuncionario,  String emailFuncionario,  
            String dataNascFuncionario,  int fkEnderecoFuncionario, int fkUsuarioFuncionario ){
        DAO dao = new DAO();
        dao.funcionario.setNomeFuncionario(nomeFuncionario);
        dao.funcionario.setCpfFuncionario(cpfFuncionario);
        dao.funcionario.setRgFuncionario(rgFuncionario);
        dao.funcionario.setTelFuncionario(telFuncionario);
        dao.funcionario.setCelFuncionario(celFuncionario);
        dao.funcionario.setEmailFuncionario(emailFuncionario);
        dao.funcionario.setDataNascFuncionario(dataNascFuncionario);
        dao.funcionario.setFkEnderecoFuncionario(fkEnderecoFuncionario);
        dao.funcionario.setFkUsuarioFuncionario(fkUsuarioFuncionario);
       
        String msgInclusao = dao.atualizar(DAO.INCLUSAOFUNCIONARIO);
        return msgInclusao;
    }
     
    public String alterarFuncionario(String idFuncionario,  String nomeFuncionario,  String cpfFuncionario,  
            String rgFuncionario,  String telFuncionario,  String celFuncionario,  String emailFuncionario,  
            String dataNascFuncionario,  int fkEnderecoFuncionario ){
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
    
    
}
