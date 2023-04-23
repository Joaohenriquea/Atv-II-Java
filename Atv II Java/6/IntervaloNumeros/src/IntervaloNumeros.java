import java.util.Scanner;

public class IntervaloNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int quantidadeNoIntervalo = 0, quantidadeForaIntervalo = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite o número " + i + ": ");
            int numero = sc.nextInt();

            if (numero >= 10 && numero <= 20) {
                quantidadeNoIntervalo++;
            } else {
                quantidadeForaIntervalo++;
            }
        }

        System.out.println("Quantidade de números no intervalo [10,20]: " + quantidadeNoIntervalo);
        System.out.println("Quantidade de números fora do intervalo [10,20]: " + quantidadeForaIntervalo);

        sc.close();
    }
}
