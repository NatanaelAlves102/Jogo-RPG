import LoopMenuJogo.LoopMenu;
import SistemaPersonagem.Personagem;
import SistemaPersonagem.SistemaMensagem;

public class Jogo {
<<<<<<< Updated upstream
    public static void main(String[] args) {
        
        
        Personagem p1 = new Personagem("A", "Mago", 10, 5, 2);
        SistemaMensagem sistema = new SistemaMensagem();
        LoopMenu loop = new LoopMenu(sistema);
                
        p1.informacaoPersonagem();
        int dano = p1.danoAleatorio();
        
        
        sistema.exibirIntroducao();
        loop.loopDoMenu();
        
=======
    public static void main(String[] args){
        
        Sistema mensagem = new Sistema;
        Personagem p1 = new Personagem("A", "Mago", 10, 5, 2);
   


        




        p1.informacaoPersonagem();


        //teste
        int dano = p1.danoAleatorio();
        System.out.println("Dano: " + dano);

        

>>>>>>> Stashed changes

   
   
   
   
   
    }
}
