import java.util.Scanner;

public class Ex05Lista3 {

    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        int numero = 0;
        String resultado = "";

        imprimir("Informe um numero:");
        numero = lerValorInteiro();

        resultado = verificaNumeral(numero);
        imprimir(resultado);
    }

    public static void imprimir(String texto) { 
        System.out.println(texto);
    } 

    public static int lerValorInteiro(){
        int valor;
        valor = in.nextInt();
        return valor;
    }

    public static String verificaNumeral(int numero) {
        if (numero == 0) {
            return "O numero informado e zero!";
        } else if (numero > 0) {
            return numero + " e um numero positivo";
        } else {
            return numero + " e um numero negativo";
        }
    }
}