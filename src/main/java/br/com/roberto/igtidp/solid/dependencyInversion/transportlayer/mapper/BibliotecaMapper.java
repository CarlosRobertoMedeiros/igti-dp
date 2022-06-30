package br.com.roberto.igtidp.solid.dependencyInversion.transportlayer.mapper;

import br.com.roberto.igtidp.solid.dependencyInversion.entity.Livro;
import br.com.roberto.igtidp.solid.dependencyInversion.transportlayer.dto.LivroDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface BibliotecaMapper {

    @Mappings({
            @Mapping(target="id", source="entity.id"),
            @Mapping(target="ispb", source="entity.ispb"),
            @Mapping(target="nome", source="entity.nome")
    })
    LivroDto ToLivroDTO(Livro entity);

    @Mappings({
            @Mapping(target="id", source="dto.id"),
            @Mapping(target="ispb", source="dto.ispb"),
            @Mapping(target="nome", source="dto.nome")
    })
    Livro ToLivro(LivroDto dto);


}
