package swat.dojo;

import java.util.List;
import java.util.ArrayList;

public class Carrinho {
	
	private List<Produto> produtos = new ArrayList();
	private Double total = 0d;
	private Double cupom;
	private Integer id = 1;

	public void calcularTotal(){
		double total = 0;
        for (Produto produto : getProdutos()) {
            total += produto.getValor();
        }
        setTotal(total);
	}

	public void addProduto(Produto produto) {
		this.produtos.add(produto);
	}
	
	public List<Produto> getProdutos() {
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
