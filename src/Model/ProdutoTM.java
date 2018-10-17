package Model;

import java.text.DecimalFormat;
import java.util.LinkedList;
import javax.swing.JLabel;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableColumn;

public class ProdutoTM extends AbstractTableModel{
     
    private LinkedList<Produto> dados;
    private String[] colunas = {"Id", "Nome" , "Preço", "Quantidade"};
    //private DecimalFormat duascasasdecimais = new DecimalFormat( "0.00" );
     
    public ProdutoTM(LinkedList <Produto> lista){
        dados = lista;
    }
     
    public void addRow(Produto p){
        this.dados.add(p);
        this.fireTableDataChanged();
    }
 
    @Override
    public String getColumnName(int num){
        return this.colunas[num];
    }
 
    @Override
    public int getRowCount() {
        return dados.size();
    }
 
    @Override
    public int getColumnCount() {
        return colunas.length;
    }
 
    @Override
    public Object getValueAt(int linha, int coluna) {
        switch(coluna){
            case 0: return dados.get(linha).getId();
            case 1: return dados.get(linha).getNome();
            case 2: return dados.get(linha).getPreco();//duascasasdecimais.format(dados.get(linha).getPreco());
            case 3: return dados.get(linha).getQuantidade();//duascasasdecimais.format(dados.get(linha).getQuantidade());
        }   
        return null;
    }
}
