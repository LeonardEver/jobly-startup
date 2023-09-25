package br.com.jobly.servico;

public record DadosAttServ(
        Long id,
        String nome,
        String descricao,
        double preco,
        String duracao
) {
}
