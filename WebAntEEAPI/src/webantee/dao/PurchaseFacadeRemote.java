/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webantee.dao;

import java.util.List;
import javax.ejb.Remote;
import webantee.model.Purchase;

/**
 *
 * @author Olaa
 */
@Remote
public interface PurchaseFacadeRemote {

    void create(Purchase purchase);

    void edit(Purchase purchase);

    void remove(Purchase purchase);

    Purchase find(Object id);

    List<Purchase> findAll();

    List<Purchase> findRange(int[] range);

    int count();
    
}
