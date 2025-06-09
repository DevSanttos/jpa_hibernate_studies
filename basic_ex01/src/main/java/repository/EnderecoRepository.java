package repository;

import entity.Endereco;
import jakarta.persistence.EntityManager;

public class EnderecoRepository {
    private final EntityManager em;

    public EnderecoRepository(EntityManager em) {
        this.em = em;
    }

    public void save(Endereco endereco) {
        try {
            em.getTransaction().begin();
            em.persist(endereco);
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
        }
    }

    public void readAll() {
        em.createQuery("select e from Endereco e", Endereco.class)
                .getResultList()
                .forEach(System.out::println);
    }

    public Endereco findByRuaAndCidade(String rua, String cidade) {
        return em.createQuery("select e from Endereco e where e.rua = :rua and e.cidade = :cidade", Endereco.class)
                .setParameter("rua", rua)
                .setParameter("cidade", cidade)
                .getSingleResult();
    }

    public Endereco findById(Long id) {
        return em.find(Endereco.class, id);
    }

    public void update(Long id, String rua, String cidade) {
        try {
            em.getTransaction().begin();

            Endereco endereco = em.find(Endereco.class, id );

            if (endereco != null) {
                endereco.setRua(rua);
                endereco.setCidade(cidade);
            } else {
                System.out.println("Endereço não encontrado");
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
        em.remove(em.find(Endereco.class, id));
        em.getTransaction().commit();
    }
}

