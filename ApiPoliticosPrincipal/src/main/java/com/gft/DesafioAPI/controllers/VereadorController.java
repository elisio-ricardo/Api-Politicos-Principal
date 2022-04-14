package com.gft.DesafioAPI.controllers;


import com.gft.DesafioAPI.dto.vereador.ConsultaVereadorDTO;
import com.gft.DesafioAPI.dto.vereador.RegistroVereadorDTO;
import com.gft.DesafioAPI.dto.vereador.VereadorMapper;
import com.gft.DesafioAPI.model.Vereador;
import com.gft.DesafioAPI.service.VereadorService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping(value = "v1/vereadores")
public class VereadorController {

    public final VereadorService vereadorService;

    public VereadorController(VereadorService vereadorService) {
        this.vereadorService = vereadorService;
    }

    @GetMapping
    public ResponseEntity<Page<ConsultaVereadorDTO>> buscarTodosVereadores(@PageableDefault Pageable pageable) {
        return ResponseEntity.ok(vereadorService.listarTodosOsVereadores(pageable).map(VereadorMapper::fromEntity));
    }

    @PostMapping
    public ResponseEntity<ConsultaVereadorDTO> salvarVereador(@Valid @RequestBody RegistroVereadorDTO dto) {
        Vereador vereador = vereadorService.salvarVereador(VereadorMapper.fromDTO(dto));
        return ResponseEntity.ok(VereadorMapper.fromEntity(vereador));
    }

    @GetMapping("{id}")
    public ResponseEntity<ConsultaVereadorDTO> buscarVereador(@PathVariable Long id) {
        Vereador vereador = vereadorService.buscarVereador(id);
        return ResponseEntity.ok(VereadorMapper.fromEntity(vereador));
    }

    @PutMapping("{id}")
    public ResponseEntity<ConsultaVereadorDTO> alterarVereador(@RequestBody RegistroVereadorDTO dto, @PathVariable Long id) {
        try {
            Vereador vereador = vereadorService.atualizarVereador(VereadorMapper.fromDTO(dto), id);
            return ResponseEntity.ok(VereadorMapper.fromEntity(vereador));
        } catch (RuntimeException ex) {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("{id}")
    public ResponseEntity<ConsultaVereadorDTO> deletarVereador(@PathVariable Long id) {
        try {
            vereadorService.excluirVereador(id);
            return ResponseEntity.ok().build();

        } catch (RuntimeException ex) {
            return ResponseEntity.notFound().build();
        }
    }

}




