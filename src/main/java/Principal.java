
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        while (true) {
            int m = leitor.nextInt();
            int n = leitor.nextInt();

            if (m <= 0 || n <= 0) {
                break;
            }

            int menor = Math.min(m, n);
            int maior = Math.max(m, n);
            int soma = 0;

            for (int i = menor; i <= maior; i++) {
                System.out.print(i + " ");
                soma += i;
            }
            System.out.println("Sum=" + soma);
        }
        leitor.close();
    }
}
