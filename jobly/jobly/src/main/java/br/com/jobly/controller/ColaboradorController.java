package br.com.jobly.controller;

import br.com.jobly.colaborador.*;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/colaboradores")
public class ColaboradorController {

    @Autowired
    private ColaboradorRepository repository;

    @PostMapping
    @Transactional
    public void cadastrarColab(@RequestBody DadosCadastroColab dados) {
        repository.save(new Colaborador(dados));
    }

    @GetMapping
    public List<DadosListColaborador> listar() {
        return repository.findAll().stream().map(DadosListColaborador::new).toList();
    }

    @PutMapping
    @Transactional
    public void atualizar(@RequestBody DadosAttColab dados) {
        var colaborador = repository.getReferenceById(dados.id());
        colaborador.attDados(dados);

    }

    @DeleteMapping("{id}")
    @Transactional
    public void excluir(@PathVariable Long id) {
        repository.deleteById(id);
    }

}


