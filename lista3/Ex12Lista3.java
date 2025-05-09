import java.util.Scanner;

public class Ex12Lista3 {

    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        int idade = 0;
        String saida = "";

        imprimir("Informe a idade do nadador:");
        idade = lerValorInteiro();
    
        saida = categorizaNadador(idade);
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

    public static String categorizaNadador(int idade) {
        if (idade >= 3 && idade <= 5) {
            return "Nadador apto a categoria Infantil A";
        } else if (idade >= 6 && idade <= 9) {
            return "Nadador apto a categoria Infantil B";
        } else if (idade >= 10 && idade <= 13) {
            return "Nadador apto a categoria Juvenil A";
        } else if (idade >= 14 && idade <= 17) {
            return "Nadador apto a categoria Juvenil B";
        } else if (idade >= 18) {
            return "Nadador apto a categoria Senior";
        } else {
            return "Idade invalida";
        }
    }
}