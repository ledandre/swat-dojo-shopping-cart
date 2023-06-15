package swat.dojo;

public class Cupom {

    public String nome;
    public Double porcentagemDesconto = 0d;
    public Double valor = 0d;
    boolean valorFixo = false;

    public Cupom(String nome, Double valor, Boolean valorFixo){
        if(valorFixo){
            this.valor = valor;
        }else{
            this.porcentagemDesconto = valor;
        }
    }
    
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public Double getValor(){
        return valor;
    }

    public void setValor(Double valor){
        this.valor = valor;
    }
}