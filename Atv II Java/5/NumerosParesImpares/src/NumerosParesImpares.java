import java.util.Scanner;

public class NumerosParesImpares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int quantidadePares = 0, quantidadeImpares = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite o número " + i + ": ");
            int numero = sc.nextInt();

            if (numero % 2 == 0) {
                quantidadePares++;
            } else {
                quantidadeImpares++;
            }
        }

        System.out.println("Quantidade de números pares: " + quantidadePares);
        System.out.println("Quantidade de números ímpares: " + quantidadeImpares);

        sc.close();
    }
}
