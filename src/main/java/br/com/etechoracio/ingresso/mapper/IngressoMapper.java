package br.com.etechoracio.ingresso.mapper;

import br.com.etechoracio.ingresso.dto.SalaResponseDTO;
import br.com.etechoracio.ingresso.entity.Sala;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")

public interface IngressoMapper {
    SalaResponseDTO toDTO (Sala sala);

        List<SalaResponseDTO> toDTOList (List<Sala> salas);
        Sala toEntity(SalaResponseDTO dto);
}
