package webantee.model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import webantee.model.Customer;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-06-24T13:12:27")
@StaticMetamodel(Purchase.class)
public class Purchase_ { 

    public static volatile SingularAttribute<Purchase, Integer> id;
    public static volatile SingularAttribute<Purchase, Date> realisationDate;
    public static volatile SingularAttribute<Purchase, Customer> idCustomer;

}