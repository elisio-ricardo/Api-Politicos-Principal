package com.gft.DesafioAPI.service;

import com.gft.DesafioAPI.exception.EntityNotFoundException;
import com.gft.DesafioAPI.model.Governador;
import com.gft.DesafioAPI.repository.GovernadorRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class GovernadorService {

    private final GovernadorRepository governadorRepository;

    public GovernadorService(GovernadorRepository governadorRepository) {
        this.governadorRepository = governadorRepository;
    }

    public Page<Governador> listarTodosOsGovernadores(Pageable pageable) {
        return governadorRepository.findAll(pageable);
    }

    public Governador salvarGovernador(Governador governador) {
        return governadorRepository.save(governador);
    }

    public Governador buscarGovernador(Long id) {
        Optional<Governador> governador = governadorRepository.findById(id);
        return governador.orElseThrow(() -> new EntityNotFoundException("Governador não encontrado"));
    }

    public Governador atualizarGovernador(Governador governador, Long id) {
        Governador governadorOriginal = this.buscarGovernador(id);

        governador.setId(governadorOriginal.getId());

        return governadorRepository.save(governador);
    }

    public void excluirGovernador(Long id) {
        Governador governador = this.buscarGovernador(id);
        governadorRepository.delete(governador);
    }
}
