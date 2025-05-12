import java.util.*;

public class Ex12Lista4 {

    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        int idade;
        double media = 0.0;
        int soma = 0;
        int contador = 0;
        int menor = Integer.MAX_VALUE; // Sempre o menor valor digitado
        int maior = Integer.MIN_VALUE; // Sempre o maior valor digitado

        while (true) {
            System.out.print("Digite a idade (ou 0 para encerrar) ");
            idade = in.nextInt();

            if (idade <= 0) {
                break;
            }

            soma += idade;
            contador++;

            if (idade < menor) {
                menor = idade;
            }
            if (idade > maior) {
                maior = idade;
            }
        }

        if (contador > 0) {
            media = soma / contador;
            System.out.println("Numero de pessoas: " + contador);
            System.out.println("Idade media: " + media);
            System.out.println("Menor idade: " + menor);
            System.out.println("Maior idade: " + maior);
        } else {
            System.out.println("Nenhuma idade valida foi informada.");
        }

        in.close();
    }
}