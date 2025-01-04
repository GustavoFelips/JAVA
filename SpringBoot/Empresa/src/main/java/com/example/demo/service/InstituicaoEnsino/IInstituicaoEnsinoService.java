package com.example.demo.service.InstituicaoEnsino;

import java.util.List;
import java.util.UUID;
import com.example.demo.dtos.IntituicoesEnsino.*;
import com.example.demo.model.InstituicaoEnsino;

public interface IInstituicaoEnsinoService {
    public List<InstituicaoEnsino> findAll();
    public InstituicaoEnsino findById(UUID id);
    public InstituicaoEnsino update(UUID InstituicaoEnsinoId, UpdateInstituicaoEnsinoDto InstituicaoEnsinoDto);
    public InstituicaoEnsino save(InstituicaoEnsino instituicao);
    public void delete(UUID id) ;
}

