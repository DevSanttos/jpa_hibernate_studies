
package repository;

import jakarta.persistence.EntityManager;
import model.Pessoa;

public class PessoaRepository {
    private final EntityManager em;

    public PessoaRepository(EntityManager em) {
        this.em = em;
    }

    public void save(Pessoa pessoa) {
        em.getTransaction().begin();
        em.persist(pessoa);
        em.getTransaction().commit();
    }

    public void readAll() {
        em.createQuery("select p from Pessoa p", Pessoa.class)
                .getResultList()
                .forEach(System.out::println);
    }

    public Pessoa findByName(String nome) {
        return em.createQuery("select p from Pessoa p where p.nome = :nome", Pessoa.class)
                .setParameter("nome", nome)
                .getSingleResult();
    }

    public Pessoa findById(Long id) {
        return em.find(Pessoa.class, id);
    }

    public void update(Long id, String nome, String dataNascimento) {

        try {
            em.getTransaction().begin();

            Pessoa pessoa = em.find(Pessoa.class, id);

            if (pessoa != null) {
                pessoa.setNome(nome);
                pessoa.setDataNascimento(dataNascimento);
            } else {
                System.out.println("Pessoa não encontrada!");
                throw new RuntimeException("Erro ao realizar a consulta por ID.");
            }
            em.getTransaction().commit();

        } catch (Exception e) {
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
            throw new RuntimeException("Erro ao realizar a consulta por ID." + e.getMessage());
        }
    }

    public void delete(Long id) {
        em.getTransaction().begin();
        em.remove(em.find(Pessoa.class, id));
        em.getTransaction().commit();
    }
}
