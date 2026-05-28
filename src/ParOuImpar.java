import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int n1 = sc.nextInt();

        System.out.print("Digite o segundo número (maior): ");
        int n2 = sc.nextInt();

        System.out.print("Escolha (par/impar): ");
        String opcao = sc.next();

        for (int i = n2; i >= n1; i--) {
            if (opcao.equalsIgnoreCase("par") && i % 2 == 0) {
                System.out.println(i);
            } else if (opcao.equalsIgnoreCase("impar") && i % 2 != 0) {
                System.out.println(i);
            }
        }

        sc.close();
    }
}