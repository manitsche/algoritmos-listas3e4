
public class Ex17Lista4 {

    public static void main(String[] args) {

        int casa = 1;
        double graosNaCasa = 1; // começa com 1 grão
        double totalGraos = 0;

        System.out.println("Casa\tGraos na casa");

        while (casa <= 64) {
            System.out.println(casa + "\t" + (long)graosNaCasa);
            totalGraos += graosNaCasa;
            graosNaCasa *= 2;
            casa++;
        }

        System.out.println("\nTotal de graos recebidos pelo monge: " + (long)totalGraos);
    }
}
