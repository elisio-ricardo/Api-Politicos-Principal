package com.gft.DesafioAPI.repository;

import com.gft.DesafioAPI.model.Usuario;
import com.gft.DesafioAPI.model.Vereador;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface VereadorRepository extends JpaRepository<Vereador, Long> {
    Page<Vereador> findAll(Pageable pageable);
}
