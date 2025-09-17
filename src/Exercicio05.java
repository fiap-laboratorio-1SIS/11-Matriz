import java.util.Random;
import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int totalLinha, totalColuna;

        System.out.print("Total de linhas --> ");
        totalLinha = sc.nextInt();
        System.out.print("Total de colunas --> ");
        totalColuna = sc.nextInt();

        int[][] m = new int[totalLinha][totalColuna];
        int[][] mt = new int[totalColuna][totalLinha];

        // gerar e imprimir a matriz m
        for(int i = 0; i < m.length; i++) {
            for(int j = 0; j < m[i].length; j++) {
                m[i][j] = random.nextInt(15);
                mt[j][i] = m[i][j];
                System.out.print(m[i][j] + "\t");
            }
            System.out.println();
        }

        // impressão da matriz transposta
        System.out.println();
        for(int i = 0; i < mt.length; i++) {
            for(int j = 0; j < mt[i].length; j++) {
                System.out.print(mt[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
