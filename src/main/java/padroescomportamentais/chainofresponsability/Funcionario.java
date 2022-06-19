package padroescomportamentais.chainofresponsability;

import java.util.ArrayList;

public abstract class Funcionario {

    protected ArrayList listaProdutos = new ArrayList();
    private Funcionario funcionarioSuperior;

    public Funcionario getFuncionarioSuperior() {
        return funcionarioSuperior;
    }

    public void setFuncionarioSuperior(Funcionario funcionarioSuperior) {
        this.funcionarioSuperior = funcionarioSuperior;
    }
    
    public abstract String getDescricaoCargo();
    
    public String venderProduto(Produto produto) {
        if (listaProdutos.contains(produto.getTipoProduto())) {
            return getDescricaoCargo();
        }
        else {
            if (funcionarioSuperior != null) {
                return funcionarioSuperior.venderProduto(produto);
            }
            else 
            {
                return "venda invalida";
            }
        }        
    }
}
