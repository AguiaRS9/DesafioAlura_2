public class ConversaoDolarReais {
    public static void main(String[] args) {
        double valorEmDolar = 250.50;
        double taxaDeConversao = 4.94;

        double valorEmReais = valorEmDolar * taxaDeConversao;

        System.out.println("O Valor convertido em Reais é: R$ " + valorEmReais);
    }
}
