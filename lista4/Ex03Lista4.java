import java.util.*;

public class Ex03Lista4 {

    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {

        int i = 1;
        int numero = 0;

        System.out.println("Digite o numero:");
        numero = in.nextInt();
        System.out.println();
    
        while (i < numero) {
            System.out.println(i);
            i++;
        }
    }
}