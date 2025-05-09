import java.util.Scanner;

public class Ex15Lista3 {

    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        int ano = 0;
        String resultado = "";

        imprimir("Informe o ano: ");
        ano = lerValorInteiro();

        resultado = verificaSeBissexto(ano);
        imprimir(resultado);
    }

   public static void imprimir(String texto) { 
        System.out.println(texto);
    } 

    public static int lerValorInteiro() {
        int valor;
        valor = in.nextInt();
        return valor;
    }

    // Para ser um ano bissexto deve ser divisível por 400 ou ser divisível por 4 e não ser divisível por 100
    public static String verificaSeBissexto(int ano) {
        if (ano % 400 == 0 || (ano % 4 == 0 && ano % 100 != 0)) {
            return ano + " e um ano bissexto";
        } else {
            return ano + " nao e um ano bissexto";
        }
    }
}