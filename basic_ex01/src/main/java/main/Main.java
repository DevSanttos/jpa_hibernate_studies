
package main;

import entity.Endereco;
import entity.Pessoa;
import entity.Telefone;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import repository.EnderecoRepository;
import repository.PessoaRepository;
import repository.TelefoneRepository;
import service.EnderecoService;
import service.PessoaService;
import service.TelefoneService;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa_basic");
        EntityManager em = emf.createEntityManager();

        PessoaRepository pessoaRepository = new PessoaRepository(em);
        PessoaService pessoaService = new PessoaService(pessoaRepository);

        EnderecoRepository enderecoRepository = new EnderecoRepository(em);
        EnderecoService enderecoService = new EnderecoService(enderecoRepository);

        TelefoneRepository telefoneRepository = new TelefoneRepository(em);
         TelefoneService telefoneService = new TelefoneService(telefoneRepository);



    }
}
