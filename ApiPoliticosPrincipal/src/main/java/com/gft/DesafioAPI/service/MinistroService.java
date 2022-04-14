package com.gft.DesafioAPI.service;


import com.gft.DesafioAPI.exception.EntityNotFoundException;
import com.gft.DesafioAPI.model.Ministro;
import com.gft.DesafioAPI.repository.MinistroRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;


import java.util.Optional;

@Service
public class MinistroService {

    private final MinistroRepository ministroRepository;

    public MinistroService(MinistroRepository ministroRepository) {
        this.ministroRepository = ministroRepository;
    }

    public Page<Ministro> listarTodosOsMinistros(Pageable pageable) {
        return ministroRepository.findAll(pageable);
    }

    public Ministro salvarMinistro(Ministro ministro) {
        return ministroRepository.save(ministro);
    }

    public Ministro buscarMinistro(Long id) {
        Optional<Ministro> ministro = ministroRepository.findById(id);
        return ministro.orElseThrow(() -> new EntityNotFoundException("Ministro não encontrado"));
    }

    public Ministro atualizarMinistro(Ministro ministro, Long id) {
        Ministro ministroOriginal = this.buscarMinistro(id);
        ministro.setId(ministroOriginal.getId());

        return ministroRepository.save(ministro);
    }

    public void excluirMinistro(Long id) {
        Ministro ministro = this.buscarMinistro(id);
        ministroRepository.delete(ministro);
    }
}
