package com.gft.DesafioAPI.service;

import com.gft.DesafioAPI.exception.EntityNotFoundException;
import com.gft.DesafioAPI.model.Deputado;
import com.gft.DesafioAPI.repository.DeputadoRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;


import java.util.Optional;

@Service
public class DeputadoService {

    private final DeputadoRepository deputadoRepository;

    public DeputadoService(DeputadoRepository deputadoRepository) {
        this.deputadoRepository = deputadoRepository;
    }

    public Page<Deputado> listarTodosOsDeputados(Pageable pageable) {
        return deputadoRepository.findAll(pageable);
    }

    public Deputado salvarDeputado(Deputado deputado) {
        return deputadoRepository.save(deputado);
    }

    public Deputado buscarDeputado(Long id) {
        Optional<Deputado> deputado = deputadoRepository.findById(id);
        return deputado.orElseThrow(() -> new EntityNotFoundException("Deputado não encontrado"));
    }

    public Deputado atualizarDeputado(Deputado deputado, Long id) {
        Deputado deputadoOriginal = this.buscarDeputado(id);

        deputado.setId(deputadoOriginal.getId());

        return deputadoRepository.save(deputado);
    }

    public void excluirDeputado(Long id) {
        Deputado deputado = this.buscarDeputado(id);
        deputadoRepository.delete(deputado);
    }


}
