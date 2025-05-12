import java.util.*;

public class Ex07Lista4 {

    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        int valor1 = 0;
        int valor2 = 0;

        System.out.print("Digite o primeiro valor: ");
        valor1 = in.nextInt();
        System.out.print("Digite o segundo valor: ");
        valor2 = in.nextInt();

        int menor = Math.min(valor1, valor2);
        int maior = Math.max(valor1, valor2);
        int atual = menor + 1;
        int soma = 0;

        System.out.println("Somando os numeros pares entre " + valor1 + " e " + valor2 + ":");

        while (atual < maior) {
            if (atual % 2 == 0) {
                System.out.println(atual);
                soma += atual;
            }
            
            atual++;
        }

        System.out.println("Soma total: " + soma);
        in.close();
    }
}