package med.voll.api.controller;

import jakarta.validation.Valid;
import med.voll.api.medico.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;


//RestController indica ao Spring que a classe é um controller
//RequestMapping define a url padrão da classe (nesse caso, /medicos)
@RestController
@RequestMapping("/medicos")
public class MedicoController {

    //Injeção de dependencias: Autowired instancia o repositório
    @Autowired
    private MedicoRepository repository;

    //POST
    @PostMapping
    //Indica interação com o banco de dados
    @Transactional
    public void cadastrar(@RequestBody @Valid DadosCadastroMedico dados) {
        repository.save(new Medico(dados));

    }

    //GET
    @GetMapping
    //Pageable permite a paginação dos dados (10 registros por página, ordenados por nome)
    public Page<DadosListagemMedico> listar(@PageableDefault(size = 10, sort = {"nome"}) Pageable paginacao) {
        return repository.findAll(paginacao).map(DadosListagemMedico::new);
    }

    //PUT
    @PutMapping
    @Transactional
    public void atualizar(@RequestBody @Valid DadosAtualizacaoMedico dados) {
        var medico = repository.getReferenceById(dados.id());
        medico.atualizarInformacoes(dados);
    }

    //DELETE
    @DeleteMapping("/{id}")
    @Transactional
    public void excluir(@PathVariable Long id) {
        repository.deleteById(id);
    }
}
