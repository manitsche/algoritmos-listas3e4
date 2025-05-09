import java.util.Scanner;

public class Ex06Lista3 {

    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        int numero = 0;
        String resultado = "";

        imprimir("Informe um numero: ");
        numero = lerValorInteiro();

        resultado = verificaParOuImpar(numero);
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

    public static String verificaParOuImpar(int numero) {
        if (numero > 0) {
            if (numero % 2 == 0) {
                return numero + " e par";
            } else {
                return numero + " e impar";
            }
        } else {
            return "Foi informado um numero menor que zero!";
        }          
    }
}