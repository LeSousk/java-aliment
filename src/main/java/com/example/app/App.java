package com.example.app;

import com.example.dao.DaoAlimentInterface;
import com.example.dao.DaoFactory;
import com.example.entities.Aliment;

public class App {


    public static void main(String[] args) {
        DaoAlimentInterface dao = (DaoAlimentInterface) DaoFactory.getAlimentDao();
        Aliment ali = new Aliment();
        ali.setName("rwd");

        dao.create(ali);

    }
}
