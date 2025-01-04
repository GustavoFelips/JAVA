package com.example.demo.model;

import java.util.ArrayList;
import java.util.List;
import com.example.demo.dtos.Empresas.EmpresaDto;
import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Entity(name = "instituicaoEnsino")
@Table(name = "instituicaoEnsino")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "instituicaoEnsinoId")
public class InstituicaoEnsino {
    
    @Id
    @GeneratedValue
    private UUID instituicaoEnsinoId;

    private String nome;
    private String endereco;
    private String coordenador;

    //@OneToMany(mappedBy = "instituicaoEnsino")
    //private List<Aluno> alunos;

    //@OneToMany(mappedBy = "instituicaoEnsino")
    //private List<Squad> squads;

}
