import java.util.*;

public class Ex13Lista4 {

    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        int numero;

        while (true) {
            System.out.print("Digite um numero inteiro positivo para calcular o fatorial (ou 0 para encerrar): ");
            numero = in.nextInt();

            if (numero == 0) {
                System.out.println("Encerrando o programa.");
                break;
            }

            if (numero < 0) {
                System.out.println("Numero invalido! Digite um numero inteiro positivo.");
                continue;
            }

            int fatorial = 1;
            int i = 1;

            while (i <= numero) {
                fatorial *= i;
                i++;
            }

            System.out.println("Fatorial de " + numero + " e: " + fatorial);
        }

        in.close();
    }
}