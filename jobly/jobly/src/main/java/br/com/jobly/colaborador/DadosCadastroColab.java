package br.com.jobly.colaborador;

import br.com.jobly.endereco.DadosEndereco;

public record DadosCadastroColab(
        String nome,
        String email,
        String cpf,
        Especialidade especialidade,
        DadosEndereco endereco) {
}
