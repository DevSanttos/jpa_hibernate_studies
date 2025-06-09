package service;

import entity.Endereco;
import repository.EnderecoRepository;

public class EnderecoService {
    private EnderecoRepository enderecoRepository;

    public EnderecoService(EnderecoRepository enderecoRepository) {
        this.enderecoRepository = enderecoRepository;
    }

    public void save(Endereco endereco) {
        enderecoRepository.save(endereco);
    }

    public void readAll() { enderecoRepository.readAll(); }

    public entity.Endereco findByRuaAndCidade(String rua, String cidade) {
        return enderecoRepository.findByRuaAndCidade(rua, cidade);
    }

    public entity.Endereco findById(Long id) { return enderecoRepository.findById(id); }

    public void update(Long id, String rua, String cidade) { enderecoRepository.update(id, rua, cidade); }

    public void delete(Long id) { enderecoRepository.delete(id); }
}
