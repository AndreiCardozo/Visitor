package padroescomportamentais.visitor;

public class PessoaVisitor implements Visitor {

    public String exibir(Pessoa pessoa) {
        return pessoa.aceitar(this);
    }

    @Override
    public String exibirCliente(Cliente cliente) {
        return "Cliente{" +
                "codigoCliente=" + cliente.getCodigoCliente() +
                ", nome='" + cliente.getNome() + '\'' +
                ", endereco='" + cliente.getEndereco() + '\'' +
                '}';
    }

    @Override
    public String exibirVendedor(Vendedor vendedor) {
        return "Vendedor{" +
                "codigoVendedor=" + vendedor.getCodigoVendedor() +
                ", nome='" + vendedor.getNome() + '\'' +
                ", titulacao='" + vendedor.getTitulacao() + '\'' +
                '}';
    }

    @Override
    public String exibirFuncionario(Funcionario funcionario) {
        return "Funcionario{" +
                "codigo=" + funcionario.getCodigo() +
                ", nome='" + funcionario.getNome() + '\'' +
                ", salario=" + funcionario.getSalario() +
                '}';
    }
}
