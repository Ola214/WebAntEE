/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webantee.dao;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import webantee.model.Purchase;

/**
 *
 * @author Olaa
 */
@Stateless
public class PurchaseFacade extends AbstractFacade<Purchase> implements webantee.dao.PurchaseFacadeRemote {
    @PersistenceContext(unitName = "WebAntEE-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PurchaseFacade() {
        super(Purchase.class);
    }
    
}
