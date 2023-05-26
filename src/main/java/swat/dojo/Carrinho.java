package swat.dojo;

public class Carrinho {
	
	private List<Produto> produtos;
	private Double total;
	private Double cupom;
	
	public List<Produtos> getProdutos() {
		return produtos;
	}
	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}
	public Double getTotal() {
		return total;
	}
	public void setTotal(Double total) {
		this.total = total;
	}
	public Double getCupom() {
		return cupom;
	}
	public void setCupom(Double cupom) {
		this.cupom = cupom;
	}
	
	
}
