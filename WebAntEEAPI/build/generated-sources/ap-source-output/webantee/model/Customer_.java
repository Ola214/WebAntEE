package webantee.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import webantee.model.Purchase;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-06-24T13:12:27")
@StaticMetamodel(Customer.class)
public class Customer_ { 

    public static volatile SingularAttribute<Customer, String> surname;
    public static volatile SingularAttribute<Customer, String> name;
    public static volatile SingularAttribute<Customer, Integer> id;
    public static volatile SingularAttribute<Customer, String> email;
    public static volatile ListAttribute<Customer, Purchase> purchaseList;

}