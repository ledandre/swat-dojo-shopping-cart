package swat.dojo;

import java.util.Map;
import java.util.HashMap;

public class BdMock {

    private Map<Long, Produto> produtos = new HashMap<>();
    private Carrinho carrinho = new Carrinho();
    private static BdMock bdMock;

    private BdMock(){

    }

    public static BdMock instanciaBd(){
        if(bdMock == null){
            bdMock = new BdMock();
        }
        return bdMock;
    }

    public Carrinho getCarrinho(){
        return carrinho;
    }

    public void salvarProduto(Produto produto) {
        produtos.put(produto.getId(), produto);
    }

    public void removerProduto(Long productId){
        produtos.remove(productId);
    }

    public Produto getProduto(Long productId){
        return produtos.get(productId);
    }

    public Map<Long, Produto> getAllProducts(){
        return produtos;
    }

}
