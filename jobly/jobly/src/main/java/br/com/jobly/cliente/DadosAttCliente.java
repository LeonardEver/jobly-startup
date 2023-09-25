package br.com.jobly.cliente;

import br.com.jobly.endereco.DadosEndereco;

public record DadosAttCliente(
        Long id,
        String nome,
        String email,
        DadosEndereco endereco) {
}
