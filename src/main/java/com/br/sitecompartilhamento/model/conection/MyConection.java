/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.sitecompartilhamento.model.conection;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author thiag
 */
public class MyConection {
    
    private static final String PERSISTENCEUNIT = "sitecompartilhamentoUP";
    private EntityManagerFactory factory;
    private EntityManager entidyManager;

    public EntityManager getEntidyManager() {
        return entidyManager;
    }

    public MyConection() {
        factory = Persistence.createEntityManagerFactory(PERSISTENCEUNIT);
        entidyManager = factory.createEntityManager();
    }
    
    
}
