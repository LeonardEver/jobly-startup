package br.com.jobly.endereco;

public record DadosEndereco(
        String rua,
        String bairro,
        String cep,
        String cidade,
        String uf,
        String complemento,
        String numero
) {
}
