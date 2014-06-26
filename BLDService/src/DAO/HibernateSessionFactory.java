package DAO;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class HibernateSessionFactory {
	public static Session getSession(){
		SessionFactory sf = new Configuration().configure()
		.buildSessionFactory();
		Session session = sf.openSession();
		return session;
	}
}
