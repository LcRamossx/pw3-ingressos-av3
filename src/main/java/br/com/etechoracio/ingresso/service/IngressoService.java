package br.com.etechoracio.ingresso.service;


import br.com.etechoracio.ingresso.dto.SalaResponseDTO;
import br.com.etechoracio.ingresso.entity.Sala;
import br.com.etechoracio.ingresso.mapper.IngressoMapper;
import br.com.etechoracio.ingresso.repository.IngressoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IngressoService {

    @Autowired
    private IngressoRepository ingressoRepository;

    @Autowired
    private IngressoMapper ingressoMapper;

    public List<SalaResponseDTO> salasAtivas () {
        List<Sala> salas = ingressoRepository.findByAtivoTrue();
        return ingressoMapper.toDTOList(salas);
    }
}
