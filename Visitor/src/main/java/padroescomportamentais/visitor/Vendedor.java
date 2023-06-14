package padroescomportamentais.visitor;

public class Vendedor implements Pessoa {

    private int codigoVendedor;
    private String nome;
    private String titulacao;

    public Vendedor(int codigoVendedor, String nome, String titulacao) {
        this.codigoVendedor = codigoVendedor;
        this.nome = nome;
        this.titulacao = titulacao;
    }

    public int getCodigoVendedor() {
        return codigoVendedor;
    }

    public String getNome() {
        return nome;
    }

    public String getTitulacao() {
        return titulacao;
    }

    public String aceitar(Visitor visitor) {
        return visitor.exibirVendedor(this);
    }

}