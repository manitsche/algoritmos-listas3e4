import java.util.Scanner;

public class Ex14Lista3 {

    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        int idade = 0;
        double tempoDeServico = 0.0;
        String resultado = "";

        imprimir("Informe a idade do trabalhador: ");
        idade = lerValorInteiro();
        imprimir("Informe o tempo de servico do trabalhador (em anos): ");
        tempoDeServico = lerValorReal();

        resultado = podeSeAposentar(idade, tempoDeServico);
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

    public static double lerValorReal() {
        double valor;
        valor = in.nextDouble();
        return valor;
    }

    public static String podeSeAposentar(int idade, double tempoDeServico) {
        if (idade >= 65 || tempoDeServico >= 30 || (idade >= 60 && tempoDeServico >= 25)) {
            return "O trabalhador pode se aposentar";
        } else {
            return "O trabalhador ainda nao pode se aposentar";
        }
    }
}