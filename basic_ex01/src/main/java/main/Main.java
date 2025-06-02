
package main;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import repository.PessoaRepository;
import service.PessoaService;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa_basic");
        EntityManager em = emf.createEntityManager();

        PessoaRepository pessoaRepository = new PessoaRepository(em);
        PessoaService pessoaService = new PessoaService(pessoaRepository);

        pessoaService.update(4L, "Lúcia", "22/01/1992");
        pessoaService.readAll();

        em.close();
        emf.close();
    }
}
