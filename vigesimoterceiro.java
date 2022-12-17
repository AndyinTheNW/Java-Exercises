// o pai é bom de java

// esse programa le 20 numeros e informa quantos estão entre 0 e 100, entre 101 e 200 e maiores que 200

import java.util.Scanner;

public class vigesimoterceiro {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int entre0e100 = 0;
        int entre101e200 = 0;
        int maiores200 = 0;
        for (int i = 1; i <= 20; i++) {
            System.out.println("Digite o " + i + "º número: ");
            int numero = input.nextInt();
            if (numero >= 0 && numero <= 100) {
                entre0e100++;
            } else if (numero >= 101 && numero <= 200) {
                entre101e200++;
            } else {
                maiores200++;
            }
        }
        System.out.println("A quantidade de números entre 0 e 100 é: " + entre0e100);
        System.out.println("A quantidade de números entre 101 e 200 é: " + entre101e200);
        System.out.println("A quantidade de números maiores que 200 é: " + maiores200);
    }
}
