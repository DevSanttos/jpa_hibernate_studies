package service;

import model.Pessoa;
import repository.PessoaRepository;

public class PessoaService {
    private PessoaRepository pessoaRepository;

    public PessoaService(PessoaRepository pessoaRepository) {
        this.pessoaRepository = pessoaRepository;
    }

    public void save(String nome, String dataNascimento) {
        pessoaRepository.save(new Pessoa(nome, dataNascimento));
    }

    public void readAll() {pessoaRepository.readAll();}

    public Pessoa findById(Long id) {return pessoaRepository.findById(id);}

    public Pessoa findByName(String nome) {return pessoaRepository.findByName(nome);}

    public void update(Long id, String nome, String dataNascimento) {pessoaRepository.update(id, nome, dataNascimento);}

    public void delete(Long id) {pessoaRepository.delete(id);}
}