
package Controller;

import Models.DAO;


public class UsuarioController {
    
    public String salvarUsuario( String loginUsuario, String perfilUsuario, String SenhaUsuario, 
            String confirmacaoSenhaUsuario){
        DAO dao = new DAO();
        dao.usuario.setLoginUsuario(loginUsuario);
        dao.usuario.setPerfilUsuario(perfilUsuario);
        dao.usuario.setSenhaUsuario(SenhaUsuario);
        dao.usuario.setConfirmacaoSenhaUsuario(confirmacaoSenhaUsuario);
        
        
       
    
        String msgInclusao = dao.atualizar(DAO.ALTERAÇAOUSUARIO);
        return msgInclusao;
    }
     
  
}
