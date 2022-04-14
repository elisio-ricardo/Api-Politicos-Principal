package com.gft.DesafioAPI.controllers;


import com.gft.DesafioAPI.dto.presidente.ConsultaPresidenteDTO;
import com.gft.DesafioAPI.dto.presidente.PresidenteMapper;
import com.gft.DesafioAPI.dto.presidente.RegistroPresidenteDTO;
import com.gft.DesafioAPI.model.Presidente;
import com.gft.DesafioAPI.service.PresidenteService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("v1/presidentes")
public class PresidenteController {

    public final PresidenteService presidenteService;

    public PresidenteController(PresidenteService presidenteService) {
        this.presidenteService = presidenteService;
    }

    @GetMapping
    public ResponseEntity<Page<ConsultaPresidenteDTO>> buscarTodosPresidentes(@PageableDefault Pageable pageable) {
        return ResponseEntity.ok(presidenteService.listarTodosOsPresidentes(pageable).map(PresidenteMapper::fromEntity));
    }

    @PostMapping
    public ResponseEntity<ConsultaPresidenteDTO> salvarPresidente(@RequestBody RegistroPresidenteDTO dto) {
        Presidente presidente = presidenteService.salvarPresidente(PresidenteMapper.fromDTO(dto));
        return ResponseEntity.ok(PresidenteMapper.fromEntity(presidente));
    }

    @GetMapping("{id}")
    public ResponseEntity<ConsultaPresidenteDTO> buscarPresidente(@PathVariable Long id) {
        Presidente presidente = presidenteService.buscarPresidente(id);
        return ResponseEntity.ok(PresidenteMapper.fromEntity(presidente));
    }

    @PutMapping("{id}")
    public ResponseEntity<ConsultaPresidenteDTO> alterarPresidente(@RequestBody RegistroPresidenteDTO dto, @PathVariable Long id) {
        try {
            Presidente presidente = presidenteService.atualizarPresidente(PresidenteMapper.fromDTO(dto), id);
            return ResponseEntity.ok(PresidenteMapper.fromEntity(presidente));
        } catch (RuntimeException ex) {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("{id}")
    public ResponseEntity<ConsultaPresidenteDTO> deletarPresidente(@PathVariable Long id) {
        try {
            presidenteService.excluirPresidente(id);
            return ResponseEntity.ok().build();

        } catch (RuntimeException ex) {
            return ResponseEntity.notFound().build();
        }
    }

}
