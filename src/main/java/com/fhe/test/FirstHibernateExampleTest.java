package com.fhe.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.fhe.entity.Account;

/**
 * @author Kiran
 *
 */
public class FirstHibernateExampleTest {

		
		Configuration configuration = null;
		SessionFactory sessionFactory = null;
		Session session = null;
		Account account = null;
		
		configuration = new Configuration().configure();	
		sessionFactory = configuration.buildSessionFactory();
		session = sessionFactory.openSession();
		
		account = session.get(Account.class, 1);
		
		System.out.println(account);
		
		
	}
}
