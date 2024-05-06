package Aplicativos.AparelhoMultiFuncao;

import Aplicativos.AparelhoTelefonico.AparelhoTelefonico;
import Aplicativos.NavegadorDeInternet.NavegadorDeInternet;
import Aplicativos.ReprodutorMusical.ReprodutorMusical;

public class AparelhoMultiFuncao implements AparelhoTelefonico, NavegadorDeInternet, ReprodutorMusical {

    public void ligar(){
        System.out.println("LIGANDO");
    }

    public void atender(){
        System.out.println("ATENDENDO");
    }

    public void iniciarCorreioVoz(){
        System.out.println("INICIANDO CORREIO DE VOZ");
    }

    public void exibirPagina(){
        System.out.println("EXIBINDO PAGINA");
    }

    public void adicionarNovaAba(){
        System.out.println("ADICIONANDO NOVA ABA");
    }

    public void atualizarPagina(){
        System.out.println("ATUALIZANDO PAGINA");
    }
    
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
