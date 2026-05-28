import java.util.Scanner;

public class IMC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite sua altura (ex: 1.75): ");
        double altura = sc.nextDouble();

        System.out.print("Digite seu peso: ");
        double peso = sc.nextDouble();

        double imc = peso / (altura * altura);

        if (imc <= 18.5) {
            System.out.println("Abaixo do peso");
        } else if (imc <= 24.9) {
            System.out.println("Peso ideal");
        } else if (imc <= 29.9) {
            System.out.println("Levemente acima do peso");
        } else if (imc <= 34.9) {
            System.out.println("Obesidade Grau I");
        } else if (imc <= 39.9) {
            System.out.println("Obesidade Grau II (Severa)");
        } else {
            System.out.println("Obesidade III (Mórbida)");
        }

        sc.close();
    }
}