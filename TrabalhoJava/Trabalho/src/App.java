import java.io.IOException;

public class App {

    public static void limparTela() throws InterruptedException, IOException {
        
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
    }

    public static void main(String[] args) throws Exception  {
       
        limparTela();
        Concurso conc = new Concurso();        

        Aposta p1 = new Aposta();
       
        Apostador apostador = new Apostador("Adriano Henrique", 23, 1234567);
        apostador.mostrarDados();
        System.out.print("Sorteio: ");
        conc.aposta();
        System.out.println("Jogada do apostador: ");
        p1.addAposta();
        
    }
    
}
