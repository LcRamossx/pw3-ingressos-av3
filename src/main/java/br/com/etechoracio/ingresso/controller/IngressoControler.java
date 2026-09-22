package br.com.etechoracio.ingresso.controller;


import br.com.etechoracio.ingresso.dto.SalaResponseDTO;
import br.com.etechoracio.ingresso.entity.Sala;
import br.com.etechoracio.ingresso.mapper.IngressoMapper;
import br.com.etechoracio.ingresso.service.IngressoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping
@CrossOrigin("*")
public class IngressoControler {

    @Autowired
    private IngressoMapper ingressoMapper;

    @Autowired
    private IngressoService ingressoService;

    @GetMapping("/salas")
    public ResponseEntity<List<SalaResponseDTO>> listarSalasAtivas() {
        List<SalaResponseDTO> salas = ingressoService.salasAtivas();
        return ResponseEntity.ok(salas);
    }
}
