package br.com.roberto.igtidp.solid.dependencyInversion.entity;

import br.com.roberto.igtidp.solid.dependencyInversion.repository.LivroRepository;

import java.util.List;

public class Biblioteca {

    private LivroRepository livrodb;

    public Biblioteca(LivroRepository livrodb) {
        this.livrodb = livrodb;
    }

    public List<Livro> obterLivros(){
        return livrodb.obterLivros();
    }

    public void adicionarLivros(Livro livro){
        this.livrodb.adicionarLivro(livro);
    }

}
