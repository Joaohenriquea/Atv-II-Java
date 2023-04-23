import java.util.Scanner;

public class EncontrarNumeroMenorQueUm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;

        do {
            System.out.print("Digite um número: ");
            numero = sc.nextInt();
        } while (numero > 1);

        System.out.println("O número digitado é menor ou igual a 1.");

        sc.close();
    }
}
