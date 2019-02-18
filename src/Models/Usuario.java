
package Models;


public class Usuario {
    private String idUsuario;
    private String loginUsuario;
    private String perfilUsuario;
    private String SenhaUsuario;
    private String confirmacaoSenhaUsuario;
    private int fkFuncionarioUsuario;

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getLoginUsuario() {
        return loginUsuario;
    }

    public void setLoginUsuario(String loginUsuario) {
        this.loginUsuario = loginUsuario;
    }

    public String getPerfilUsuario() {
        return perfilUsuario;
    }

    public void setPerfilUsuario(String perfilUsuario) {
        this.perfilUsuario = perfilUsuario;
    }

    public String getSenhaUsuario() {
        return SenhaUsuario;
    }

    public void setSenhaUsuario(String SenhaUsuario) {
        this.SenhaUsuario = SenhaUsuario;
    }

    public String getConfirmacaoSenhaUsuario() {
        return confirmacaoSenhaUsuario;
    }

    public void setConfirmacaoSenhaUsuario(String confirmacaoSenhaUsuario) {
        this.confirmacaoSenhaUsuario = confirmacaoSenhaUsuario;
    }

    public int getFkFuncionarioUsuario() {
        return fkFuncionarioUsuario;
    }

    public void setFkFuncionarioUsuario(int fkFuncionarioUsuario) {
        this.fkFuncionarioUsuario = fkFuncionarioUsuario;
    }

    
   

    

}
