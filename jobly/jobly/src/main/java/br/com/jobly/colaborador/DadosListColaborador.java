package br.com.jobly.colaborador;

public record DadosListColaborador(Long id, String nome, String email, String cpf, Especialidade especialidade) {

    public DadosListColaborador(Colaborador colaborador) {
        this(colaborador.getId(), colaborador.getNome(), colaborador.getEmail(), colaborador.getCpf(),colaborador.getEspecialidade());
    }
}
