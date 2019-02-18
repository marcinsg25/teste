package Models;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;


public class TabelaModelo extends AbstractTableModel{
     private ArrayList linhas = null;
     private String[] colunas = null;
    
    /**
     * Método responsável por indicar (setar) a qtde de linhas e colunas     * 
     * @param lin - linhas
     * @param col  - colunas
     */
    public TabelaModelo(ArrayList lin, String[] col){
        setLinhas(lin);
        setColunas(col);
    }
    
    /**
     * Métodos para pegar as linhas e colunas e para setar as linhas
     * e colunas
     */
    public ArrayList getLinhas(){
        return linhas;
    }
    public void setLinhas(ArrayList dados){
        linhas = dados;
    }
    public String[] getColunas(){
        return colunas;
    }
    public void setColunas(String[] nomes){
        colunas = nomes;
    }
    
    /**
     * Métodos para realizar a contagem do número de colunas
     * e número de linhas
     * e outro para retornar o valore de nome das colunas
     * e, no Object, ele pega os valores e monta o objeto chamado linhas e
     * retorna para a tabela o qtde de linhas de acordo com a qtde de colunas
     */
    public int getColumnCount(){
        return colunas.length; // lengt conta qtde de caracteres no nome
    }
    public int getRowCount() {
        return linhas.size();  // size conta o tamanho do array
    }
    public String getColumnName(int numCol){
        return colunas[numCol];
    }
    public Object getValueAt(int numLin, int numCol){
        Object[] linha = (Object[])getLinhas().get(numLin);
        return linha[numCol];
    }
    
}
