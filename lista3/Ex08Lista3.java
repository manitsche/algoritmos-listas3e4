import java.util.Scanner;

public class Ex08Lista3 {

    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        int numero = 0;
        String saida = "";

        imprimir("Informe o numero:");
        numero = lerValorInteiro();

        saida = diaDaSemana(numero);
        imprimir(saida);
    }

    public static void imprimir(String texto) { 
        System.out.println(texto);
    } 

    public static int lerValorInteiro(){
        int valor;
        valor = in.nextInt();
        return valor;
    }

    public static String diaDaSemana(int numero) {
        if (numero == 1) {
            return "Domingo";
        } else if (numero == 2) {
            return "Segunda-feira";
        } else if (numero == 3) {
            return "Terça-feira";
        } else if (numero == 4) {
            return "Quarta-feira";
        } else if (numero == 5) {
            return "Quinta-feira";
        } else if (numero == 6) {
            return "Sexta-feira";
        } else if (numero == 7) {
            return "Sabado";
        } else {
            return "Numero invalido";
        }
    }
}