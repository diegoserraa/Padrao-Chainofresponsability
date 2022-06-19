package padroescomportamentais.chainofresponsability;

public class TipoProdutoCarnes implements TipoProduto {

    private static TipoProdutoCarnes tipoProdutoCarnes = new TipoProdutoCarnes();


    private TipoProdutoCarnes() {};

    public static TipoProdutoCarnes getTipoProdutoCarnes() {
        return tipoProdutoCarnes;
    }
}
