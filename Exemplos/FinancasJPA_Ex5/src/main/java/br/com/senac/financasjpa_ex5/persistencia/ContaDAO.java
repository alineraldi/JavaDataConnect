package br.com.senac.financasjpa_ex5.persistencia;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import java.util.ArrayList;
import java.util.List;

public class ContaDAO {
    
    public List<Conta> listar() {
        EntityManager em = JPAUtil.getEntityManager();
        
        List<Conta> contas = new ArrayList<>();
        try {
            Query consulta = em.createQuery("SELECT c FROM Conta c");
            
            contas = consulta.getResultList();
        } catch(Exception e) {
            em.getTransaction().rollback();
            throw e;
        }
        finally {
            JPAUtil.closeEntityManager();
        }
        return contas;
        
    }
}
