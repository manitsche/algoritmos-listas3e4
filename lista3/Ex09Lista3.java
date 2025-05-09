import java.util.Scanner;

public class Ex09Lista3 {

    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        double areaTrapezio = 0;
        double baseMaior = 0;
        double baseMenor = 0; 
        double altura = 0;

        imprimir("Informe a base maior do trapezio: ");
        baseMaior = lerValorReal();
        imprimir("Informe a base menor do trapezio: ");
        baseMenor = lerValorReal();
        imprimir("Informe a altura do trapezio: ");
        altura = lerValorReal();

        if (altura < 0 || baseMaior < 0 || baseMenor < 0) {
            imprimir("Valores invalidos informados");
        }

        areaTrapezio = calcularAreaTrapezio(baseMaior, baseMenor, altura);
        imprimir("A area do trapezio e: " + areaTrapezio);
    }

    public static void imprimir(String texto) { 
        System.out.println(texto);
    } 

    public static double lerValorReal() {
        double valor;
        valor = in.nextDouble();
        return valor;
    }

    public static double calcularAreaTrapezio(double baseMaior, double baseMenor, double altura) {
        double resultado;
        resultado = (baseMaior + baseMenor) * altura / 2;
        return resultado;
    }
}