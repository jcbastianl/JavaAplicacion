/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.competenciadeportivafinal.Persistencia;

import com.mycompany.competenciadeportivafinal.Persistencia.exceptions.NonexistentEntityException;
import com.mycompany.competenciadeportivafinal.logica.Jornada;
import com.mycompany.competenciadeportivafinal.logica.Liga;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/**
 *
 * @author Sebastian
 */
public class JornadaJpaController implements Serializable {

    public JornadaJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
        public JornadaJpaController(){
        emf = Persistence.createEntityManagerFactory("CompePU"); 
    }
        
    private EntityManagerFactory emf = null;


    
    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Jornada jornada) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(jornada);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Jornada jornada) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            jornada = em.merge(jornada);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = jornada.getId();
                if (findJornada(id) == null) {
                    throw new NonexistentEntityException("The jornada with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(int id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Jornada jornada;
            try {
                jornada = em.getReference(Jornada.class, id);
                jornada.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The jornada with id " + id + " no longer exists.", enfe);
            }
            em.remove(jornada);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Jornada> findJornadaEntities() {
        return findJornadaEntities(true, -1, -1);
    }

    public List<Jornada> findJornadaEntities(int maxResults, int firstResult) {
        return findJornadaEntities(false, maxResults, firstResult);
    }

    private List<Jornada> findJornadaEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Jornada.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public Jornada findJornada(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Jornada.class, id);
        } finally {
            em.close();
        }
    }

    public int getJornadaCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Jornada> rt = cq.from(Jornada.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    public List<Jornada> findJornadasByLiga(Liga liga) {
        EntityManager em = getEntityManager();
        try {
            Query query = em.createQuery("SELECT j FROM Jornada j WHERE j.liga = :liga");
            query.setParameter("liga", liga);
            return query.getResultList();
        } finally {
            em.close();
        }
    }
    public List<Liga> findByNombre(String nombreLiga) {
    EntityManager em = getEntityManager();
    try {
        Query query = em.createQuery("SELECT l FROM Liga l WHERE l.nombre = :nombreLiga");
        query.setParameter("nombreLiga", nombreLiga);
        return query.getResultList();
    } finally {
        em.close();
    }
}
}

