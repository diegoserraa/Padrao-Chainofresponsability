package padroescomportamentais.chainofresponsability;

public class TipoProdutoFrios implements TipoProduto {

    private static TipoProdutoFrios tipoProdutoFrios = new TipoProdutoFrios();

    private TipoProdutoFrios() {};
    
    public static TipoProdutoFrios getTipoProdutosFrios() {
        return tipoProdutoFrios;
    }
}
