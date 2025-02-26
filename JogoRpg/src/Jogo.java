public class Jogo {
    public static void main(String[] args) {
        
        
        Personagem p1 = new Personagem("A", "Mago", 10, 5, 2);
        SistemaMensagem sistema = new SistemaMensagem();
        LoopMenu loop = new LoopMenu(sistema);
                
        p1.informacaoPersonagem();
        int dano = p1.danoAleatorio();
        
        
        sistema.exibirIntroducao();
        loop.loopDoMenu();
        

   
   
   
   
   
    }
}
