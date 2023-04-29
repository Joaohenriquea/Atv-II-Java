import java.util.Scanner;

public class PesquisaHabitantes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int idade, maiorIdade = 0, menorIdade = Integer.MAX_VALUE;
        char sexo;
        double salario, mediaSalarios = 0, menorSalario = Double.MAX_VALUE;
        int qtdMulheres = 0, idadeMenorSalario = 0;
        char sexoMenorSalario = ' ';
        int qtdPessoas = 0;

        while (true) {
            System.out.print("Informe a idade (ou valor negativo para encerrar): ");
            idade = input.nextInt();
            if (idade < 0) {
                break;
            }
            System.out.print("Informe o sexo (M/F): ");
            sexo = input.next().charAt(0);
            System.out.print("Informe o salário: ");
            salario = input.nextDouble();
            
            mediaSalarios += salario;

            if (idade > maiorIdade) {
                maiorIdade = idade;
            }
            if (idade < menorIdade) {
                menorIdade = idade;
            }

            if (sexo == 'F') {
                qtdMulheres++;
            }

            if (salario < menorSalario) {
                menorSalario = salario;
                idadeMenorSalario = idade;
                sexoMenorSalario = sexo;
            }

            qtdPessoas++;
        }

        if (qtdPessoas > 0) {
            mediaSalarios /= qtdPessoas;
        }

        System.out.printf("Média dos salários: %.2f\n", mediaSalarios);
        System.out.printf("Maior idade: %d\n", maiorIdade);
        System.out.printf("Menor idade: %d\n", menorIdade);
        System.out.printf("Quantidade de mulheres: %d\n", qtdMulheres);
        System.out.printf("Pessoa com menor salário: idade = %d, sexo = %c\n", idadeMenorSalario, sexoMenorSalario);
    }
}
