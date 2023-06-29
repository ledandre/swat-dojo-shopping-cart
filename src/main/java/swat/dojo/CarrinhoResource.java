package swat.dojo;

import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.PATCH;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
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
        carrinho.calcularTotal();
        return Response.ok(carrinho).build();
    }

    @PATCH
    @Path("/cupom")
    public Response aplicarCupom(Cupom cupom){
        Carrinho carrinho = bancoMock.getCarrinho();
        carrinho.setCupom(cupom);
        return Response.ok().build();
    }

    @GET
    @Path("/produtos")
    public Response getCarrinhoProdutos(){
        Carrinho carrinho = bancoMock.getCarrinho();
        return Response.ok(carrinho.getProdutos()).build();
    }

    @DELETE
    @Path("/produtos/{produtoId}")
    public Response deleteProdutoCarrinho(@PathParam("produtoId") Long produtoId){
      Carrinho carrinho = bancoMock.getCarrinho();
      carrinho.getProdutos().removeIf(produto -> produtoId.equals(produto.getId()));
      return Response.ok().build();
    }
    

}
