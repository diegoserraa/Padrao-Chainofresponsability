package padroescomportamentais.chainofresponsability;

public class FuncionarioFrios extends Funcionario {

    public FuncionarioFrios(Funcionario superior) {
        listaProdutos.add(TipoProdutoFrios.getTipoProdutosFrios());
        setFuncionarioSuperior(superior);
    }
    
    public String getDescricaoCargo() {
        return "Funcionario Frios";
    }

}
