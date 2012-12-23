/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package at.indra_prasnikar.springtest2;

/**
 *
 * @author robert
 */
public class OrderServiceImpl implements OrderService{
    
    private MyOrderDAO myOrderDAO; 
    
    public OrderServiceImpl(MyOrderDAO newMyOrderDAO) {
        myOrderDAO = newMyOrderDAO;
    }

    public Integer getOrder(short aId) {
        System.out.println(myOrderDAO.getOrder(aId).getCountry());
        return 1;
    }
    
   
}
