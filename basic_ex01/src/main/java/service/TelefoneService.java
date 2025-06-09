package service;

import entity.Telefone;
import repository.TelefoneRepository;

public class TelefoneService {

    private final TelefoneRepository telefoneRepository;

    public TelefoneService(TelefoneRepository telefoneRepository) {
        this.telefoneRepository = telefoneRepository;
    }

    public void save(Telefone telefone) {
        telefoneRepository.save(telefone);
    }

    public void readAll() {
        telefoneRepository.readAll();
    }

    public Telefone findById(int id) {
        return telefoneRepository.findById(id);
    }

    public Telefone findByNumero(String numero) {
        return telefoneRepository.findByNumero(numero);
    }

    public void update(int id, String numero) {
        telefoneRepository.update(id, numero);
    }

    public void delete(Telefone telefone) {
        telefoneRepository.delete(telefone.getId());
    }
}
