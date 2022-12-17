// Esse código calcula a soma dos números digitados pelo usuário


import java.util.Scanner;

public class decimoquarto {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int soma = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.println("Digite o " + i + "º número: ");
            int numero = input.nextInt();
            soma += numero;
        }
        System.out.println("A soma dos números digitados é: " + soma);
    }
}
