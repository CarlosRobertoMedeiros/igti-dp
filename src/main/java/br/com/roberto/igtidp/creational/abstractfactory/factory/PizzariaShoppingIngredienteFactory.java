package br.com.roberto.igtidp.creational.abstractfactory.factory;

import br.com.roberto.igtidp.creational.abstractfactory.model.massa.BordaFina;
import br.com.roberto.igtidp.creational.abstractfactory.model.massa.BordaGrossa;
import br.com.roberto.igtidp.creational.abstractfactory.model.massa.Massa;
import br.com.roberto.igtidp.creational.abstractfactory.model.molho.Marinara;
import br.com.roberto.igtidp.creational.abstractfactory.model.molho.Molho;
import br.com.roberto.igtidp.creational.abstractfactory.model.molho.TomateAmeixa;
import br.com.roberto.igtidp.creational.abstractfactory.model.queijo.Cheddar;
import br.com.roberto.igtidp.creational.abstractfactory.model.queijo.Muzzarella;
import br.com.roberto.igtidp.creational.abstractfactory.model.queijo.Queijo;

public class PizzariaShoppingIngredienteFactory extends PizzaIngredienteFactory {
    @Override
    public Massa criarMassa() {
        return new BordaGrossa();
    }

    @Override
    public Queijo criarQueijo() {
        return new Muzzarella();
    }

    @Override
    public Molho criarMolho() {
        return new TomateAmeixa();
    }
}
