import LoopMenuJogo.LoopJogo;
import LoopMenuJogo.LoopMenu;
import SistemaPersonagem.Personagem;
import SistemaPersonagem.SistemaMensagem;
import SistemaPersonagem.Guerreiro;

public class Jogo {
    public static void main(String[] args) {
        
        
        SistemaMensagem sistema = new SistemaMensagem();
        LoopMenu loop = new LoopMenu(sistema);
        LoopJogo loopInicio = new LoopJogo(sistema);
        Guerreiro guerreiro = new Guerreiro();
       // p1.informacaoPersonagem();
       // int dano = p1.danoAleatorio();
        
        
       // sistema.exibirIntroducao();
       // loop.loopDoMenu();
       // loopInicio.LoopInicioJogo();

   
       guerreiro.informacaoPersonagem();
   
   
    }
}
