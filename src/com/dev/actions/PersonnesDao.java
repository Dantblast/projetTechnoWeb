package com.dev.actions;


import java.util.List;

import org.db.Personnes;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
 
public class PersonnesDao {
    public boolean find(String name, String password) {
    	SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
    	Session session = sessionFactory.openSession();
        //session.beginTransaction();
        String sql = " from Personnes p where p.login=:name and p.password=:pass";
        Query query = session.createQuery(sql);
        query.setParameter("name", name);
        query.setParameter("pass", password);
        List<Personnes> list = query.list();
        if (list.size() > 0) {
            session.close();
            return true;
        }
        session.close();
        return false;
    }
}


