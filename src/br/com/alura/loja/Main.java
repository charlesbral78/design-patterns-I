package br.com.alura.loja;

import br.com.alura.loja.imposto.CalculadoraDeImpostos;

import br.com.alura.loja.imposto.Icms;
import br.com.alura.loja.imposto.Iss;
import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(new BigDecimal("100"), 1);
        CalculadoraDeImpostos calculadora = new CalculadoraDeImpostos();
        System.out.println(calculadora.calcular(orcamento, new Icms(null)));
        System.out.println(calculadora.calcular(orcamento, new Iss(null)));

    }
}