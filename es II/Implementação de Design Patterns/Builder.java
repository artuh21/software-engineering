import java.util.HashSet;
import java.util.Set;

class Pedido {
    private Set<String> dentroDaCaixa = new HashSet<>();
    private Set<String> foraDaCaixa = new HashSet<>();

    public void adicionarDentroDaCaixa(String item) {
        dentroDaCaixa.add(item);
    }

    public void adicionarForaDaCaixa(String item) {
        foraDaCaixa.add(item);
    }

    @Override
    public String toString() {
        StringBuilder buffer = new StringBuilder();
        buffer.append("Seu pedido:\n");
        buffer.append("Dentro da caixa:\n");
        for (String item : dentroDaCaixa) buffer.append("\t" + item + "\n");
        buffer.append("Fora da caixa:\n");
        for (String item : foraDaCaixa) buffer.append("\t" + item + "\n");
        buffer.append("\nTenha um bom dia!\n");
        return buffer.toString();
    }
}

class PedidoBuilder {
    private Pedido pedido = new Pedido();

    public PedidoBuilder adicionarHamburguer() {
        pedido.adicionarDentroDaCaixa("Hamburguer");
        return this;
    }

    public PedidoBuilder adicionarCheeseburger() {
        pedido.adicionarDentroDaCaixa("Cheeseburger");
        return this;
    }

    public PedidoBuilder adicionarBatataPequena() {
        pedido.adicionarDentroDaCaixa("Batata Pequena");
        return this;
    }

    public PedidoBuilder adicionarBatataMedia() {
        pedido.adicionarDentroDaCaixa("Batata Média");
        return this;
    }

    public PedidoBuilder adicionarBatataGrande() {
        pedido.adicionarDentroDaCaixa("Batata Grande");
        return this;
    }

    public PedidoBuilder adicionarCarrinho() {
        pedido.adicionarDentroDaCaixa("Carrinho");
        return this;
    }

    public PedidoBuilder adicionarBonequinha() {
        pedido.adicionarDentroDaCaixa("Bonequinha");
        return this;
    }

    public PedidoBuilder adicionarRefrigerante(String tipo) {
        pedido.adicionarForaDaCaixa(tipo);
        return this;
    }

    public Pedido build() {
        return pedido;
    }
}

class Funcionario {
    public void imprimirPedido(Pedido pedido) {
        System.out.println(pedido);
    }
}

public class Builder {
    public static void main(String[] args) {
        PedidoBuilder builder = new PedidoBuilder();

        Pedido pedido = builder
                .adicionarHamburguer()
                .adicionarBatataMedia()
                .adicionarCarrinho()
                .adicionarRefrigerante("Coca-Cola")
                .build();

        Funcionario funcionario = new Funcionario();
        funcionario.imprimirPedido(pedido);
    }
}
