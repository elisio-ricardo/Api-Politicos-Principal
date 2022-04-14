package com.gft.DesafioAPI.controllers;


import com.gft.DesafioAPI.dto.senador.ConsultaSenadorDTO;
import com.gft.DesafioAPI.dto.senador.RegistroSenadorDTO;
import com.gft.DesafioAPI.dto.senador.SenadorMapper;
import com.gft.DesafioAPI.model.Senador;
import com.gft.DesafioAPI.service.SenadorService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("v1/senadores")
public class SenadorController {

    public final SenadorService senadorService;

    public SenadorController(SenadorService senadorService) {
        this.senadorService = senadorService;
    }

    @GetMapping
    public ResponseEntity<Page<ConsultaSenadorDTO>> buscarTodosSenadores(@PageableDefault Pageable pageable) {
        return ResponseEntity.ok(senadorService.listarTodosOsSenadores(pageable).map(SenadorMapper::fromEntity));
    }

    @PostMapping
    public ResponseEntity<ConsultaSenadorDTO> salvarSenador(@RequestBody RegistroSenadorDTO dto) {
        Senador senador = senadorService.salvarSenador(SenadorMapper.fromDTO(dto));
        return ResponseEntity.ok(SenadorMapper.fromEntity(senador));
    }

    @GetMapping("{id}")
    public ResponseEntity<ConsultaSenadorDTO> buscarSenador(@PathVariable Long id) {
        Senador senador = senadorService.buscarSenador(id);
        return ResponseEntity.ok(SenadorMapper.fromEntity(senador));
    }

    @PutMapping("{id}")
    public ResponseEntity<ConsultaSenadorDTO> alterarSenador(@RequestBody RegistroSenadorDTO dto, @PathVariable Long id) {
        try {
            Senador senador = senadorService.atualizarSenador(SenadorMapper.fromDTO(dto), id);
            return ResponseEntity.ok(SenadorMapper.fromEntity(senador));
        } catch (RuntimeException ex) {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("{id}")
    public ResponseEntity<ConsultaSenadorDTO> deletarSenador(@PathVariable Long id) {
        try {
            senadorService.excluirSenador(id);
            return ResponseEntity.ok().build();

        } catch (RuntimeException ex) {
            return ResponseEntity.notFound().build();
        }
    }

}
