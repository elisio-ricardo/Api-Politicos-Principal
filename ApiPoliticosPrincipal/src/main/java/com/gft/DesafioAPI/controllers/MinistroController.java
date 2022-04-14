package com.gft.DesafioAPI.controllers;


import com.gft.DesafioAPI.dto.ministro.ConsultaMinistroDTO;
import com.gft.DesafioAPI.dto.ministro.MinistroMapper;
import com.gft.DesafioAPI.dto.ministro.RegistroMinistroDTO;
import com.gft.DesafioAPI.model.Ministro;
import com.gft.DesafioAPI.service.MinistroService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("v1/ministros")
public class MinistroController {

    public final MinistroService ministroService;

    public MinistroController(MinistroService ministroService) {
        this.ministroService = ministroService;
    }

    @GetMapping
    public ResponseEntity<Page<ConsultaMinistroDTO>> buscarTodosMinistros(@PageableDefault Pageable pageable) {
        return ResponseEntity.ok(ministroService.listarTodosOsMinistros(pageable).map(MinistroMapper::fromEntity));
    }

    @PostMapping
    public ResponseEntity<ConsultaMinistroDTO> salvarMinistro(@RequestBody RegistroMinistroDTO dto) {
        Ministro ministro = ministroService.salvarMinistro(MinistroMapper.fromDTO(dto));
        return ResponseEntity.ok(MinistroMapper.fromEntity(ministro));
    }

    @GetMapping("{id}")
    public ResponseEntity<ConsultaMinistroDTO> buscarMinistro(@PathVariable Long id) {
        Ministro ministro = ministroService.buscarMinistro(id);
        return ResponseEntity.ok(MinistroMapper.fromEntity(ministro));
    }

    @PutMapping("{id}")
    public ResponseEntity<ConsultaMinistroDTO> alterarMinistro(@RequestBody RegistroMinistroDTO dto, @PathVariable Long id) {
        try {
            Ministro ministro = ministroService.atualizarMinistro(MinistroMapper.fromDTO(dto), id);
            return ResponseEntity.ok(MinistroMapper.fromEntity(ministro));
        } catch (RuntimeException ex) {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("{id}")
    public ResponseEntity<ConsultaMinistroDTO> deletarMinistro(@PathVariable Long id) {
        try {
            ministroService.excluirMinistro(id);
            return ResponseEntity.ok().build();

        } catch (RuntimeException ex) {
            return ResponseEntity.notFound().build();
        }
    }
}
