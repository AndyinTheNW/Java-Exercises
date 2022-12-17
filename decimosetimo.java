//esse programa diz quantas pessoas são maiores de idade


import java.util.Scanner;

public class decimosetimo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int maiores = 0;
        for (int i = 1; i <= 20; i++) {
            System.out.println("Digite a " + i + "ª idade: ");
            int idade = input.nextInt();
            if (idade >= 18) {
                maiores++;
            }
        }
        System.out.println("A quantidade de pessoas maiores de idade é: " + maiores);
    }
}
