import java.util.Scanner;
import java.time.Year;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Informe seu ano de nascimento: ");
        int anoNascimento = scanner.nextInt();

        int anoAtual = Year.now().getValue();
        int idade = anoAtual - anoNascimento;

        System.out.printf("Olá %s, você tem %d anos\n", nome, idade);

        scanner.close();
    }
}
