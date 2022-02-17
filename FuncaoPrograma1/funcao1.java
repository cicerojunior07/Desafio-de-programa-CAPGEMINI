package FuncaoPrograma1;

public class funcao1{
    public void calculo(int numero) {
        int i, j;
        // laço de repetiçao que preencher a tela de saida com base no quantos de * e para aparecer em cada
        //linha
        for (i = 0; i < numero + 1; i++) {
            for (j = numero; j > 0; j--) {
                if (j > i) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.print("\n");
        }
    }
}

