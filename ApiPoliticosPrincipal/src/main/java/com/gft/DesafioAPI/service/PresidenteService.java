package com.gft.DesafioAPI.service;

import com.gft.DesafioAPI.exception.EntityNotFoundException;
import com.gft.DesafioAPI.model.Presidente;
import com.gft.DesafioAPI.repository.PresidenteRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;


import java.util.Optional;

@Service
public class PresidenteService {

    private final PresidenteRepository presidenteRepository;

    public PresidenteService(PresidenteRepository presidenteRepository) {
        this.presidenteRepository = presidenteRepository;
    }

    public Page<Presidente> listarTodosOsPresidentes(Pageable pageable) {
        return presidenteRepository.findAll(pageable);
    }

    public Presidente salvarPresidente(Presidente presidente) {
        return presidenteRepository.save(presidente);
    }

    public Presidente buscarPresidente(Long id) {
        Optional<Presidente> presidente = presidenteRepository.findById(id);
        return presidente.orElseThrow(() -> new EntityNotFoundException("Presidente não encontrado"));
    }

    public Presidente atualizarPresidente(Presidente presidente, Long id) {
        Presidente presidenteOriginal = this.buscarPresidente(id);
        presidente.setId(presidenteOriginal.getId());

        return presidenteRepository.save(presidente);
    }

    public void excluirPresidente(Long id) {
        Presidente presidente = this.buscarPresidente(id);
        presidenteRepository.delete(presidente);
    }
}
