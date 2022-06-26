package br.com.roberto.igtidp.creational.factorymethod.factory;

import br.com.roberto.igtidp.creational.factorymethod.model.Celular;
import br.com.roberto.igtidp.creational.factorymethod.model.SamsungX;

public class SamsungXCelularFactory extends CelularFactory {
    @Override
    protected final Celular createCelular() {
        return new SamsungX();
    }
}
