package aplicativos.navegadorInternet;

public class Internet implements NavegadorInternet {

    @Override
    public void adicionarNovaAba() {
        System.out.println("Internet Adicionando nova aba.");        
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Internet Atualinzando pagina.");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Internet Exibindo pagina.");
    }
    
}
