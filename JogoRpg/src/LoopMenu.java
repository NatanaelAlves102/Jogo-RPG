public class LoopMenu{

    private SistemaMensagem sistema;
    
    public LoopMenu(SistemaMensagem sistema){
        this.sistema = sistema;
    }

public void loopDoMenu(){
 int escolha;
    do {
        System.out.println("***----------------------------------------------------***");
        System.out.println("                  1-Iniciar o Jogo!                       ");
        System.out.println("***----------------------------------------------------***");
        System.out.println("                  2-Descrição do Jogo                     ");
        System.out.println("***----------------------------------------------------***");
        System.out.println("                  3-Crétidos do Jogo                      ");
        System.out.println("***----------------------------------------------------***");
        System.out.println("                  0-Sair do Jogo                          ");
        System.out.println("***----------------------------------------------------***");
        escolha = new java.util.Scanner(System.in).nextInt();

        switch(escolha){
            case 1:

            sistema.mapaGeral();
            break;
            case 2:
            System.out.println("===============================");
            System.out.println("  Jogo desenvolvido por Natanael!");
            System.out.println("      Com ajuda do ChatGPT! 😆");
            System.out.println("===============================");

            break;
            case 3:

            sistema.mapaGeral();
            break;
            case 0:
            System.out.println("Saindo do Jogo.....");

            break;
            default:
            System.out.println("Opção Invalida.");
        }

    }while (escolha != 0);{}
    }
}

