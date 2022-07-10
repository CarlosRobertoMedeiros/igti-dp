package br.com.roberto.igtidp.solid.dependencyInversion.datasource;

import br.com.roberto.igtidp.solid.dependencyInversion.entity.Livro;
import br.com.roberto.igtidp.solid.dependencyInversion.repository.LivroRepository;

import java.util.ArrayList;
import java.util.List;

public class LivroRepositoryImplSQL implements LivroRepository {

    private static List<Livro> livroSQL = new ArrayList<>();
    public LivroRepositoryImplSQL() {
        if (livroSQL.size()<1)
            populaDados();
    }

    private void populaDados(){
        livroSQL.add(new Livro(1L,"123","Usei Para SQL"));
        livroSQL.add(new Livro(2L,"12345","SQL SQL"));
    }

    @Override
    public List<Livro> obterLivros() {
        return livroSQL;
    }

    @Override
    public Livro adicionarLivro(Livro novoLivro) {
        System.out.println("Usei para SQL");
        livroSQL.add(novoLivro);
        return novoLivro;
    }
}
