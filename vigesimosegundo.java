// amo vc debs

// esse programa le 20 numeros e informa quantos estão entre 0 e 100 e quantos estão fora desse intervalo

import java.util.Scanner;

public class vigesimosegundo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int dentro = 0;
        int fora = 0;
        for (int i = 1; i <= 5; i++) {
            System.out.println("Digite o " + i + "º número: ");
            int numero = input.nextInt();
            if (numero >= 0 && numero <= 100) {
                dentro++;
            } else {
                fora++;
            }
        }
        System.out.println("A quantidade de números entre 0 e 100 é: " + dentro);
        System.out.println("A quantidade de números fora do intervalo é: " + fora);
    }
}


