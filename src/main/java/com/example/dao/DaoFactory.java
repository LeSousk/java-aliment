package com.example.dao;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DaoFactory {

    static SessionFactory sessionFactory;

    public static DaoAlimentImpl getAlimentDao(){
        return new DaoAlimentImpl();
    }

    public static SessionFactory getSessionFactory() {
        if (sessionFactory==null) {
            sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
//            final StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
//                    .configure()
//                    .build();
//
//            try {
//                sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
//            } catch (Exception e) {
//                StandardServiceRegistryBuilder.destroy(re);
//            }
        }
        return sessionFactory;
    }
}
