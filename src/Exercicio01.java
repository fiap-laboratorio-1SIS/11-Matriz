import java.util.Random;

public class Exercicio01 {
    public static void main(String[] args) {
        Random rd = new Random();
        int[][] m = new int[4][4];
        int dp = 0, ds = 0;

        // ler os dados
        for(int i = 0; i < m.length; i++) {
            for(int j = 0; j < m[i].length; j++) {
                m[i][j] = rd.nextInt(2, 30);
                System.out.print(m[i][j] + "\t");

                // verifica se estou na diagonal principal
                if(i == j) {
                    dp += m[i][j];
                }
                // verifica se estou na diagonal secundária
                if(i + j == m.length - 1) {
                    ds += m[i][j];
                }
            }
            System.out.println();
        }

        System.out.println("\nSoma da diagonal principal = " + dp);
        System.out.println("Soma da diagonal secundária = " + ds);
    }
}
