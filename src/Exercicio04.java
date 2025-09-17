import java.text.DecimalFormat;
import java.util.Random;

public class Exercicio04 {
    public static void main(String[] args) {
        Random random = new Random();
        String[] produto = {"Eletrônicos", "Roupas", "Alimentos"};
        String[] mes = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho"};
        double[][] venda = new double[produto.length][mes.length];
        DecimalFormat df = new DecimalFormat("R$ #,##0.00");
        double total, maiorTotal = 0;
        int index = 0;

        // gerando as vendas
        for(int i = 0; i < venda.length; i++) {
            for(int j = 0; j < venda[i].length; j++) {
                venda[i][j] = random.nextDouble(2, 6);
                System.out.print(df.format(venda[i][j]) + "\t");
            }
            System.out.println();
        }

        // soma do total de vendas por categoria (produto)
        System.out.println("\nTotal de vendas por categoria");
        for(int i = 0; i < venda.length; i++) {
            total = 0;
            for(int j = 0; j < venda[i].length; j++) {
                total += venda[i][j];
            }
            System.out.println(produto[i] + " --> " + df.format(total));
        }

        // total de vendas por mês --> mês com a maior venda
        System.out.println("\nTotal de vendas por mês");
        for(int j = 0; j < mes.length; j++) {
            total = 0;
            for(int i = 0; i < venda.length; i++) {
                total += venda[i][j];
            }
            System.out.println(mes[j] + " --> " + df.format(total));
            if(total > maiorTotal) {
                maiorTotal = total;
                index = j;
            }
        }
        System.out.println("Mês com o maior total de vendas --> " + mes[index]);

    }
}
