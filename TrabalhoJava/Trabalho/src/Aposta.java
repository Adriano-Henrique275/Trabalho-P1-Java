import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Aposta {
    
    public int addAposta() {
        
        List<Integer> numeros = new ArrayList<>();

        for(int i = 1; i <= 60; i++){
            numeros.add(i);
        }      

        Collections.shuffle(numeros);

        List<Integer> escolhidos = numeros.subList(0, 6);

        Collections.sort(escolhidos);

        for(Integer escolhido : escolhidos){
            
            System.out.print(escolhido + ", ");  
        }

        return 0;
    }
   
    public void addApostador(Object object) throws Exception {
        
        Apostador novoApostador = new Apostador("nome teste", 23, 515267);
        
        novoApostador.mostrarDados();
    }

    
}
