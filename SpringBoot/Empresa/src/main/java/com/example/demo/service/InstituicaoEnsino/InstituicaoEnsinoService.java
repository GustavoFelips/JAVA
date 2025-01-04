package com.example.demo.service.InstituicaoEnsino;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.dtos.IntituicoesEnsino.*;
import com.example.demo.model.InstituicaoEnsino;
import com.example.demo.repository.InstituicaoEnsinoRepository;
import jakarta.persistence.EntityNotFoundException;

@Service
public class InstituicaoEnsinoService implements IInstituicaoEnsinoService{

    @Autowired
    private InstituicaoEnsinoRepository instituicaoEnsinoRepository;

    public List<InstituicaoEnsino> findAll() {
        return instituicaoEnsinoRepository.findAll();
    }

    public InstituicaoEnsino findById(UUID id) {
        return instituicaoEnsinoRepository.findById(id).orElse(null);
    }

    public InstituicaoEnsino save(InstituicaoEnsino instituicao) {
        return instituicaoEnsinoRepository.save(instituicao);
    }

    public void delete(UUID id) {
        instituicaoEnsinoRepository.deleteById(id);
    }

    // Método para atualizar a Intituão de ensino com o DTO
    public InstituicaoEnsino update(UUID InstituicaoEnsinoId, UpdateInstituicaoEnsinoDto InstituicaoEnsinoDto) {
        Optional<InstituicaoEnsino> optionalInstituicaoEnsino = instituicaoEnsinoRepository.findById(InstituicaoEnsinoId);
        
        if (optionalInstituicaoEnsino.isPresent()) {
            InstituicaoEnsino InstituicaoEnsino = optionalInstituicaoEnsino.get();
            InstituicaoEnsino.setNome(InstituicaoEnsinoDto.getNome());
            InstituicaoEnsino.setEndereco(InstituicaoEnsinoDto.getEndereco());
            InstituicaoEnsino.setCoordenador(InstituicaoEnsinoDto.getCoordenador());
            return instituicaoEnsinoRepository.save(InstituicaoEnsino);
        } else {
            throw new EntityNotFoundException("InstituicaoEnsino não encontrada com o ID: " + InstituicaoEnsinoId);
        }
    }
}
