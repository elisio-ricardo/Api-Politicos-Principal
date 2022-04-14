package com.gft.DesafioAPI.service;


import com.gft.DesafioAPI.exception.EntityNotFoundException;
import com.gft.DesafioAPI.model.Vereador;
import com.gft.DesafioAPI.repository.VereadorRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class VereadorService {

    private final VereadorRepository vereadorRepository;

    public VereadorService(VereadorRepository vereadorRepository) {
        this.vereadorRepository = vereadorRepository;
    }

    public Page<Vereador> listarTodosOsVereadores(Pageable pageable) {
        return vereadorRepository.findAll(pageable);
    }

    public Vereador salvarVereador(Vereador vereador) {
        return vereadorRepository.save(vereador);
    }

    public Vereador buscarVereador(Long id) {
        Optional<Vereador> vereador = vereadorRepository.findById(id);
        return vereador.orElseThrow(() -> new EntityNotFoundException("Vereador não encontrado"));
    }

    public Vereador atualizarVereador(Vereador vereador, Long id) {
        Vereador vereadorOriginal = this.buscarVereador(id);

        vereador.setId(vereadorOriginal.getId());

        return vereadorRepository.save(vereador);
    }

    public void excluirVereador(Long id) {
        Vereador vereador = this.buscarVereador(id);
        vereadorRepository.delete(vereador);
    }


}
