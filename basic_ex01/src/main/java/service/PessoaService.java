package service;

import entity.Endereco;
import entity.Pessoa;
import repository.PessoaRepository;

public class PessoaService {
    private PessoaRepository pessoaRepository;

    public PessoaService(PessoaRepository pessoaRepository) {
        this.pessoaRepository = pessoaRepository;
    }

    public void save(Pessoa pessoa) {
        pessoaRepository.save(pessoa);
    }

    public void readAll() {pessoaRepository.readAll();}

    public Pessoa findById(Long id) {return pessoaRepository.findById(id);}

    public Pessoa findByName(String nome) {return pessoaRepository.findByName(nome);}

    public void update(Long id, String nome, String dataNascimento) {pessoaRepository.update(id, nome, dataNascimento);}

    public void delete(Long id) {pessoaRepository.delete(id);}
}