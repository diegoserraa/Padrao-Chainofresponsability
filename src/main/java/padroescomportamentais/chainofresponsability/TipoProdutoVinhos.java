package padroescomportamentais.chainofresponsability;

public class TipoProdutoVinhos implements TipoProduto {

    private static TipoProdutoVinhos tipoProdutoVinhos = new TipoProdutoVinhos();

    private TipoProdutoVinhos() {};

    public static TipoProdutoVinhos getTipoProdutosVinhos() {
        return tipoProdutoVinhos;
    }
}
