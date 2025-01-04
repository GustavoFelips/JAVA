package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.InstituicaoEnsino;

import java.util.UUID;

public interface InstituicaoEnsinoRepository extends JpaRepository<InstituicaoEnsino, UUID> {
}
