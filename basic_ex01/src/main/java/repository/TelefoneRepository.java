package repository;

import entity.Telefone;

import jakarta.persistence.EntityManager;

public class TelefoneRepository {
    private final EntityManager em;

    public TelefoneRepository(EntityManager em) {
        this.em = em;
    }

    public void save(Telefone telefone) {
        try {
            em.getTransaction().begin();
            em.persist(telefone);
            em.getTransaction().commit();
        } catch (Exception e) {
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
            throw new RuntimeException("Erro ao salvar telefone: " + e.getMessage());
        }
    }

    public void readAll() {
        em.createQuery("select t from Telefone t", Telefone.class)
                .getResultList()
                .forEach(System.out::println);
    }

    public Telefone findById(int id) {
        return em.find(Telefone.class, id);
    }

    public Telefone findByNumero(String numero) {
        return em.createQuery("select t from Telefone t where t.numero = :numero", Telefone.class)
                .setParameter("numero", numero)
                .getSingleResult();
    }

    public void update(int id, String numero) {
        try {
            em.getTransaction().begin();
            Telefone telefone = em.find(Telefone.class, id);
            if (telefone != null) {
                telefone.setNumero(numero);
            } else {
                System.out.println("Telefone não encontrado!");
                throw new RuntimeException("Erro ao realizar a consulta por ID.");
            }
            em.getTransaction().commit();
        } catch (Exception e) {
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
            throw new RuntimeException("Erro ao atualizar telefone: " + e.getMessage());
        }
    }

    public void delete(int id) {
        try {
            em.getTransaction().begin();
            Telefone telefone = em.find(Telefone.class, id);
            if (telefone != null) {
                em.remove(telefone);
            } else {
                System.out.println("Telefone não encontrado!");
                throw new RuntimeException("Erro ao realizar a consulta por ID.");
            }
            em.getTransaction().commit();
        } catch (Exception e) {
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
            throw new RuntimeException("Erro ao deletar telefone: " + e.getMessage());
        }
    }
}
