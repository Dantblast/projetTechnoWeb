package org.Hibernate;

import org.db.Personnes;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateTest {

	public static void main(String[] args) {
		
		Personnes personnes = new Personnes();
		
		personnes.setId_personne(3);
		personnes.setNom("TestHib");
		personnes.setPrenom("hibernate");
		personnes.setDroit(2);
		personnes.setEmail("a@a.com");
		personnes.setLogin("aaa");
		personnes.setId_groupe("GR-2");
		personnes.setPassword("azerty");
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(personnes);
		session.getTransaction().commit();
		session.close();
		
		personnes = null;
		
		session = sessionFactory.openSession();
		/*session.beginTransaction();
		personnes = (Personnes) session.get(Personnes.class, 1);
		System.out.println("personne is "+ personnes.getNom());*/
		session.close();

	}

}
