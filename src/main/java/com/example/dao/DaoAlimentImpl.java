package com.example.dao;

import com.example.entity.Aliment;
import org.hibernate.SessionFactory;
import org.hibernate.Session;

public class DaoAlimentImpl implements DaoAlimentInterface {
    public void getAliment(){
        System.out.println("c'est fait");
    }

    public void create(Aliment ali) {
        SessionFactory factory = DaoFactory.getSessionFactory();

        Session session = factory.openSession();
        session.save(ali);
        session.close();
    }
 }