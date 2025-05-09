import java.util.Scanner;

public class Ex03Lista3 {

    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        double ladoA = 0.0;
        double ladoB = 0.0;
        double ladoC = 0.0;
        String saida = "";

        imprimir("Informe o valor do lado A:");
        ladoA = lerValorReal();
        imprimir("Informe o valor do lado B:");
        ladoB = lerValorReal();
        imprimir("Informe o valor do lado C:");
        ladoC = lerValorReal();
       
        if (eTriangulo(ladoA, ladoB, ladoC)) {
            saida = classificaTriangulo(ladoA, ladoB, ladoC);    
        } else {
            saida = "Os valores informados nao formam um triangulo";
        }

        imprimir(saida);
    }

    public static void imprimir(String texto){ 
        System.out.println(texto);
    } 

    public static double lerValorReal(){
        double valor;
        valor = in.nextDouble();
        return valor;
    }

    // Para ser um triangulo a soma de dois lados tem que ser maior que o terceiro
    public static boolean eTriangulo(double ladoA, double ladoB, double ladoC) {
          return (ladoA + ladoB > ladoC) 
          && (ladoA + ladoC > ladoB) 
          && (ladoB + ladoC > ladoA);
    }

    public static String classificaTriangulo(double ladoA, double ladoB, double ladoC) {
        if (ladoA == ladoB && ladoA == ladoC) {
            return "Os valores informados formam um triangulo equilatero";
        } else if (ladoA == ladoB || ladoA == ladoC || ladoB == ladoC) {
            return "Os valores informados formam um triangulo isoceles";
        } else {
            return "Os valores informados formam um triangulo escaleno";
        }
    }
}