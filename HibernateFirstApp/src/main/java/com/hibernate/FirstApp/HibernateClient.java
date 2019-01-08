package com.hibernate.FirstApp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HibernateClient {

	public static void main(String[] args) {
		// test hibernate action here
		
		Configuration cfg=new Configuration();
		cfg.configure();
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		User user = new User("jerry2","jerryjcj@hotmail.com","guang zhou, china");
		s.save(user);
		
		Transaction tx=s.beginTransaction();
		tx.commit();
		
		s.close();
		sf.close();
		
		System.out.println("this is to insert record into userinfo table, action is done!!!");
		
	}

}
