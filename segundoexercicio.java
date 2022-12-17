// esse programa lê um número e diz se ele é divisível por 10, 5 ou 2

import java.util.Scanner;

public class segundoexercicio {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int numero = leitor.nextInt();
        if (numero % 10 == 0) {
            System.out.println("O número é divisível por 10");
        } else if (numero % 5 == 0) {
            System.out.println("O número é divisível por 5");
        } else if (numero % 2 == 0) {
            System.out.println("O número é divisível por 2");
        } else {
            System.out.println("O número não é divisível por nenhum deles");
        }
    }
}