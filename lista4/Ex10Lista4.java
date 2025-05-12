import java.util.*;

public class Ex10Lista4  {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int quantidade = 0;
        int numero = 0;
        int intervalo025 = 0;
        int intervalo2650 = 0;
        int maior50 = 0;

        System.out.print("Digite a quantidade de numeros a serem lidos: ");
        quantidade = in.nextInt();

        for (int i = 1; i <= quantidade; i++) {
            System.out.print("Digite o " + i + " numero: ");
            numero = in.nextInt();

            if (numero >= 0 && numero <= 25) {
                intervalo025++;
            } else if (numero >= 26 && numero <= 50) {
                intervalo2650++;
            } else {
                maior50++;
            }
        }

        System.out.println("Quantidade de numeros entre 0 e 25: " + intervalo025);
        System.out.println("Quantidade de numeros entre 26 e 50: " + intervalo2650);
        System.out.println("Quantidade de numeros maiores que 50: " + maior50);
        in.close();
    }
}