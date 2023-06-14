package padroescomportamentais.visitor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PessoaVisitorTest {

    @Test
    void deveExibirCliente() {
        Cliente cliente = new Cliente(1, "João", "Rua A, 123");

        PessoaVisitor visitor = new PessoaVisitor();
        assertEquals("Cliente{codigoCliente=1, nome='João', endereco='Rua A, 123'}", visitor.exibir(cliente));
    }

    @Test
    void deveExibirVendedor() {
        Vendedor vendedor = new Vendedor(1, "Maria", "Vendas");

        PessoaVisitor visitor = new PessoaVisitor();
        assertEquals("Vendedor{codigoVendedor=1, nome='Maria', titulacao='Vendas'}", visitor.exibir(vendedor));
    }

    @Test
    void deveExibirFuncionario() {
        Funcionario funcionario = new Funcionario(1, "Pedro", 5000.0f);

        PessoaVisitor visitor = new PessoaVisitor();
        assertEquals("Funcionario{codigo=1, nome='Pedro', salario=5000.0}", visitor.exibir(funcionario));
    }

}
