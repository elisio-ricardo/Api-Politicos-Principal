package com.gft.DesafioAPI.repository;

import com.gft.DesafioAPI.model.Governador;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface GovernadorRepository extends JpaRepository<Governador, Long> {
    Page<Governador> findAll(Pageable pageable);
}
