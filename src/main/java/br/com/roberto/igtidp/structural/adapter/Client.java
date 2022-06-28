package br.com.roberto.igtidp.structural.adapter;

import java.math.BigDecimal;

public class Client {
    public static void main(String[] args) {
        ProcessadorPagamento processadorPagamento = new MeuPagamentoCreditoAdapter();
        processadorPagamento.debitar(new BigDecimal(100));
    }
}
