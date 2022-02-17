import FuncaoPrograma1.funcao1;

import java.util.Scanner;

public class Programa1 {
    public static void main(String[] args) {
        int numero;
        System.out.println("Digite o numero");
        Scanner leitura= new Scanner(System.in);
        numero= leitura.nextInt();
        funcao1 resultado= new funcao1();
        resultado.calculo(numero);
    }
}
