package br.com.jobly.colaborador;

import br.com.jobly.endereco.Endereco;
import jakarta.persistence.*;
import lombok.*;

@Table(name="colaboradores")
@Entity(name="colaboradores")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Colaborador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private String cpf;

    @Enumerated(EnumType.STRING)
    private Especialidade especialidade;

    @Embedded
    private Endereco endereco;

    public Colaborador(DadosCadastroColab dados) {
        this.nome = dados.nome();
        this.email = dados.email();
        this.cpf = dados.cpf();
        this.especialidade = dados.especialidade();
        this.endereco = new Endereco(dados.endereco());
    }

    public void attDados(DadosAttColab dados) {
        if(dados.nome() != null) {
            this.nome = dados.nome();
        }
       if(dados.email() != null) {
           this.email = dados.email();
       }
       if(dados.endereco() != null) {
           this.endereco.attDados(dados.endereco());
       }
    }
}
