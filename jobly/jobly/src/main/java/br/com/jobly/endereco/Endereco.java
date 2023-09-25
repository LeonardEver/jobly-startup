package br.com.jobly.endereco;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Endereco {

    private String rua;
    private  String bairro;
    private  String cep;
    private  String cidade;
    private  String uf;
    private  String complemento;
    private  String numero;

    public Endereco(DadosEndereco dados) {
        this.rua = dados.rua();
        this.cep = dados.cep();
        this.uf = dados.uf();
        this.bairro = dados.bairro();
        this.cidade = dados.cidade();
        this.complemento = dados.complemento();
        this.numero = dados.numero();
    }

    public void attDados(DadosEndereco endereco) {
        if (endereco.rua() != null) {
            this.rua = endereco.rua();
        }
        if (endereco.cep() != null) {
            this.cep = endereco.cep();
        }
        if (endereco.uf() != null) {
            this.uf = endereco.uf();
        }
        if (endereco.bairro() != null) {
            this.bairro = endereco.bairro();
        }
        if (endereco.cidade() != null) {
            this.cidade = endereco.cidade();
        }
        if (endereco.complemento() != null) {
            this.complemento = endereco.complemento();
        }
        if (endereco.numero() != null) {
            this.numero = endereco.numero();
        }
    }
}
