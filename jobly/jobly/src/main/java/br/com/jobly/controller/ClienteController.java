package br.com.jobly.controller;

import br.com.jobly.cliente.*;
import br.com.jobly.colaborador.Colaborador;
import br.com.jobly.colaborador.ColaboradorRepository;
import br.com.jobly.colaborador.DadosAttColab;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    private ClienteRepository repository;

    @PostMapping
    @Transactional
    public void cadastrarCliente(@RequestBody DadosCadastroCli dados) {
        repository.save(new Cliente(dados));
    }

    @GetMapping
    public List<DadosListCliente> listar() {
        return repository.findAll().stream().map(DadosListCliente::new).toList();
    }

    @PutMapping
    @Transactional
    public void atualizar(@RequestBody DadosAttCliente dados) {
        var Cliente = repository.getReferenceById(dados.id());
        Cliente.attDadosCli(dados);

    }

    @DeleteMapping("{id}")
    @Transactional
    public void excluir(@PathVariable Long id) {
        repository.deleteById(id);
    }
}
