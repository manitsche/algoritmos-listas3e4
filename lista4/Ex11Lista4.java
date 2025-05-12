import java.util.*;

public class Ex11Lista4 {

    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        int numero = 0;

       while (true) {
            System.out.print("Digite um numero de 1 a 1000 (fora disso encerra): ");
            numero = in.nextInt();

            if (numero < 1 || numero > 1000) {
                System.out.println("Numero fora do intervalo. Programa finalizado.");
                break;
            }

            if (numero % 7 == 0) {
                System.out.println(numero + " e multiplo de 7.");
            } else {
                System.out.println(numero + " nao e multiplo de 7.");
            }
        }

        in.close();
    }
}