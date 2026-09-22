package br.com.etechoracio.ingresso.repository;

import br.com.etechoracio.ingresso.entity.Ingresso;
import br.com.etechoracio.ingresso.entity.Sala;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface IngressoRepository extends JpaRepository<Ingresso, Long>
{
    @Query("SELECT s FROM Sala s WHERE s.ativo = true ORDER BY s.nome")
    List<Sala> buscarSalasAtivas();

    List<Sala> findByAtivoTrue();
}
