// esse programa calcula a soma dos números digitados até que o usuário digite um número negativo

import java.util.Scanner;

public class vigesimoquarto {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int soma = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.println("Digite o " + i + "º número: ");
            int numero = input.nextInt();
            if (numero < 0) {
                break;
            }
            soma += numero;
        }
        System.out.println("A soma dos números digitados é: " + soma);
    }
}