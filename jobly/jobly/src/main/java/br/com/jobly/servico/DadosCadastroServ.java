package br.com.jobly.servico;

public record DadosCadastroServ(
        String nome,
        String descricao,
        Double preco,
        String duracao,

        Categoria categoria) {
}
