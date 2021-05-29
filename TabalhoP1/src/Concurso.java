import java.util.Arrays;
import java.util.Random;

public class Concurso {
    
    //sorteio -> random
    private static int[] gerarVetor(int TAM) {

        int[] vetor = new int[TAM];
        Random gerador = new Random();
    
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = gerador.nextInt(60) + 1;
        }
        return vetor;
        
    }
 
    public void aposta() {

        int[] v = gerarVetor(6);
		System.out.println(Arrays.toString(v));

    }     

}
