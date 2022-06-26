package br.com.roberto.igtidp.creational.factorymethod;

import br.com.roberto.igtidp.creational.factorymethod.factory.SamsungXCelularFactory;
import br.com.roberto.igtidp.creational.factorymethod.model.Celular;

public class Client {
    public static void main(String[] args) {
        SamsungXCelularFactory samsungXCelularFactory = new SamsungXCelularFactory();
        Celular celular = samsungXCelularFactory.generate();
        System.out.println(celular.getPreco());
    }
}
