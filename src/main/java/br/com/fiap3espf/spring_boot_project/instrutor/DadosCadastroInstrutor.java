package br.com.fiap3espf.spring_boot_project.instrutor;

import br.com.fiap3espf.spring_boot_project.endereco.DadosEndereco;

public record DadosCadastroInstrutor(
        String nome,
        String email,
        String cnh,
        Especialidade especialidade,
        DadosEndereco endereco) {
}