package br.com.roberto.igtidp.solid.dependencyInversion.datasource;

import br.com.roberto.igtidp.solid.dependencyInversion.entity.Livro;
import br.com.roberto.igtidp.solid.dependencyInversion.repository.LivroRepository;

import java.util.ArrayList;
import java.util.List;

public class LivroRepositoryImplSQL implements LivroRepository {
    @Override
    public List<Livro> obterLivros() {
        List<Livro> livroSql = new ArrayList<>();
        livroSql.add(new Livro(1L,"123","Usei Para SQL"));
        livroSql.add(new Livro(2L,"12345","SQL Melhor Banco"));
        System.out.println("Usei para SQL");
        return livroSql;
    }

    @Override
    public Livro adicionarLivro(Livro novoLivro) {
        System.out.println("Usei para SQL");
        return novoLivro;
    }
}
