package com.gft.DesafioAPI.repository;


import com.gft.DesafioAPI.model.Deputado;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeputadoRepository extends JpaRepository<Deputado, Long> {
    Page<Deputado> findAll(Pageable pageable);
}
