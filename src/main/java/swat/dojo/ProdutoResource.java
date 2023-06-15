package swat.dojo;

import java.util.ArrayList;
import java.util.List;

import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Response;

@Path("/produto")
public class ProdutoResource {

    private BdMock bancoMock = BdMock.instanciaBd();

    @GET
    public Response obterProdutos(){
        List<Produto> produtos = new ArrayList<>();
        bancoMock.getAllProducts().values().forEach(p -> produtos.add(p));
        return Response.ok(produtos).build();
    }

    @POST
    public void setProdutos(Produto produto){
          bancoMock.salvarProduto(produto);
    }

    @DELETE
    public void removerProduto(Long productId) {
        bancoMock.removerProduto(productId);
    }

}
