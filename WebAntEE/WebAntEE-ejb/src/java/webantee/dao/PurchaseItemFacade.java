/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webantee.dao;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import webantee.model.PurchaseItem;

/**
 *
 * @author Olaa
 */
@Stateless
public class PurchaseItemFacade extends AbstractFacade<PurchaseItem> implements webantee.dao.PurchaseItemFacadeRemote {
    @PersistenceContext(unitName = "WebAntEE-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PurchaseItemFacade() {
        super(PurchaseItem.class);
    }
    
}
