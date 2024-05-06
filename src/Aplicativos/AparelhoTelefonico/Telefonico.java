package Aplicativos.AparelhoTelefonico;

public class Telefonico implements AparelhoTelefonico {
    public void ligar(){
        System.out.println("LIGANDO");
    }
    
    public void atender(){
        System.out.println("ATENDENDO");
    }

    public void iniciarCorreioVoz(){
        System.out.println("INICIANDO CORREIO DE VOZ");
    }
}
