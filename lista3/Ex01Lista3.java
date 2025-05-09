import java.util.Scanner;

public class Ex01Lista3 {

    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        double alturaAndares = 0.0;
        int qntAndares = 0;
        double alturaPredio = 0.0;
        String saida = "";

        imprimir("Informe a altura dos andares");
        alturaAndares = lerValorReal();
        imprimir("Informe a quantidade de andares");
        qntAndares = lerValorInteiro();

        alturaPredio = calcularAlturaPredio(alturaAndares, qntAndares);

        saida = "A altura do predio e "+ alturaPredio;
        imprimir(saida);
    }

    public static void imprimir(String texto) { 
        System.out.println(texto);
    } 

    public static double lerValorReal() {
        double valor;
        valor = in.nextDouble();
        return valor;
    }

    public static int lerValorInteiro() {
        int valor;
        valor  = in.nextInt();
        return valor;
    }

    public static double calcularAlturaPredio(double alturaAndares, int qntAndares) {
        double resultado;
        resultado = alturaAndares * qntAndares;
        return resultado;
    }
}