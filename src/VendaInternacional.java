public class VendaInternacional extends Produto implements Venda {
    private double taxaImportacao;
    private double frete;
    private int qtd;

    public VendaInternacional(String nome, String categoria, double preco, int estoque, double taxaImportacao, double frete, int qtd){
        super(nome, categoria, preco, estoque);
        this.taxaImportacao=taxaImportacao;
        this.frete=frete;
        this.qtd=qtd;
    }
    public double getTaxaImportacao(){
        return taxaImportacao;
    }
    public double getFrete(){
        return frete;
    }
    public int getQtd(){
        return qtd;
    }

    @Override
    public double calculaDesc(){
        return (getPreco()*qtd)*0.05;
    }

    @Override
    public double calculaTotal() {
        return (getPreco()*qtd)+taxaImportacao+frete-calculaDesc();
    }

    @Override
    public  String toString(){
        return super.toString()+ "\nTaxa de importação: " +taxaImportacao + "\nFrete: " +frete +"\nQuantidade: " +qtd;
    }
}
