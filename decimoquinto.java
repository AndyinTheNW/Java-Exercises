// esse programa calcula a soma das idades de 20 pessoas


import java.util.Scanner;

public class decimoquinto {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int soma = 0;
        for (int i = 1; i <= 20; i++) {
            System.out.println("Digite a " + i + "ª idade: ");
            int idade = input.nextInt();
            soma += idade;
        }
        System.out.println("A soma das idades é: " + soma);
    }
}