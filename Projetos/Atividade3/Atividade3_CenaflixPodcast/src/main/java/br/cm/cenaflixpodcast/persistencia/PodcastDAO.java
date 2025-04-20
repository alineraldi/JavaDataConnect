package br.cm.cenaflixpodcast.persistencia;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class PodcastDAO {
    public void cadastrar(Podcast p) {
        EntityManager em = JPAUtil.getEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(p);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            throw e;
        }
        finally {
            JPAUtil.closeEntityManager();
        }
    }
    
    public List<Podcast> listar(String filtroProdutor){
        EntityManager em = JPAUtil.getEntityManager();
        List<Podcast> podcasts = null;
        try {
            String textoQuery = "SELECT d FROM Podcast p "+
                    "WHERE (:produtor is null OR p.produtor LIKE :produtor";
            Query consulta = em.createQuery(textoQuery);
            
            consulta.setParameter("produtor", filtroProdutor.isEmpty() ? null : "%" + filtroProdutor + "%");
            
            podcasts = consulta.getResultList();
        } finally {
            JPAUtil.closeEntityManager();
        }
        return podcasts;
    }
    
}
