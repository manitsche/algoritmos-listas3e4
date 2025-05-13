import java.util.Scanner;

public class Ex18Lista4 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double massaInicial;
        double massaFinal;
        int tempo = 0; // em segundos

        System.out.print("Informe a massa inicial (em gramas): ");
        massaInicial = in.nextDouble();
        massaFinal = massaInicial;

        while (massaFinal >= 0.05) {
            massaFinal = massaFinal / 2;
            tempo += 60; 
        }

        System.out.println("\nMassa final: " + massaFinal + " gramas");
        System.out.println("Tempo necessário: " + tempo + " segundos");

        in.close();
    }
}
