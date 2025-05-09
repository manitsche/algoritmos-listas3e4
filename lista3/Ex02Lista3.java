import java.util.Scanner;

public class Ex02Lista3 {

    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        double cotacaoDolar = 0.0;
        double valorEmDolar = 0.0;
        double valorEmReais = 0.0;
        String saida = "";

        imprimir("Informe a cotacao atual do dolar:");
        cotacaoDolar = lerValorReal();
        imprimir("Informe o valor em dolar:");
        valorEmDolar = lerValorReal();

        valorEmReais = converterDolarEmReal(cotacaoDolar, valorEmDolar);

        saida = "O valor convertido em real e: "+ valorEmReais;
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

    public static double converterDolarEmReal(double cotacaoDolar, double valorEmDolar) {
        double resultado;
        resultado = cotacaoDolar * valorEmDolar;
        return resultado;
    }
}