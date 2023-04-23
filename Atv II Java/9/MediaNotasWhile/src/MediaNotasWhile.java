import java.util.Scanner;

public class MediaNotasWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int contador = 1;
        double soma = 0;

        while (contador <= 3) {
            System.out.print("Digite a nota " + contador + ": ");
            double nota = input.nextDouble();
            soma += nota;
            contador++;
        }

        double media = soma / 3;
        System.out.println("A média das notas é: " + media);

        input.close();
    }
}
