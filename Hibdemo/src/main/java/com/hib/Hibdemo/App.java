package com.hib.Hibdemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	//create
       Names N=new Names();
    	N.setFname("Rambo");
    	N.setMname("Jack");
    	N.setLname("Son");
    	
    	Alian a=new Alian();
    	a.setId(3);
    	a.setName(N);
    	a.setAge(22);   	
    	Configuration con=new Configuration().configure().addAnnotatedClass(Alian.class);
    	
    	ServiceRegistry reg=new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
    	
    	SessionFactory sf = con.buildSessionFactory(reg);
    	
    	Session session = sf.openSession();
    	
    	Transaction tx =session.beginTransaction();

 // Read   	
 //    	a=(Alian)session.get(Alian.class,1);
//    	System.out.println(a);
    	
    	
//   	a=(Alian) session.get(Alian.class,1);
//    	System.out.println(a.getId()+" "+a.getName());
 	
    	
//    	a=(Alian)session.get(Alian.class,2);
     	
   	
    	
 //  	System.out.println(a);
 
    	
 //update
 //   a=(Alian) session.get(Alian.class,1);  	
   //	session.update(a);
 
  // only for create   	
    	session.save(a);
    	tx.commit();
    }
}
