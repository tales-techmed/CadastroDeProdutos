package Controller;

import Model.Produto;
import java.util.LinkedList;

public class ProdutoController {
    LinkedList <Produto> dados;
    
    public ProdutoController(){
        dados = new LinkedList <Produto> ();
    }
    
    public boolean insere(int id, String nome, float preco, float estoque){
        dados.add(new Produto(id,nome,preco,estoque));
        return true;
    }
    
}
