package padroescomportamentais.visitor;

public class Cliente implements Pessoa {

    private int codigoCliente;
    private String nome;
    private String endereco;

    public Cliente(int codigoCliente, String nome, String endereco) {
        this.codigoCliente = codigoCliente;
        this.nome = nome;
        this.endereco = endereco;
    }

    public int getCodigoCliente() {
        return codigoCliente;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public String aceitar(Visitor visitor) {
        return visitor.exibirCliente(this);
    }
}
