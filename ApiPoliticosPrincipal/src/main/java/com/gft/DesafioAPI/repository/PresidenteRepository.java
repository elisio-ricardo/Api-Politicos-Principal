package com.gft.DesafioAPI.repository;

import com.gft.DesafioAPI.model.Presidente;
import com.gft.DesafioAPI.model.Usuario;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PresidenteRepository extends JpaRepository<Presidente, Long> {
    Page<Presidente> findAll(Pageable pageable);
}
