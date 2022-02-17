package FuncaoPrograma2;

public class funcao2 {

    public int calculo2(String senha){
        char letra;
        int []cont={1,1,1,1};
        String texto1="!@#$%^&*()-+";
        int i,soma=0,resultado,tamanho;
        tamanho = senha.length();
        //verificar se a senha dada tem a ocorrencia pelo menos uma vez dos criterios pedidos
        for(i=0;i<tamanho;i++){
            letra=senha.charAt(i);
            if('A'<=letra && letra<='Z'){
                cont[0]=0;
            }
            if('a'<=letra && letra<='z'){
                cont[1]=0;
            }
            if('0'<=letra && letra<='9'){
                cont[2]=0;
            }
            if(texto1.indexOf(letra)>= 0){
                cont[3]=0;
            }

        }
        for(i=0;i<4;i++){
            soma=soma+cont[i];
        }
        //verifica quantos caracteres que devem ser adicionados
        tamanho=6-tamanho;
        resultado = Math.max(tamanho, soma);
        return resultado;
    }
}
