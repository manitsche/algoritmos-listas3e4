import java.util.*;

public class Ex16Lista4 {

    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        int votosCandidato1 = 0;
        int votosCandidato2 = 0;
        int totalVotos = 0;
        int voto = 0;

        System.out.println("Eleicao para presidente do gremio estudantil - IFPR Cascavel");
        System.out.println("Digite 1 para votar no Candidato 1");
        System.out.println("Digite 2 para votar no Candidato 2\n");

        while (totalVotos < 305) {
            System.out.print("Digite o voto do aluno " + (totalVotos + 1) + ": ");
            voto = in.nextInt();

            if (voto == 1) {
                votosCandidato1++;
                totalVotos++;
            } else if (voto == 2) {
                votosCandidato2++;
                totalVotos++;
            } else {
                System.out.println("Voto invalido! Digite apenas 1 ou 2.\n");
            }
        }

        System.out.println("\nRESULTADO FINAL:");
        System.out.println("Total de votos para Candidato 1: " + votosCandidato1);
        System.out.println("Total de votos para Candidato 2: " + votosCandidato2);

        if (votosCandidato1 > votosCandidato2) {
            System.out.println("Candidato 1 foi o vencedor!");
        } else if (votosCandidato2 > votosCandidato1) {
            System.out.println("Candidato 2 foi o vencedor!");
        } else {
            System.out.println("A eleicao terminou empatada!");
        }

        in.close();
    }
}