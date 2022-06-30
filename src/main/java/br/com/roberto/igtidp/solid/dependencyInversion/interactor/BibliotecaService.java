package br.com.roberto.igtidp.solid.dependencyInversion.interactor;

import br.com.roberto.igtidp.solid.dependencyInversion.entity.Biblioteca;
import br.com.roberto.igtidp.solid.dependencyInversion.entity.Livro;
import br.com.roberto.igtidp.solid.dependencyInversion.datasource.LivroRepositoryImplOracle;
import br.com.roberto.igtidp.solid.dependencyInversion.repository.LivroRepository;
import br.com.roberto.igtidp.solid.dependencyInversion.transportlayer.dto.LivroDto;
import br.com.roberto.igtidp.solid.dependencyInversion.transportlayer.mapper.BibliotecaMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BibliotecaService {

    private final LivroRepository livroRepository;
    private final List<LivroDto> livrosDto = new ArrayList<>();
    private final BibliotecaMapper bibliotecaMapper = null;

    public BibliotecaService() {
        this.livroRepository = new LivroRepositoryImplOracle();
    }
    public List<LivroDto> obterLivros(){
        livroRepository.obterLivros().stream().forEach((livro)->{
            livrosDto.add(new LivroDto(livro.getId(), livro.getIspb(), livro.getNome()));
        });
        return livrosDto;
    }

    public LivroDto adicionarLivro(LivroDto livroDto){
         Livro livro  = livroRepository.adicionarLivro(new Livro(livroDto.getId(), livroDto.getIspb(), livroDto.getNome()));
         return bibliotecaMapper.ToLivroDTO(livro);
    }
}
