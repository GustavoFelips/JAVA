package com.example.demo.controller;
import com.example.demo.dtos.IntituicoesEnsino.UpdateInstituicaoEnsinoDto;
import com.example.demo.model.InstituicaoEnsino;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.demo.service.InstituicaoEnsino.InstituicaoEnsinoService;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/instituicoes")
public class InstituicaoEnsinoController {
        @Autowired
        private InstituicaoEnsinoService instituicaoEnsinoService;
    
        @GetMapping
        public List<InstituicaoEnsino> getAll() {
            return instituicaoEnsinoService.findAll();
        }
    
        @GetMapping("/{id}")
        public ResponseEntity<InstituicaoEnsino> getById(@PathVariable UUID id) {
            InstituicaoEnsino instituicao = instituicaoEnsinoService.findById(id);
            return instituicao != null ? ResponseEntity.ok(instituicao) : ResponseEntity.notFound().build();
        }
    
        @PostMapping
        public InstituicaoEnsino create(@RequestBody InstituicaoEnsino instituicao) {
            return instituicaoEnsinoService.save(instituicao);
        }
    
        @DeleteMapping("/{id}")
        public ResponseEntity<Void> delete(@PathVariable UUID id) {
            instituicaoEnsinoService.delete(id);
            return ResponseEntity.noContent().build();
        }
        @PutMapping("/{id}")
        public ResponseEntity<InstituicaoEnsino> update(@PathVariable("id") UUID id, @RequestBody UpdateInstituicaoEnsinoDto instituicaoEnsinoDto) {
            InstituicaoEnsino updatedInstituicao = instituicaoEnsinoService.update(id, instituicaoEnsinoDto);
            return ResponseEntity.ok(updatedInstituicao);
    }
    }
    


