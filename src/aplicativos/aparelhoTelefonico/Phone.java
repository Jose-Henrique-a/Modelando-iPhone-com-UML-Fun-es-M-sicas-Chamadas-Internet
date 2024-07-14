package aplicativos.aparelhoTelefonico;

public class Phone implements AparelhoTelefonico {

    @Override
    public void atender() {
    System.out.println("Phone Atender chamada.");        
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Phone Iniciando correio de voz.");
    }

    @Override
    public void ligar() {
        System.out.println("Phone Chamando...");
    }
    


    
}
