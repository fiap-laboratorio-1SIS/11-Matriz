import java.util.Random;

public class Exercicio02 {
    public static void main(String[] args) {
        Random rd = new Random();
        int[][] m = new int[5][5];
        int maior = 0;

        for(int i = 0; i < m.length; i++) {
            for(int j = 0; j < m.length; j++) {
                m[i][j] = rd.nextInt(10, 50);
                System.out.print(m[i][j] + "\t");
                if(m[i][j] > maior) {
                    maior = m[i][j];
                }
            }
            System.out.println();
        }
        System.out.println("maior valor = " + maior);

        // imprime a localização do maior valor
        for(int i = 0; i < m.length; i++) {
            for(int j = 0; j < m.length; j++) {
                if(m[i][j] == maior) {
                    System.out.println("(" + i + ", " + j + ")");
                }
            }
        }
    }
}
