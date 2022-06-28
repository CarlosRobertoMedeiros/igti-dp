package br.com.roberto.igtidp.structural.adapter;

import java.math.BigDecimal;

public class MeuPagamentoCreditoAdapter extends SdkPagamentoCreditoAdaptado implements ProcessadorPagamento {

    @Override
    public void debitar(BigDecimal valor) {
        super.autorizar(valor);
        super.capturar(valor);
    }

    @Override
    public void creditar(BigDecimal valor) {
        super.creditar(valor);
    }
}
