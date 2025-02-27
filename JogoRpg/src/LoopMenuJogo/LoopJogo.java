package LoopMenuJogo;

import SistemaPersonagem.SistemaMensagem;

public class LoopJogo{

    private SistemaMensagem sistema;
    
    public LoopJogo(SistemaMensagem sistema){
        this.sistema = sistema;
    }


public void LoopInicioJogo(){
    
    int escolhaInicio;
    do {
    
    System.out.println(" ");


    escolhaInicio = new java.util.Scanner(System.in).nextInt();

}while(escolhaInicio !=0 );{}

}




}