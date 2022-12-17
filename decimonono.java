// Esse código converte dólares em reais

import java.util.Scanner;

public class decimonono {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o valor da cotação do dólar: ");
        double cotacao = input.nextDouble();
        System.out.println("Digite a quantidade de dólares disponíveis: ");
        double dolares = input.nextDouble();
        double reais = cotacao * dolares;
        System.out.println("O valor em reais é: " + reais);
    }
}

