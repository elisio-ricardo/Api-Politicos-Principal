package com.gft.DesafioAPI.controllers;


import com.gft.DesafioAPI.dto.prefeito.ConsultaPrefeitoDTO;
import com.gft.DesafioAPI.dto.prefeito.PrefeitoMapper;
import com.gft.DesafioAPI.dto.prefeito.RegistroPrefeitoDTO;
import com.gft.DesafioAPI.model.Prefeito;
import com.gft.DesafioAPI.service.PrefeitoService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("v1/prefeitos")
public class PrefeitoController {

    public final PrefeitoService prefeitoService;

    public PrefeitoController(PrefeitoService prefeitoService) {
        this.prefeitoService = prefeitoService;
    }

    @GetMapping
    public ResponseEntity<Page<ConsultaPrefeitoDTO>> buscarTodosPrefeitos(@PageableDefault Pageable pageable) {
        return ResponseEntity.ok(prefeitoService.listarTodosOsPrefeitos(pageable).map(PrefeitoMapper::fromEntity));
    }

    @PostMapping
    public ResponseEntity<ConsultaPrefeitoDTO> salvarPrefeito(@RequestBody RegistroPrefeitoDTO dto) {
        Prefeito prefeito = prefeitoService.salvarPrefeito(PrefeitoMapper.fromDTO(dto));
        return ResponseEntity.ok(PrefeitoMapper.fromEntity(prefeito));
    }

    @GetMapping("{id}")
    public ResponseEntity<ConsultaPrefeitoDTO> buscarPrefeito(@PathVariable Long id) {
        Prefeito prefeito = prefeitoService.buscarPrefeito(id);
        return ResponseEntity.ok(PrefeitoMapper.fromEntity(prefeito));
    }

    @PutMapping("{id}")
    public ResponseEntity<ConsultaPrefeitoDTO> alterarPrefeito(@RequestBody RegistroPrefeitoDTO dto, @PathVariable Long id) {
        try {
            Prefeito prefeito = prefeitoService.atualizarPrefeito(PrefeitoMapper.fromDTO(dto), id);
            return ResponseEntity.ok(PrefeitoMapper.fromEntity(prefeito));
        } catch (RuntimeException ex) {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("{id}")
    public ResponseEntity<ConsultaPrefeitoDTO> deletarPrefeito(@PathVariable Long id) {
        try {
            prefeitoService.excluirPrefeito(id);
            return ResponseEntity.ok().build();

        } catch (RuntimeException ex) {
            return ResponseEntity.notFound().build();
        }
    }
}
