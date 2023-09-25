package br.com.jobly.colaborador;

import br.com.jobly.endereco.DadosEndereco;
import jakarta.validation.constraints.NotNull;

public record DadosAttColab(
        @NotNull
        Long id,
        String nome,
        String email,
        DadosEndereco endereco) {
}
