package com.example.demo.service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import com.example.demo.dtos.Empresas.UpdateEmpresaDto;
import com.example.demo.model.Empresa;

public interface IEmpresaService {
    public List<Empresa> findAll();
    public Optional<Empresa> findById(UUID id);
    public Empresa update(UUID empresaId, UpdateEmpresaDto empresaDto);
    public Empresa save(Empresa empresa);
    public void delete(UUID id);
}
