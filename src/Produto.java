public class Produto {
    public static void main(String[] args) {
        double precoproduto = 39.99;
        int quantidade = 2;

        double total = precoproduto * quantidade;

        String mensagem = "O valor total da compra é de: R$ " + total;

        System.out.println(mensagem);
    }
}
