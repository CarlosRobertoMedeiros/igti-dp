package br.com.roberto.igtidp.solid.dependencyInversion.interactor;

import br.com.roberto.igtidp.solid.dependencyInversion.datasource.LivroRepositoryImplOracle;
import br.com.roberto.igtidp.solid.dependencyInversion.datasource.LivroRepositoryImplSQL;
import br.com.roberto.igtidp.solid.dependencyInversion.entity.Livro;
import br.com.roberto.igtidp.solid.dependencyInversion.repository.LivroRepository;
import br.com.roberto.igtidp.solid.dependencyInversion.transportlayer.dto.LivroDto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BibliotecaService {

    private final LivroRepository livroRepository;

//    private final BibliotecaMapper bibliotecaMapper = null;

    public BibliotecaService() {
        //this.livroRepository = new LivroRepositoryImplOracle();
        this.livroRepository = new LivroRepositoryImplSQL();
    }
    public List<LivroDto> obterLivros(){
        List<LivroDto> livrosDto = new ArrayList<>();
        livroRepository.obterLivros().stream().forEach(livro -> {
            livrosDto.add(new LivroDto(livro.getId(), livro.getIspb(), livro.getNome()));
        });
        return livrosDto;
    }

    public LivroDto adicionarLivro(LivroDto livroDto){
         Livro livro  = livroRepository.adicionarLivro(new Livro(livroDto.getId(), livroDto.getIspb(), livroDto.getNome()));
         return new LivroDto(livro.getId(), livro.getIspb(), livro.getNome()) ;
    }
}
