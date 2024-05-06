package Iphone;

import java.util.Scanner;
import Aplicativos.AparelhoMultiFuncao.AparelhoMultiFuncao;

public class Iphone {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        AparelhoMultiFuncao apm = new AparelhoMultiFuncao();

        System.out.println("Escolha qual aplicativo deseja utilizar:");
        System.out.println("1. Aparelho telefonico");
        System.out.println("2. Navegador de internet");
        System.out.println("3. Reprodutor musical");

        boolean iphoneLigado = true;

        while (iphoneLigado) {

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    apm.ligar();
                    apm.atender();
                    apm.iniciarCorreioVoz();
                    break;

                case 2:
                    apm.exibirPagina();
                    apm.adicionarNovaAba();
                    apm.atualizarPagina();
                    break;

                case 3:
                    apm.tocar();
                    apm.pausar();
                    apm.selecionarMusica();
                    break;

                default:
                    break;
            }
        }
        scanner.close();
    }
}
