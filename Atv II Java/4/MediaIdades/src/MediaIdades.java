import java.util.Scanner;

public class MediaIdades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int quantidade, soma = 0;
        double media;

        System.out.print("Digite a quantidade de idades a serem lidas: ");
        quantidade = sc.nextInt();

        for (int i = 1; i <= quantidade; i++) {
            System.out.print("Digite a idade " + i + ": ");
            int idade = sc.nextInt();
            soma += idade;
        }

        media = (double) soma / quantidade;

        System.out.println("A média das idades é: " + media);

        sc.close();
    }
}
