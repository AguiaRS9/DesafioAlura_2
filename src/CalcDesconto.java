public class CalcDesconto {
    public static void main(String[] args) {
        double precoOriginal = 190.00;

        double percentualDesconto = 10.0;
        double valorDesconto = (percentualDesconto / 100.0) * precoOriginal;
        double novoPreco = precoOriginal - valorDesconto; //Exibe o valor com o desconto

        System.out.println("O valor original sem desconto é: R$" + precoOriginal); //Deverá exibir "O valor original sem desconto é: R$190.0"
        System.out.println("O desconto é de: R$" + valorDesconto); // Deverá dizer que o desconto é de R$ 19.0
        System.out.println("Novo preço com o desconto fica: R$" + novoPreco); // Devera exibir o novo preço com o desconto sendo ele: R$171.0
    }
}
