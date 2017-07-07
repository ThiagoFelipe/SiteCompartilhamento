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

    private static final String PERSISTENCE_UNIT = "sitecompartilhamentoUP";
    private static MyConection instance;
    private static EntityManagerFactory factory;
    private EntityManager entityManager;

    private MyConection() {
        factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT);
    }

    public static synchronized MyConection newInstance() {
        if (instance == null) {
            instance = new MyConection();
        }
        return instance;
    }

    public EntityManager getEntityManager() {
        if (entityManager == null || !entityManager.isOpen()) {
            entityManager = factory.createEntityManager();
        }
        return entityManager;
    }

}