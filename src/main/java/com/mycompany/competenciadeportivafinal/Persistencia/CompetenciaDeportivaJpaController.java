/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.competenciadeportivafinal.Persistencia;

import com.mycompany.competenciadeportivafinal.Persistencia.exceptions.NonexistentEntityException;
import com.mycompany.competenciadeportivafinal.logica.CompetenciaDeportiva;
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
public class CompetenciaDeportivaJpaController implements Serializable {

    public CompetenciaDeportivaJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    public CompetenciaDeportivaJpaController(){
    emf= Persistence.createEntityManagerFactory ("CompePU");
    }
    
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(CompetenciaDeportiva competenciaDeportiva) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(competenciaDeportiva);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(CompetenciaDeportiva competenciaDeportiva) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            competenciaDeportiva = em.merge(competenciaDeportiva);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = competenciaDeportiva.getId();
                if (findCompetenciaDeportiva(id) == null) {
                    throw new NonexistentEntityException("The competenciaDeportiva with id " + id + " no longer exists.");
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
            CompetenciaDeportiva competenciaDeportiva;
            try {
                competenciaDeportiva = em.getReference(CompetenciaDeportiva.class, id);
                competenciaDeportiva.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The competenciaDeportiva with id " + id + " no longer exists.", enfe);
            }
            em.remove(competenciaDeportiva);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<CompetenciaDeportiva> findCompetenciaDeportivaEntities() {
        return findCompetenciaDeportivaEntities(true, -1, -1);
    }

    public List<CompetenciaDeportiva> findCompetenciaDeportivaEntities(int maxResults, int firstResult) {
        return findCompetenciaDeportivaEntities(false, maxResults, firstResult);
    }

    private List<CompetenciaDeportiva> findCompetenciaDeportivaEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(CompetenciaDeportiva.class));
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

    public CompetenciaDeportiva findCompetenciaDeportiva(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(CompetenciaDeportiva.class, id);
        } finally {
            em.close();
        }
    }

    public int getCompetenciaDeportivaCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<CompetenciaDeportiva> rt = cq.from(CompetenciaDeportiva.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
