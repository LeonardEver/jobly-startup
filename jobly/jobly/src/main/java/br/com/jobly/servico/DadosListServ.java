package br.com.jobly.servico;

public record DadosListServ(Long id, String nome, String descricao, double preco, String duracao) {

    public DadosListServ(Servico servico){
        this(servico.getId(), servico.getNome(), servico.getDescricao(), servico.getPreco(), servico.getDuracao());
    }
}
