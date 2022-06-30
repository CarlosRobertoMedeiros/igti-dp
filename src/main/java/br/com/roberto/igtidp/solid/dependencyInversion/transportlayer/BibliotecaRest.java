package br.com.roberto.igtidp.solid.dependencyInversion.transportlayer;

import br.com.roberto.igtidp.solid.dependencyInversion.interactor.BibliotecaService;
import br.com.roberto.igtidp.solid.dependencyInversion.transportlayer.dto.LivroDto;
import br.com.roberto.igtidp.solid.dependencyInversion.transportlayer.mapper.BibliotecaMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/biblioteca")
public class BibliotecaRest {

    private BibliotecaService bibliotecaService;

    public BibliotecaRest(BibliotecaService bibliotecaService) {
        this.bibliotecaService = bibliotecaService;
    }

    @GetMapping(value = "/livros")
    public ResponseEntity<List<LivroDto>> obterLivros(){
        List<LivroDto> livros = bibliotecaService.obterLivros();
        if (livros==null){
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
        }
        return ResponseEntity.status(HttpStatus.OK).body(livros);
    }

    @PostMapping
    public ResponseEntity<LivroDto> adicionarLivro(@PathVariable LivroDto livroDto){
        LivroDto livroDtoInterno = bibliotecaService.adicionarLivro(livroDto);
        if (livroDtoInterno==null){
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
        }
        return ResponseEntity.status(HttpStatus.CREATED).body(livroDtoInterno);
    }

}
