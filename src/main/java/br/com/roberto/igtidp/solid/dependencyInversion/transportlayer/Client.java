package br.com.roberto.igtidp.solid.dependencyInversion.transportlayer;


import br.com.roberto.igtidp.solid.dependencyInversion.interactor.BibliotecaService;

public class Client {

    public static void main(String[] args) {
        BibliotecaService bibliotecaService = new BibliotecaService();
        bibliotecaService.obterLivros();
    }
}
