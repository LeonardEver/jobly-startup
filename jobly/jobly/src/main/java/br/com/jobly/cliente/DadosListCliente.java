package br.com.jobly.cliente;

import br.com.jobly.endereco.Endereco;

public record DadosListCliente(Long id, String nome, String email, Endereco endereco, String cpf) {

    public DadosListCliente(Cliente cliente){
        this(cliente.getId(), cliente.getNome(), cliente.getEmail(), cliente.getEndereco(), cliente.getCpf());
    }
}
