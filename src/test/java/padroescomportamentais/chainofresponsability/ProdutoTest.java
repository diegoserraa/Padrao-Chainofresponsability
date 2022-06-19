package padroescomportamentais.chainofresponsability;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class
ProdutoTest {

    FuncionarioVinhos funcionarioVinhos;
    FuncionarioFrios funcionarioFrios;
    FuncionarioCarnes funcionarioCarnes;


    @BeforeEach
    void setUp() {
        funcionarioCarnes = new FuncionarioCarnes(funcionarioCarnes);
        funcionarioFrios = new FuncionarioFrios(funcionarioFrios);
        funcionarioVinhos = new FuncionarioVinhos(funcionarioVinhos);

    }

    @Test
    void deveRetornarFuncionarioVendedorCarne() {
        assertEquals("Funcionario Carnes", funcionarioCarnes.venderProduto(new Produto(TipoProdutoCarnes.getTipoProdutoCarnes())));
    }
    @Test
    void deveRetornarFuncionarioVendedorFrios() {
        assertEquals("Funcionario Frios", funcionarioFrios.venderProduto(new Produto(TipoProdutoFrios.getTipoProdutosFrios())));
    }
    @Test
    void deveRetornarFuncionarioVendedorVinhos() {
        assertEquals("Funcionario Vinhos", funcionarioVinhos.venderProduto(new Produto(TipoProdutoVinhos.getTipoProdutosVinhos())));
    }
    @Test
    void deveRetornarFuncionarioVendaInvalida() {
        assertEquals("venda invalida", funcionarioFrios.venderProduto(new Produto(TipoProdutoVinhos.getTipoProdutosVinhos())));
    }


}