package br.com.roberto.igtidp.solid.dependencyInversion.datasource;

import br.com.roberto.igtidp.solid.dependencyInversion.entity.Livro;
import br.com.roberto.igtidp.solid.dependencyInversion.repository.LivroRepository;

import java.util.ArrayList;
import java.util.List;

public class LivroRepositoryImplOracle implements LivroRepository {
    private static List<Livro> livroOracle = new ArrayList<>();
    public LivroRepositoryImplOracle() {
        if (livroOracle.size()<1)
            populaDados();
    }

    private void populaDados(){
        livroOracle.add(new Livro(1L,"123","Usei Para Oracle"));
        livroOracle.add(new Livro(2L,"12345","Oracle Melhor Banco"));
    }

    @Override
    public List<Livro> obterLivros() {
        return livroOracle;
    }

    @Override
    public Livro adicionarLivro(Livro novoLivro) {
        System.out.println("Usei para Oracle");
        livroOracle.add(novoLivro);
        return novoLivro;
    }
}
