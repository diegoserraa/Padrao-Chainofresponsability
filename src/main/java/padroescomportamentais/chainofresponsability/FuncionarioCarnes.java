package padroescomportamentais.chainofresponsability;

public class FuncionarioCarnes extends Funcionario {
    
    public FuncionarioCarnes(Funcionario superior) {
        listaProdutos.add(TipoProdutoCarnes.getTipoProdutoCarnes());
        setFuncionarioSuperior(superior);
    }
    
    public String getDescricaoCargo() {
        return "Funcionario Carnes";
    }
}
