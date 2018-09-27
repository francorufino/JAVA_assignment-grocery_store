import java.util.ArrayList;
import java.util.List;

public class Carrinho {

    private float valorTotal;
    private List<Produto> listaProdutos = new ArrayList<>();

    public void adicionarProduto(Produto produto) {
        listaProdutos.add(produto);
        System.out.println("O item " + produto.getTipo() + " foi adicionado ao carrinho");

    }
    public void excluirProduto(Produto produto){
        listaProdutos.remove(produto);
        System.out.println("O item " + produto.getTipo() + " foi excluído no carrinho");
    }

    public float somarCarrinho(List<Produto> listaProdutos) {
        valorTotal = 0;
        for (Produto umProduto : listaProdutos) {
            valorTotal = valorTotal + umProduto.getPreco();
        }
        System.out.println(valorTotal);
        return valorTotal;
    }

    public float getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }

    public List<Produto> getListaProdutos() {
        return listaProdutos;
    }

    public void setListaProdutos(List<Produto> listaProdutos) {
        this.listaProdutos = listaProdutos;
    }










}