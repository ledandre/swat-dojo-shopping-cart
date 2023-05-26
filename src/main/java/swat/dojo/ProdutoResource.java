package swat.dojo;

@Path("/produto")
public class ProdutoResource {

    private BdMock bancoMock = new BdMock();
   
    @GET
    public List<Produto> obterProdutos(){
        return bancoMock.getAllProducts().values().forEach(Produto p);

    @POST
    public void setProdutos(@RequestBody Produto produto){
          bancoMock.salvar(produto);
    }
    
    @DELETE
    public void removerProduto(@RequestBody Long productId) {
        bancoMock.remover(productId);
    }
    
    

}
