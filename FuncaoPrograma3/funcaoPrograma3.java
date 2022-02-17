package FuncaoPrograma3;

import java.util.Arrays;
import java.util.HashMap;

public class funcaoPrograma3 {
    public int subString(String palavra){
        int i,j,NumeroDePares = 0,tamanho;
        //criar o mapa para gerar um historigrama no qual a chave sera a string e o valor correspodente
        //sera a frequencia de aparecimento
        HashMap<String, Integer> Hist= new HashMap<>();
        tamanho=palavra.length();
        for(i = 0; i < tamanho; i++){
            for(j = i; j < tamanho; j++){
                char []letra = palavra.substring(i, j+1).toCharArray();
                //ordena o vetor
                Arrays.sort(letra);
                //junta em uma string novamente
                String Chave = new String(letra);
                //realiza a criaçao de uma chave e um valor caso nao tenha sido criado anteriormente
                //se nao adiciona +1 no valor da frequencia simbolizando uma nova ocorrencia
                if (Hist.containsKey(Chave)) {
                    Hist.put(Chave, Hist.get(Chave) + 1);
                }
                else
                    Hist.put(Chave, 1);
            }
        }
        //verifica somente os pares de anagrama para soma
        for(String key: Hist.keySet()){
            int valorFinal = Hist.get(key);
            NumeroDePares += (valorFinal * (valorFinal-1))+NumeroDePares;
            NumeroDePares=NumeroDePares/2;
        }
        return NumeroDePares;
    }
}
