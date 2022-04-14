package com.gft.DesafioAPI.repository;

import com.gft.DesafioAPI.model.Ministro;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MinistroRepository extends JpaRepository<Ministro, Long> {
    Page<Ministro> findAll(Pageable pageable);
}
