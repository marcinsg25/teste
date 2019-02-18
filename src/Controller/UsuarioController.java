
package Controller;

import Models.DAO;


public class UsuarioController {
    
    public String salvarUsuario( String loginUsuario, String perfilUsuario, String SenhaUsuario, 
            String confirmacaoSenhaUsuario, int fkFuncionarioUsuario){
        DAO dao = new DAO();
        dao.usuario.setLoginUsuario(loginUsuario);
        dao.usuario.setPerfilUsuario(perfilUsuario);
        dao.usuario.setSenhaUsuario(SenhaUsuario);
        dao.usuario.setConfirmacaoSenhaUsuario(confirmacaoSenhaUsuario);
        dao.usuario.setFkFuncionarioUsuario(fkFuncionarioUsuario);
        
       
    
        String msgInclusao = dao.atualizar(DAO.INCLUSAOUSUARIO);
        return msgInclusao;
    }
     
    public String alterarUsuario(String idUsuario, String loginUsuario, String perfilUsuario, 
            String SenhaUsuario, String confirmacaoSenhaUsuario, int fkFuncionarioUsuario){
        DAO dao = new DAO();
        dao.usuario.setIdUsuario(idUsuario);
        dao.usuario.setLoginUsuario(loginUsuario);
        dao.usuario.setPerfilUsuario(perfilUsuario);
        dao.usuario.setSenhaUsuario(SenhaUsuario);
        dao.usuario.setConfirmacaoSenhaUsuario(confirmacaoSenhaUsuario);
        dao.usuario.setFkFuncionarioUsuario(fkFuncionarioUsuario);
        
        String msgInclusao = dao.atualizar(DAO.ALTERACAOUSUARIO);
        return msgInclusao;
    }
    
     public String excluirUsuario(String idUsuario){
        DAO dao = new DAO();
        dao.usuario.setIdUsuario(idUsuario);

        String msgInclusao = dao.atualizar(DAO.EXCLUSAOUSUARIO);
        return msgInclusao;
    }
}
