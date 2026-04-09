interface Comando {
    void executar();
}

class ComandoSalvar implements Comando {
    @Override
    public void executar() {
        System.out.println("Salvando arquivo...");
    }
}

class ComandoAbrir implements Comando {
    @Override
    public void executar() {
        System.out.println("Abrindo arquivo...");
    }
}

class ComandoImprimir implements Comando {
    @Override
    public void executar() {
        System.out.println("Imprimindo arquivo...");
    }
}

class Botao {
    private Comando comando;

    public Botao(Comando comando) {
        this.comando = comando;
    }

    public void clicar() {
        comando.executar();
    }
}

class Atalho {
    private Comando comando;

    public Atalho(Comando comando) {
        this.comando = comando;
    }

    public void pressionar() {
        comando.executar();
    }
}

public class Command {
    public static void main(String[] args) {
        Comando salvar = new ComandoSalvar();
        Comando abrir = new ComandoAbrir();
        Comando imprimir = new ComandoImprimir();

        Botao botaoSalvar = new Botao(salvar);
        Botao botaoAbrir = new Botao(abrir);
        Botao botaoImprimir = new Botao(imprimir);

        Atalho atalhoSalvar = new Atalho(salvar);
        Atalho atalhoAbrir = new Atalho(abrir);
        Atalho atalhoImprimir = new Atalho(imprimir);

        botaoSalvar.clicar();
        botaoAbrir.clicar();
        botaoImprimir.clicar();

        atalhoSalvar.pressionar();
        atalhoAbrir.pressionar();
        atalhoImprimir.pressionar();
    }
}
