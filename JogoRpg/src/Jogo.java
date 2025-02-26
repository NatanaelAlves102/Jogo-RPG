public class Jogo {
    public static void main(String[] args) {
        
        
        Personagem p1 = new Personagem("A", "Mago", 10, 5, 2);
        Sistema sistema = new Sistema();
        p1.informacaoPersonagem();

        int dano = p1.danoAleatorio();
        System.out.println("Dano: " + dano);
        
        sistema.exibirIntroducao();
        sistema.menuJogo();
        

   
   
   
   
   
    }
}
