import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a base: ");
        double base = scanner.nextDouble();

        System.out.print("Informe a altura: ");
        double altura = scanner.nextDouble();

        double area = base * altura;

        System.out.println("Área do retângulo: " + area);

        scanner.close();
    }
}