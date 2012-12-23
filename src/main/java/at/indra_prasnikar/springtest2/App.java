package at.indra_prasnikar.springtest2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        OrderService myService = (OrderService) ctx.getBean("orderService");
        System.out.println(myService.getOrder((short) 1));
    }
}
