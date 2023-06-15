package swat.dojo;

import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Response;

@Path("/carrinho")
public class CarrinhoResource {

    private BdMock bancoMock = BdMock.instanciaBd();

    @POST
    @Path("adicionar/produto")
    public void adicionarProdutoNoCarrinho(Produto produto) {
        Carrinho carrinho = bancoMock.getCarrinho();
        carrinho.addProduto(produto);
    }

    @GET
    public Response getCarrinho(){
        Carrinho carrinho = bancoMock.getCarrinho();
        return Response.ok(carrinho).build();
    }

    @GET
    @Path("/produtos")
    public Response getCarrinhoProdutos(){
        Carrinho carrinho = bancoMock.getCarrinho();
        return Response.ok(carrinho.getProdutos()).build();
    }

    @DELETE
    @Path("/produtos")
    public Response deleteProdutoCarrinho(Produto produto){
      Carrinho carrinho = bancoMock.getCarrinho();
      carrinho.getProdutos().remove(produto);
      return Response.ok().build();
    }

}
