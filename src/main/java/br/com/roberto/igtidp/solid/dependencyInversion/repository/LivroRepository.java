package br.com.roberto.igtidp.solid.dependencyInversion.repository;

import br.com.roberto.igtidp.solid.dependencyInversion.entity.Livro;

import java.util.List;

public interface LivroRepository {
    List<Livro> obterLivros();
    Livro adicionarLivro(Livro novoLivro);
}
