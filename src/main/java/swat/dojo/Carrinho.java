package swat.dojo;

import java.util.List;
import java.util.ArrayList;

public class Carrinho {
	
	private List<Produto> produtos = new ArrayList();
	private Double total = 0d;
	private Cupom cupom;
	private Integer id = 1;

	public void calcularTotal(){
		double total = 0;
        for (Produto produto : getProdutos()) {
            total += produto.getValor();
        }

        if(cupom !=null){
			if(cupom.isValorFixo()){
				total -= cupom.getValor();
			} else {
				Double desconto = total * cupom.getPorcentagemDesconto() / 100;
				total -= desconto;
			}
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
	public Cupom getCupom() {
		return cupom;
	}
	public void setCupom(Cupom cupom) {

		this.cupom = cupom;
	}
	
	
}
