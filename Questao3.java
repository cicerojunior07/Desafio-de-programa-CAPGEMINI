import FuncaoPrograma3.funcaoPrograma3;
import java.util.Scanner;
public class Questao3 {
    public static void main(String[] args) {
        String palavra;
        int Pares;
        funcaoPrograma3 anagrama =new funcaoPrograma3();
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite a Palavra");
        palavra=leitura.nextLine();
        Pares=anagrama.subString(palavra);
        System.out.println(Pares);
    }
}




