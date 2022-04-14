package com.gft.DesafioAPI.repository;


import com.gft.DesafioAPI.model.Prefeito;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PrefeitoRepository extends JpaRepository<Prefeito, Long> {
    Page<Prefeito> findAll(Pageable pageable);
}
