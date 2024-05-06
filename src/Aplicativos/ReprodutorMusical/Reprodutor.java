package Aplicativos.ReprodutorMusical;

public class Reprodutor implements ReprodutorMusical {
    public void tocar(){
        System.out.println("TOCANDO");
    }
    
    public void pausar(){
        System.out.println("PAUSANDO");
    }

    public void selecionarMusica(){
        System.out.println("SELECIONANDO MUSICA");
    }
}
