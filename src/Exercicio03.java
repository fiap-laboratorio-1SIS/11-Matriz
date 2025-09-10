import java.text.DecimalFormat;
import java.util.Random;

public class Exercicio03 {
    public static void main(String[] args) {
        Random rd = new Random();
        double[][] temperatura = new double[3][6];
        DecimalFormat formato = new DecimalFormat("0.00º");
        double[] media = new double[temperatura.length];
        double aux;
        double maiorMedia = Double.MIN_VALUE;
        double menorMedia = Double.MAX_VALUE;
        int anoMaior = 0, anoMenor = 0;

        // gerando, armazenando e imprimindo os dados
        for(int i = 0; i < temperatura.length; i++) {
            aux = 0;
            for(int j = 0; j < temperatura[i].length; j++) {
                temperatura[i][j] = rd.nextDouble(5, 38);
                System.out.print(formato.format(temperatura[i][j]) + "\t");
                aux += temperatura[i][j];
            }
            System.out.println();
            media[i] = aux / temperatura[i].length;
            if(media[i] > maiorMedia) {
                maiorMedia = media[i];
                anoMaior = i;
            }
            if(media[i] < menorMedia) {
                menorMedia = media[i];
                anoMenor = i;
            }
        }

        // impressão da média de cada ano
        System.out.println();
        for(int i = 0; i < media.length; i++) {
            System.out.println("Ano " + (i + 1) + " --> " + formato.format(media[i]));
        }

        // impressão do ano com a maior e a menor média
        System.out.println("ano com a maior média de temperatura " + anoMaior);
        System.out.println("ano com a menor média de temperatura " + anoMenor);

    }
}
