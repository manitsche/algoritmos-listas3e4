import java.util.*;

public class Ex14Lista4 {

    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        int termo1 = 1;
        int termo2 = 1;
        int proximo = 0;
        int contador = 2; 

        System.out.println("Os 10 primeiros termos da sequencia de Fibonacci sao:");
        System.out.print(termo1 + " ");
        System.out.print(termo2 + " ");

        while (contador < 10) {
            proximo = termo1 + termo2;
            System.out.print(proximo + " ");

            termo1 = termo2;
            termo2 = proximo;
            contador++;
        }
    }
}