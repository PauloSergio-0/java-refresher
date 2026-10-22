package armazen.revisao.com.produto;

public class Produto {

    private String nomeProduto;
    private double precoProduto;
    private int qtdProduto;


    public Produto(String nomeProduto, double precoProduto, int qtdProduto){

        this.nomeProduto = nomeProduto;
        this.precoProduto = precoProduto;
        this.qtdProduto = qtdProduto;

    }

    public void AdicionarProduto(int adicinar){

        this.qtdProduto += adicinar;

    }
    public void DiminuirProduto(int Diminuir){

        this.qtdProduto -= Diminuir;

    }

    public double precoTotal(){

        return this.precoProduto * this.qtdProduto;
    }

    @Override
    public String toString() {
        return
                "Nome Produto: " +this.nomeProduto +
                "\nPreço Produto: " + this.precoProduto +
                "\nQuantidade Produto: " + this.qtdProduto
                ;
    }
}
