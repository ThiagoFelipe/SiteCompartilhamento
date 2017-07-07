/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sitecompartilhamento.model.connection;

import com.br.sitecompartilhamento.model.conection.MyConection;
import javax.persistence.EntityManager;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author thiag
 */
public class ConnectionTest {

    private final EntityManager entityManager;

    public ConnectionTest() {
        entityManager = MyConection.newInstance().getEntityManager();
    }

    @Test
    public void hasNotNullEntityManager() {
        Assert.assertNotNull(entityManager);
    }

    @Test
    public void isEntityManagerOpen() {
        Assert.assertTrue(entityManager.isOpen());
    }
}
