package br.com.roberto.igtidp.structural.adapter;

import java.math.BigDecimal;

public interface ProcessadorPagamento {
    void debitar(BigDecimal valor);
    void creditar(BigDecimal valor);
}
