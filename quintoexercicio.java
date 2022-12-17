// esse programa lê a idade de uma pessoa e diz se ela pode votar ou não
// abaixo de 16 anos não pode votar
// entre 16 e 18 anos pode votar se for facultativo
// acima de 18 anos pode votar obrigatoriamente
// acima de 65 anos pode votar facultativamente

import java.util.Scanner;

public class quintoexercicio {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite a sua idade: ");
        int idade = leitor.nextInt();
        if (idade < 16) {
            System.out.println("Você não pode votar");
        } else if (idade >= 16 && idade < 18) {
            System.out.println("Você pode votar se quiser");
        } else if (idade >= 18 && idade < 65) {
            System.out.println("Você deve votar");
        } else {
            System.out.println("Você pode votar se quiser");
        }
    }
}