package padroescomportamentais.visitor;

public interface Visitor {

    String exibirCliente(Cliente cliente);
    String exibirVendedor(Vendedor vendedor);
    String exibirFuncionario(Funcionario funcionario);

}
