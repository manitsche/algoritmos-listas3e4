import java.util.Scanner;

public class Ex10Lista3 {

    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        int idade = 0;
        String saida = "";

        imprimir("Informe a idade:");
        idade = lerValorInteiro();

        saida = classificaEleitor(idade);
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

    public static String classificaEleitor(int idade) {
        if (idade < 16) {
            return "Pessoa com " + idade + " anos e nao eleitor";
        } else if ((idade >= 16 && idade < 18) || idade > 65) {
            return "Pessoa com " + idade + " anos e eleitor facultativo";
        } else {
            return "Pessoa com " + idade + " anos e eleitor obrigatorio";
        }
    }
}