package com.gft.DesafioAPI.controllers;


import com.gft.DesafioAPI.dto.governador.ConsultaGovernadorDTO;
import com.gft.DesafioAPI.dto.governador.GovernadorMapper;
import com.gft.DesafioAPI.dto.governador.RegistroGovernadorDTO;
import com.gft.DesafioAPI.model.Governador;
import com.gft.DesafioAPI.service.GovernadorService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("v1/governadores")
public class GovernadorController {

    public final GovernadorService governadorService;

    public GovernadorController(GovernadorService governadorService) {
        this.governadorService = governadorService;
    }

    @GetMapping
    public ResponseEntity<Page<ConsultaGovernadorDTO>> buscarTodosGovernadores(@PageableDefault Pageable pageable) {
        return ResponseEntity.ok(governadorService.listarTodosOsGovernadores(pageable).map(GovernadorMapper::fromEntity));
    }

    @PostMapping
    public ResponseEntity<ConsultaGovernadorDTO> salvarGovernador(@RequestBody RegistroGovernadorDTO dto) {
        Governador governador = governadorService.salvarGovernador(GovernadorMapper.fromDTO(dto));
        return ResponseEntity.ok(GovernadorMapper.fromEntity(governador));
    }

    @GetMapping("{id}")
    public ResponseEntity<ConsultaGovernadorDTO> buscarGovernador(@PathVariable Long id) {
        Governador governador = governadorService.buscarGovernador(id);
        return ResponseEntity.ok(GovernadorMapper.fromEntity(governador));
    }

    @PutMapping("{id}")
    public ResponseEntity<ConsultaGovernadorDTO> alterarGovernador(@RequestBody RegistroGovernadorDTO dto, @PathVariable Long id) {
        try {
            Governador governador = governadorService.atualizarGovernador(GovernadorMapper.fromDTO(dto), id);
            return ResponseEntity.ok(GovernadorMapper.fromEntity(governador));
        } catch (RuntimeException ex) {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("{id}")
    public ResponseEntity<ConsultaGovernadorDTO> deletarGovernador(@PathVariable Long id) {
        try {
            governadorService.excluirGovernador(id);
            return ResponseEntity.ok().build();

        } catch (RuntimeException ex) {
            return ResponseEntity.notFound().build();
        }
    }

}
