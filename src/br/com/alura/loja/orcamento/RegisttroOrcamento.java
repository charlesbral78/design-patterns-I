package br.com.alura.loja.orcamento;

import br.com.alura.loja.DomainException;
import br.com.alura.loja.http.HttpAdapter;

import java.util.Map;

public class RegisttroOrcamento {

    private HttpAdapter http;

    public RegisttroOrcamento(HttpAdapter http) {
        this.http = http;
    }

    public void registrar(Orcamento orcamento) {
        // Chamada HTTP para API externa
        // URL Connection
        // Http Client
        // lib Rest
        if (!orcamento.isFinalizado()) {
            throw new DomainException("Orcamento nao finalizado!");

            String url = "http://api.externa/orcamento";
            Map<String, Object> dados = Map.of(
                    "valor", orcamento.getValor(),
                    "quantidadeItens", orcamento.getQuantidadeItens()
            );
            http.post(url, dados);
        }
    }
}
