

public class Dispositivos implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {


    @Override
    public void tocar() {
        System.out.println("Tocando música...");
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada.");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando a música: " + musica);
    }


    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para: " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo chamada.");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz.");
    }


    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba no navegador.");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página.");
    }


    public static void main(String[] args) {
        Dispositivos meuIphone = new Dispositivos();

        System.out.println("--- Testando Reprodutor Musical ---");
        meuIphone.selecionarMusica("Bohemian Rhapsody");
        meuIphone.tocar();
        meuIphone.pausar();
        System.out.println("\n");

        System.out.println("--- Testando Aparelho Telefônico ---");
        meuIphone.ligar("11987654321");
        meuIphone.atender();
        meuIphone.iniciarCorreioVoz();
        System.out.println("\n");

        System.out.println("--- Testando Navegador na Internet ---");
        meuIphone.exibirPagina("https://www.dio.me");
        meuIphone.adicionarNovaAba();
        meuIphone.atualizarPagina();
    }
}
