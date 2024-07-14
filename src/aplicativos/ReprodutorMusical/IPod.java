package aplicativos.ReprodutorMusical;

public class IPod implements ReprodutorMusical{

    @Override
    public void pausar() {
        System.out.println("Ipod Musica pausada.");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Ipod Selecionando musicas.");
    }

    @Override
    public void tocar() {
        System.out.println("Ipod Tocando musica.");
    }
}
