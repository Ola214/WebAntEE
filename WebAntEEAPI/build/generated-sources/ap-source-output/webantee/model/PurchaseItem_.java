package webantee.model;

import java.math.BigInteger;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import webantee.model.Product;
import webantee.model.PurchaseItem;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-06-24T13:12:27")
@StaticMetamodel(PurchaseItem.class)
public class PurchaseItem_ { 

    public static volatile SingularAttribute<PurchaseItem, PurchaseItem> idPurchase;
    public static volatile SingularAttribute<PurchaseItem, BigInteger> quantity;
    public static volatile SingularAttribute<PurchaseItem, Product> idProduct;
    public static volatile SingularAttribute<PurchaseItem, Integer> id;
    public static volatile ListAttribute<PurchaseItem, PurchaseItem> purchaseItemList;

}