import java.util.Scanner;

public class ValidacaoDeEntradaWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numero = 0;

        while (numero < 12 || numero > 20) {
            System.out.print("Digite um número entre 12 e 20: ");
            numero = input.nextInt();

            if (numero < 12 || numero > 20) {
                System.out.println("Entrada inválida. Tente novamente.");
            }
        }

        System.out.println("Você digitou o número " + numero);

        input.close();
    }
}
