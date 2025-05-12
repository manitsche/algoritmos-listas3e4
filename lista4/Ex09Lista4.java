import java.util.*;

public class Ex09Lista4  {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int quantidade = 0;
        int numero = 0;
        int pares = 0;
        int impares = 0;

        System.out.print("Digite a quantidade de numeros a serem lidos: ");
        quantidade = in.nextInt();

        for (int i = 1; i <= quantidade; i++) {
            System.out.print("Digite o " + i + " numero: ");
            numero = in.nextInt();

            if (numero % 2 == 0) {
                pares++;
            } else if (numero % 2 == 1) {
                impares++;
            }
        }

        System.out.println("Quantidade de numeros pares: " + pares);
        System.out.println("Quantidade de numeros impares: " + impares);
        in.close();
    }
}