// esse programa calcula a média das idades de 20 pessoas

import java.util.Scanner;

public class decimosexto {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int soma = 0;
        for (int i = 1; i <= 20; i++) {
            System.out.println("Digite a " + i + "ª idade: ");
            int idade = input.nextInt();
            soma += idade;
        }
        double media = soma / 20.0;
        System.out.println("A média das idades é: " + media);
    }
}
