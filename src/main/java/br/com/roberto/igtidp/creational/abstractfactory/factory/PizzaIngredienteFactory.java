package br.com.roberto.igtidp.creational.abstractfactory.factory;

import br.com.roberto.igtidp.creational.abstractfactory.model.massa.Massa;
import br.com.roberto.igtidp.creational.abstractfactory.model.molho.Molho;
import br.com.roberto.igtidp.creational.abstractfactory.model.queijo.Queijo;

public abstract class PizzaIngredienteFactory {

    public abstract Massa criarMassa();
    public abstract Queijo criarQueijo();
    public abstract Molho criarMolho();
}
