import java.util.Scanner;

public class Ex13Lista3 {

    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        double peso = 0.0;
        double altura = 0.0;
        String saida = "";

        imprimir("Informe o peso da pessoa:");
        peso = lerValorReal();
        imprimir("Informe a altura da pessoa:");
        altura = lerValorReal();

        saida = classificaIMC(peso, altura);
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

    public static String classificaIMC(double peso, double altura) {
        double imc = 0.0;

        imc = peso / (altura * altura);

        if (imc < 18.5) {
            return "Abaixo do peso";
        } else if (imc >= 18.6 && imc <= 24.9) {
            return "Peso ideal";
        } else if (imc >= 25 && imc <= 29.9) {
            return "Peso em excesso";
        } else if (imc >= 30 && imc <= 34.9) {
            return "Obesidade Grau I";
        } else if (imc >= 35 && imc <= 39.9) {
            return "Obesidade Grau II (severa)";
        } else if (imc >= 40) {
            return "Obesidade Grau III (morbida)";
        } else {
            return "Valor invalido";
        }
    }
}