import java.util.Scanner;

public class TabuadaDeUmNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero;
        do {
            System.out.print("Digite um número entre 1 e 10: ");
            numero = sc.nextInt();
        } while (numero < 1 || numero > 10);

        System.out.println("Tabuada de " + numero + ":");

        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }

        sc.close();
    }
}
