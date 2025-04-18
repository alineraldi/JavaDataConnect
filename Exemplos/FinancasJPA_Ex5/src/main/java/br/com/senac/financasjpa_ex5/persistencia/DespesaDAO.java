package br.com.senac.financasjpa_ex5.persistencia;

import jakarta.persistence.EntityManager;

public class DespesaDAO {
    public void cadastrar(Despesa d) {
        EntityManager em = JPAUtil.getEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(d);
            em.getTransaction().commit();
        } catch (Exception sqle) {
            em.getTransaction().rollback();
            throw sqle;
        }
        finally {
            JPAUtil.closeEntityManager();
        }
    }
}
