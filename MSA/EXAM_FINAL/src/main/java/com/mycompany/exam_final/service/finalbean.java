/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/StatelessEjbClass.java to edit this template
 */
package com.mycompany.exam_final.service;

import java.util.Collection;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Vivek
 */
@Stateless
public class finalbean {

    @PersistenceContext(unitName = "finalpu")
    EntityManager em;
    
    public Collection<TblState> getallstates(){
        return em.createNamedQuery("TblState.findAll").getResultList();
    }
    
    public Collection<TblCity> getcity(Integer stateId){
        TblState state = em.find(TblState.class, stateId);
        return em.createNamedQuery("TblCity.findByStateId").setParameter("stateId",state).getResultList();
    }
}
