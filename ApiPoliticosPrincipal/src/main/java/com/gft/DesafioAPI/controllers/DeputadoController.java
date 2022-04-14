package com.gft.DesafioAPI.controllers;


import com.gft.DesafioAPI.dto.deputado.ConsultaDeputadoDTO;
import com.gft.DesafioAPI.dto.deputado.DeputadoMapper;
import com.gft.DesafioAPI.dto.deputado.RegistroDeputadoDTO;
import com.gft.DesafioAPI.model.Deputado;
import com.gft.DesafioAPI.service.DeputadoService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("v1/deputados")
public class DeputadoController {

    public final DeputadoService deputadoService;

    public DeputadoController(DeputadoService deputadoService) {
        this.deputadoService = deputadoService;
    }

    @GetMapping
    public ResponseEntity<Page<ConsultaDeputadoDTO>> buscarTodosDeputados(@PageableDefault Pageable pageable) {
        return ResponseEntity.ok(deputadoService.listarTodosOsDeputados(pageable).map(DeputadoMapper::fromEntity));
    }

    @PostMapping
    public ResponseEntity<ConsultaDeputadoDTO> salvarDeputado(@RequestBody RegistroDeputadoDTO dto) {
        Deputado deputado = deputadoService.salvarDeputado(DeputadoMapper.fromDTO(dto));
        return ResponseEntity.ok(DeputadoMapper.fromEntity(deputado));
    }

    @GetMapping("{id}")
    public ResponseEntity<ConsultaDeputadoDTO> buscarDeputado(@PathVariable Long id) {
        Deputado deputado = deputadoService.buscarDeputado(id);
        return ResponseEntity.ok(DeputadoMapper.fromEntity(deputado));
    }

    @PutMapping("{id}")
    public ResponseEntity<ConsultaDeputadoDTO> alterarDeputado(@RequestBody RegistroDeputadoDTO dto, @PathVariable Long id) {
        try {
            Deputado deputado = deputadoService.atualizarDeputado(DeputadoMapper.fromDTO(dto), id);
            return ResponseEntity.ok(DeputadoMapper.fromEntity(deputado));
        } catch (RuntimeException ex) {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("{id}")
    public ResponseEntity<ConsultaDeputadoDTO> deletarDeputado(@PathVariable Long id) {
        try {
            deputadoService.excluirDeputado(id);
            return ResponseEntity.ok().build();

        } catch (RuntimeException ex) {
            return ResponseEntity.notFound().build();
        }
    }

}
