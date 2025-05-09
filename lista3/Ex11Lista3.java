import java.util.Scanner;

public class Ex11Lista3 {

    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        String nome = "";
        double nota1 = 0.0;
        double nota2 = 0.0;
        double nota3 = 0.0;
        String saida = "";

        imprimir("Informe o nome do aluno:");
        nome = lerTexto();
        imprimir("Informe a primeira nota:");
        nota1 = lerValorReal();
        imprimir("Informe a segunda nota:");
        nota2 = lerValorReal();
        imprimir("Informe a terceira nota:");
        nota3 = lerValorReal();

        saida = calculaMedia(nome, nota1, nota2, nota3);
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

    public static String lerTexto() {
        String texto;
        texto = in.nextLine();
        return texto;
    }

    public static String calculaMedia(String nome, double nota1, double nota2, double nota3) {
        double media = 0.0;
        media = (nota1 + nota2 + nota3) / 3;

        if (media >= 90) {
            return "Aluno: " + nome + ". Conceito final: A - Aprovado";
        } else if (media >= 75 && media < 90) {
            return "Aluno: " + nome + ". Conceito final: B - Aprovado";
        } else if (media >= 60 && media < 75) {
            return "Aluno: " + nome + ". Conceito final: C - Aprovado";
        } else if (media >= 40 && media < 60) {
            return "Aluno: " + nome + ". Conceito final: D - Reprovado";
        } else {
            return "Aluno: " + nome + ". Conceito final: E - Reprovado";
        }
    }
}