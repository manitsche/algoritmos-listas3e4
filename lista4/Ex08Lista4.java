import java.util.*;

public class Ex08Lista4  {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int quantidade = 0;
        int numero = 0;
        int positivos = 0;
        int negativos = 0;

        System.out.print("Digite a quantidade de numeros a serem lidos: ");
        quantidade = in.nextInt();

        for (int i = 1; i <= quantidade; i++) {
            System.out.print("Digite o " + i + " numero: ");
            numero = in.nextInt();

            if (numero > 0) {
                positivos++;
            } else if (numero < 0) {
                negativos++;
            }
        }

        System.out.println("\nQuantidade de numeros positivos: " + positivos);
        System.out.println("Quantidade de numeros negativos: " + negativos);
        in.close();
    }
}