import java.util.Scanner;

public class DivisaoLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número inicial: ");
        int base = sc.nextInt();

        int num;

        do {
            System.out.print("Digite um número: ");
            num = sc.nextInt();

            if (num < base) {
                continue;
            }

        } while (num % base == 0);

        System.out.println("Encerrado: número não é divisível pelo inicial.");

        sc.close();
    }
}