package com.example.demo.dtos.IntituicoesEnsino;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UpdateInstituicaoEnsinoDto {
    private String nome;
    private String endereco;
    private String coordenador;
    //private List<UUID> alunos; // Ou outro DTO de Aluno
    //private List<UUID> squads; // Ou outro DTO de Squad
    
}





