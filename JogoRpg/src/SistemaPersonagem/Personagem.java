package SistemaPersonagem;
import java.util.Random;

public class Personagem {
    
      Random random = new Random();

   
    //Criação dos Personagem
    private final String personagem;
    private final String classeDoPersonagem;
    private final int vidaPersonagem;
    private final int danoMax;
    private final int danoMin;


    //Metado para simplicificar a criação dos personagem 
    public Personagem(String personagem, String classeDoPersonagem, int vidaPersonagem, int danoMax, int danoMin){
        this.personagem = personagem;
        this.classeDoPersonagem = classeDoPersonagem;
        this.vidaPersonagem = vidaPersonagem;
        this.danoMax = danoMax;
        this.danoMin = danoMin;

    }
   
    //Informação sobre os Personagem
    public void informacaoPersonagem(){
        System.out.println("Nome: " + personagem);
        System.out.println("Classe: " + classeDoPersonagem);
        System.out.println("Vida: " + vidaPersonagem);
        System.out.println("Dano Maximo: " + danoMax);
        System.out.println("Dano Minino: " + danoMin);
    }

    
   
    public int danoAleatorio() {
    
        return random.nextInt(this.danoMax - this.danoMin + 1) + danoMin;
    }



    
}