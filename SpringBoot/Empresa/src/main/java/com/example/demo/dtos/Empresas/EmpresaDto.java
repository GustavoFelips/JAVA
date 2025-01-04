package com.example.demo.dtos.Empresas;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.UUID;



@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EmpresaDto {
    private UUID empresaId;
    private String razaoSocial;
    private String nomeFantasia;
    private String telefone;
    private String email;
    private String cnpj;
    
}
