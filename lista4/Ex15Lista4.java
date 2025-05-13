import java.util.*;

public class Ex15Lista4 {

    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        int idade = 0;
        char ensino;
        int contTecnico = 0;
        int contSuperior = 0;
        int faixaEtaria18a35 = 0;

        while (true) {
            System.out.print("Informe a idade do estudante (0 ou menos para encerrar): ");
            idade = in.nextInt();

            if (idade <= 0) {
                break; 
            }

            System.out.print("Informe o ensino ('T' para Tecnico, 'S' para Superior): ");
            ensino = in.next().toUpperCase().charAt(0);

            if (ensino == 'T') {
                contTecnico++;
            } else if (ensino == 'S') {
                contSuperior++;
            } else {
                System.out.println("Tipo de ensino invalido. Ignorado.");
            }

            if (idade >= 18 && idade <= 35) {
                faixaEtaria18a35++;
            }
            System.out.println(); //
        }

        System.out.println("RESULTADOS:");
        System.out.println("Total de alunos do ensino técnico: " + contTecnico);
        System.out.println("Total de alunos do ensino superior: " + contSuperior);
        System.out.println("Total de alunos com idade entre 18 e 35 anos: " + faixaEtaria18a35);
        in.close();
    }
}