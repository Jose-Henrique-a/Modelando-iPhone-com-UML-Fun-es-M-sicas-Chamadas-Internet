package aplicativos.iphoneCPU;

import aplicativos.ReprodutorMusical.ReprodutorMusical;
import aplicativos.aparelhoTelefonico.AparelhoTelefonico;
import aplicativos.navegadorInternet.NavegadorInternet;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical{

    @Override
    public void atender() {
        // TODO Auto-generated method stub
        System.out.println("Iphone atendendo.");

    }

    @Override
    public void iniciarCorreioVoz() {
        // TODO Auto-generated method stub
        System.out.println("Iphone iniciando correio de voz.");

    }

    @Override
    public void ligar() {
        // TODO Auto-generated method stub
        System.out.println("Iphone lingando.");

    }

    @Override
    public void adicionarNovaAba() {
        // TODO Auto-generated method stub
        System.out.println("Iphone adicionado nova.");

    }

    @Override
    public void atualizarPagina() {
        // TODO Auto-generated method stub
        System.out.println("Iphone atualizando pagina.");

    }

    @Override
    public void exibirPagina() {
        // TODO Auto-generated method stub
        System.out.println("Iphone exibir página.");

    }

    @Override
    public void pausar() {
        // TODO Auto-generated method stub
        System.out.println("Iphone musica pausada.");

    }

    @Override
    public void selecionarMusica() {
        // TODO Auto-generated method stub
        System.out.println("Iphone selecionando musica.");
    }

    @Override
    public void tocar() {
        // TODO Auto-generated method stub
        System.out.println("Iphone tocando musica.");

    }

 
}