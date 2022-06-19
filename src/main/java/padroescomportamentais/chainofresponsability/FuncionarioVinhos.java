package padroescomportamentais.chainofresponsability;

public class FuncionarioVinhos extends Funcionario {

    public FuncionarioVinhos(Funcionario superior) {
        listaProdutos.add(TipoProdutoVinhos.getTipoProdutosVinhos());
        setFuncionarioSuperior(superior);
    }
    
    public String getDescricaoCargo() {
        return "Funcionario Vinhos";
    }

}
