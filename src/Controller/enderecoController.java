
package Controller;

import Models.DAO;


public class enderecoController {
    public String salvarEndereco(String cep, String bairro, String logradouro, 
            String complemento, String numero, String cidade, String estado){
        DAO dao = new DAO();
        dao.endereco.setCep(cep);
        dao.endereco.setBairro(bairro);
        dao.endereco.setLogradouro(logradouro);
        dao.endereco.setComplemento(complemento);
        dao.endereco.setNumero(numero);
        dao.endereco.setCidade(cidade);
        dao.endereco.setEstado(estado);
       
    
        String msgInclusao = dao.atualizar(DAO.INCLUSAOENDERECO);
        return msgInclusao;
    }
     
    public String alterarCliente(String idendereco, String cep, String bairro, String logradouro, 
            String complemento, String numero, String cidade, String estado){
        DAO dao = new DAO();
        dao.endereco.setIdendereco(idendereco);
        dao.endereco.setCep(cep);
        dao.endereco.setBairro(bairro);
        dao.endereco.setLogradouro(logradouro);
        dao.endereco.setComplemento(complemento);
        dao.endereco.setNumero(numero);
        dao.endereco.setCidade(cidade);
        dao.endereco.setEstado(estado);
        
        String msgInclusao = dao.atualizar(DAO.ALTERACAOENDERECO);
        return msgInclusao;
    }
    
}
