public class VendaNacional extends Produto implements Venda{
    private double imposto;
    private int qtd;

    public VendaNacional(String nome, String categoria, double preco, int estoque, double imposto, int qtd){
        super(nome, categoria, preco, estoque);
        this.imposto=imposto;
        this.qtd=qtd;
    }

    public double getImposto(){
        return imposto;
    }

    public int getQtd(){
        return qtd;
    }

    @Override
    public double calculaDesc(){
        return (getPreco()*qtd)*0.10;
    }

    @Override
    public double calculaTotal(){
        return (getPreco()*qtd)+imposto-calculaDesc();
    }

    @Override
    public  String toString(){
        return super.toString()+ "\nImposto: " +imposto + "\nQuantidade: " +qtd;
    }
}
