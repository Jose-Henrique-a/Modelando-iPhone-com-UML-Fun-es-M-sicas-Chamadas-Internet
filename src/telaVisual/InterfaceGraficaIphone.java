package telaVisual;

import java.util.Scanner;
import aplicativos.ReprodutorMusical.ReprodutorMusical;
import aplicativos.aparelhoTelefonico.AparelhoTelefonico;
import aplicativos.iphoneCPU.Iphone;
import aplicativos.navegadorInternet.NavegadorInternet;

public class InterfaceGraficaIphone {
    public static void main(String[] args) {
        System.out.println(">>> IPhone inicializado! Bem-vindo! <<<");
        Scanner scanner = new Scanner(System.in);
        
        Iphone iphone = new Iphone();
        
        System.out.println("Deseja continuar usando seu IPhone? (1) Sim ou (2) Não");
        int op = scanner.nextInt();

        while (op == 1) {
            System.out.println("Escolha um aplicativo: (1) IPod, (2) Telefone, (3) Internet");
            int app = scanner.nextInt();
            
            if (app == 1) {
                ReprodutorMusical reprodutorMusical = iphone;
                System.out.println("Digite o número da opção (1) Tocar (2) Pausar (3) Selecionar musica: ");
                int opcao = scanner.nextInt();
                switch (opcao) {
                    case 1:
                        reprodutorMusical.tocar();
                        break;
                    case 2:
                        reprodutorMusical.pausar();
                        break;
                    case 3:
                        reprodutorMusical.selecionarMusica();
                        break;
                    default:
                        break;
                }
            }
            
            if (app == 2) {
                AparelhoTelefonico aparelhoTelefonico = iphone;
                System.out.println("Digite o número da opção (1) Ligar (2) Atender (3) Iniciar correio de voz: ");
                int opcao = scanner.nextInt();
                switch (opcao) {
                    case 1:
                        aparelhoTelefonico.ligar();
                        break;
                    case 2:
                        aparelhoTelefonico.atender();
                        break;
                    case 3:
                        aparelhoTelefonico.iniciarCorreioVoz();
                        break;
                    default:
                        break;
                }
            }
            
            if (app == 3) {
                NavegadorInternet navegadorInternet = iphone;
                System.out.println("Digite o número da opção (1) Exibir página (2) Adicionar nova aba (3) Atualizar página: ");
                int opcao = scanner.nextInt();
                switch (opcao) {
                    case 1:
                        navegadorInternet.exibirPagina();
                        break;
                    case 2:
                        navegadorInternet.adicionarNovaAba();
                        break;
                    case 3:
                        navegadorInternet.atualizarPagina();
                        break;
                    default:
                        break;
                }
            }

            System.out.println("Deseja continuar usando seu IPhone? (1) Sim ou (2) Não");
            op = scanner.nextInt();
        }

        System.out.println("Desligando IPhone. Até breve!");
        scanner.close();
    }
}
