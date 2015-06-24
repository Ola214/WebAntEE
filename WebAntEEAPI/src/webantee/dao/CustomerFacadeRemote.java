/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webantee.dao;

import java.util.List;
import javax.ejb.Remote;
import webantee.model.Customer;

/**
 *
 * @author Olaa
 */
@Remote
public interface CustomerFacadeRemote {

    void create(Customer customer);

    void edit(Customer customer);

    void remove(Customer customer);

    Customer find(Object id);

    List<Customer> findAll();

    List<Customer> findRange(int[] range);

    int count();
    
}
