import java.util.Random;

public class Exercicio06 {
    public static void main(String[] args) {
        Random random = new Random();
        int linha_a = random.nextInt(2, 5);
        int coluna_a = random.nextInt(2, 5);
        int linha_b = coluna_a;
        int coluna_b = random.nextInt(2, 5);

        int[][] a = new int[linha_a][coluna_a];
        int[][] b = new int[linha_b][coluna_b];
        int[][] c = new int[linha_a][coluna_b];
        int aux;

        // geração e impressão da matriz A
        System.out.println("Matriz A:");
        for(int i = 0; i < linha_a; i++) {
            for(int j = 0; j < coluna_a; j++) {
                a[i][j] = random.nextInt(4);
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }

        // geração e impressão da matriz B
        System.out.println("Matriz B:");
        for(int i = 0; i < linha_b; i++) {
            for(int j = 0; j < coluna_b; j++) {
                b[i][j] = random.nextInt(4);
                System.out.print(b[i][j] + "\t");
            }
            System.out.println();
        }

        // multiplicação entre as matrizes A e B
        for(int i = 0; i < linha_a; i++) {
            for(int j = 0; j < coluna_b; j++) {
                aux = 0;
                for(int k = 0; k < coluna_a; k++) {
                    aux += a[i][k] * b[k][j];
                }
                c[i][j] = aux;
            }
        }

        // impressão da matriz C
        System.out.println("Matriz C:");
        for(int i = 0; i < linha_a; i++) {
            for(int j = 0; j < coluna_b; j++) {
                System.out.print(c[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
