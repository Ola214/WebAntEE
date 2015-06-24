package webantee.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import webantee.model.PurchaseItem;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-06-24T13:12:27")
@StaticMetamodel(Product.class)
public class Product_ { 

    public static volatile SingularAttribute<Product, Integer> price;
    public static volatile SingularAttribute<Product, String> name;
    public static volatile SingularAttribute<Product, Integer> id;
    public static volatile ListAttribute<Product, PurchaseItem> purchaseItemList;

}