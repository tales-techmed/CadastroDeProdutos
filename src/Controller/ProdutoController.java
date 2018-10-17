package Controller;

import Model.Produto;
import Model.ProdutoTM;
import java.util.LinkedList;

public class ProdutoController {
    LinkedList <Produto> dados;
    ProdutoTM modelotabela;
    
    public ProdutoController(){
        dados = new LinkedList <Produto> ();
        modelotabela = new ProdutoTM(dados);
    }
    
    public boolean insere(int id, String nome, float preco, float estoque){
        dados.add(new Produto(id,nome,preco,estoque));
        return true;
    }
    
    public boolean insere(String nome, float preco, float estoque){
        int id;
        try{
            id = dados.getLast().getId()+1;
        } catch (Exception e){
            id=1;
        }
        dados.add(new Produto(id,nome,preco,estoque));
        return true;
    }
    
    public boolean insere(String nome, String preco, String estoque){
        int id;
        try{
            id = dados.getLast().getId()+1;
        } catch (Exception e){
            id=1;
        }
        try{
            dados.add(new Produto(id,nome,Float.parseFloat(preco),Float.parseFloat(estoque)));
            return true;
        } catch(Exception e){
            return false;
        }
    }
    
    public boolean edita(String id, String nome, String preco, String estoque){
        //encontra a posição do produto na lista
        int i;
        for(i=0;i<dados.size();i++){
            if(dados.get(i).getId()==Integer.parseInt(id))
                break;
        }
        //atualiza os dados na lista
        try{
            if(i!=dados.size()){
                dados.set(i,new Produto(Integer.parseInt(id),nome,
                        Float.parseFloat(preco),Float.parseFloat(estoque)));
            }
            return true;
        } catch(Exception e){
            return false;
        }
    }
    
    public Produto pesquisa(int id){
        for(int i=0;i<dados.size();i++){
            if(dados.get(i).getId()==id)
                return dados.get(i);
        }
        return null;
    }
    
    public boolean delete(String id){
        //encontra a posição do produto na lista
        int i;
        for(i=0;i<dados.size();i++){
            if(dados.get(i).getId()==Integer.parseInt(id))
                break;
        }
        dados.remove(i);
        return true;
    }
    
    public String mostraTudo(){
        String retorno="";
        for(int i=0;i<dados.size();i++){
            retorno+=dados.get(i).getId()+" - ";
            retorno+=dados.get(i).getNome()+" - ";
            retorno+=dados.get(i).getPreco()+" - ";
            retorno+=dados.get(i).getQuantidade()+"\n";
        }
        return retorno;
    }

    public ProdutoTM getModeloTabela() {
        return modelotabela;
    }
    
}
