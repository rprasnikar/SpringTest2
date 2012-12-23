/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package at.indra_prasnikar.springtest2;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author robert
 */
public class MyOrderDAOImpl implements MyOrderDAO{
    
    @PersistenceContext
    private EntityManager em;

    public MyOrder getOrder(short orderId) {
       Query query = em.createQuery("SELECT m FROM MyOrder m WHERE m.orderid = :orderid");
       query.setParameter("orderid", orderId);
       return (MyOrder) query.getResultList().get(0); 
    }
    
}
