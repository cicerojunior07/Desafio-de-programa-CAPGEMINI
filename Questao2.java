import FuncaoPrograma2.funcao2;

import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {
        int resultado2;
        String senha;
        System.out.println("Digite a senha");
        Scanner leitura = new Scanner(System.in);
        senha = leitura.nextLine();
        funcao2 fc2= new funcao2();
        resultado2=fc2.calculo2(senha);
        System.out.println(resultado2);
    }
}
