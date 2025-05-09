import java.util.Scanner;

public class Ex07Lista3 {

    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        int valor1 = 0;
        int valor2 = 0;
        int valor3 = 0;
        String saida = "";

        imprimir("Informe o valor 1:");
        valor1 = lerValorInteiro();
        imprimir("Informe o valor 2:");
        valor2 = lerValorInteiro();
        imprimir("Informe o valor 3:");
        valor3 = lerValorInteiro();

        saida = descobrirMaior(valor1, valor2, valor3);
        imprimir(saida);
    }

    public static void imprimir(String texto){ 
        System.out.println(texto);
    } 

    public static int lerValorInteiro(){
        int valor;
        valor = in.nextInt();
        return valor;
    }

    public static String descobrirMaior(int valor1, int valor2, int valor3) {
        int maior;

        if (valor1 >= valor2 && valor1 >= valor3) {
            maior = valor1;
        } else if (valor2 >= valor1 && valor2 >= valor3) {
            maior = valor2;
        } else {
            maior = valor3;
        }

        return "O maior valor e: " + maior;
    }
}