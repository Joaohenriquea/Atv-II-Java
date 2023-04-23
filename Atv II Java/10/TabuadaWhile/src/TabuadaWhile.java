import java.util.Scanner;

public class TabuadaWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número inteiro para ver a sua tabuada: ");
        int n = input.nextInt();

        int contador = 1;

        while (contador <= 10) {
            int resultado = n * contador;
            System.out.println(n + " x " + contador + " = " + resultado);
            contador++;
        }

        input.close();
    }
}
