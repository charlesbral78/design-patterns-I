package br.com.alura.loja.pedido.acoes;

import br.com.alura.loja.pedido.Pedido;

public class SalvarPedidoBancoDados implements AcaoAposGerarPedido{

    public void executarAcao(Pedido pedido) {
        System.out.println("Salvando pedido no banco de dados!");
    }
}
