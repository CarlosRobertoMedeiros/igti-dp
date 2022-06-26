package br.com.roberto.igtidp.creational.factorymethod.factory;

import br.com.roberto.igtidp.creational.factorymethod.model.Celular;

public abstract class CelularFactory {
    public Celular generate() {
        Celular dispositivo = null;
        dispositivo = createCelular();
        return dispositivo;
    }

    protected abstract Celular createCelular();
}
