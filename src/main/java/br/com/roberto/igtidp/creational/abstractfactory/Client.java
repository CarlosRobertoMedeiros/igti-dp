package br.com.roberto.igtidp.creational.abstractfactory;

import br.com.roberto.igtidp.creational.abstractfactory.factory.PizzariaBairroIngredienteFactory;
import br.com.roberto.igtidp.creational.abstractfactory.factory.PizzariaShoppingIngredienteFactory;
import br.com.roberto.igtidp.creational.abstractfactory.model.massa.Massa;
import br.com.roberto.igtidp.creational.abstractfactory.model.molho.Molho;
import br.com.roberto.igtidp.creational.abstractfactory.model.queijo.Queijo;

public class Client {
    public static void main(String[] args) {
        geraPizzaBairro();
        geraPizzaShopping();
    }

    private static void geraPizzaBairro() {
        PizzariaBairroIngredienteFactory pizzariaBairroIngredienteFactory = new PizzariaBairroIngredienteFactory();
        Massa  massa  = pizzariaBairroIngredienteFactory.criarMassa();
        Molho  molho  = pizzariaBairroIngredienteFactory.criarMolho();
        Queijo queijo = pizzariaBairroIngredienteFactory.criarQueijo();

        System.out.println("Pizzaria Bairro "
                +massa.getMassa()+" "
                +molho.getMolho()+" "
                +queijo.getQueijo()
                );
    }

    private static void geraPizzaShopping() {
        PizzariaShoppingIngredienteFactory pizzariaShoppingIngredienteFactory = new PizzariaShoppingIngredienteFactory();
        Massa  massa  = pizzariaShoppingIngredienteFactory.criarMassa();
        Molho  molho  = pizzariaShoppingIngredienteFactory.criarMolho();
        Queijo queijo = pizzariaShoppingIngredienteFactory.criarQueijo();

        System.out.println("Pizzaria Shopping "
                +massa.getMassa()+" "
                +molho.getMolho()+" "
                +queijo.getQueijo()
        );
    }
}
