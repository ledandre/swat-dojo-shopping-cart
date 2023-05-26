package swat.dojo;

import java.util.Map;

public class BdMock {

    private Map<Long, Produto> produtos = new HashMap<>();

    public void salvar(Produto produto) {
        produtos.put(produto.getId(), produto);
    }

    public void remover(Long productId){
        produtos.remove(productId);
    }

    public Produto getProduct(Long productId){
        return produtos.get(productId);
    }

    public Map<Long, Produto> getAllProducts(){
        return produtos;
    }

}
