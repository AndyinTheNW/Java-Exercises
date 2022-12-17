// ta acabando
// não acho que vc ta vendo até aqui

// esse programa lê 5 números e informa o valor da prestação de uma compra de 5x sem juros

import java.util.Scanner;

public class vigesimoprimeiro {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o valor da compra: ");
        double valor = input.nextDouble();
        double prestacao = valor / 5;
        System.out.println("O valor das prestações é: " + prestacao);
    }
}