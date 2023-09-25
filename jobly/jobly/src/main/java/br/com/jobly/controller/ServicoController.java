package br.com.jobly.controller;

import br.com.jobly.cliente.DadosAttCliente;
import br.com.jobly.colaborador.DadosListColaborador;
import br.com.jobly.servico.*;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/servico")
public class ServicoController {

    @Autowired
    private ServicoRepository repository;

    @PostMapping
    @Transactional
    public void cadastrarServ(@RequestBody DadosCadastroServ dados) {
        repository.save(new Servico(dados));
    }

    @GetMapping
    public List<DadosListServ> listar() {
        return repository.findAll().stream().map(DadosListServ::new).toList();
    }

    @PutMapping
    @Transactional
    public void atualizar(@RequestBody DadosAttServ dados) {
        var Servico = repository.getReferenceById(dados.id());
        Servico.attDadosServ(dados);

    }

    @DeleteMapping("{id}")
    @Transactional
    public void excluir(@PathVariable Long id) {
        repository.deleteById(id);
    }
}