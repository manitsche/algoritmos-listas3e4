import java.util.Scanner;

public class Ex04Lista3 {

    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        int dist = 0;
        double gasto = 0.0;
        double resultado = 0.0;
        String saida = "";

        imprimir("Informe a distancia total percorrida (em Km):");
        dist = lerValorInteiro();
        imprimir("Informe o total de combustivel gasto (em l):");
        gasto = lerValorReal();

        resultado = calculaKmPorLitro(dist, gasto);

        saida = "Consumo medio do automovel: " + resultado + " km/l";
        imprimir(saida);
    }

    public static void imprimir(String texto) { 
        System.out.println(texto);
    }

    public static int lerValorInteiro() {
        int valor;
        valor = in.nextInt();
        return valor;
    } 

    public static double lerValorReal() {
        double valor;
        valor = in.nextDouble();
        return valor;
    }

    public static double calculaKmPorLitro(int dist, double gasto) {
        double resultado;
        resultado = dist / gasto;
        return resultado;
    }
}