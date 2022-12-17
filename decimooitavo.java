// esse programa exibe o nome da pessoa mais nova entre 10 opções

import java.util.Scanner;
public class decimooitavo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int menor = 0;
        String nome = "";
        for (int i = 1; i <= 10; i++) {
            System.out.println("Digite o nome da " + i + "ª pessoa: ");
            String nomePessoa = input.next();
            System.out.println("Digite a idade da " + i + "ª pessoa: ");
            int idade = input.nextInt();
            if (i == 1) {
                menor = idade;
                nome = nomePessoa;
            } else {
                if (idade < menor) {
                    menor = idade;
                    nome = nomePessoa;
                }
            }
        }
        System.out.println("A pessoa mais nova é: " + nome);
    }
}

