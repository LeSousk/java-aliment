package com.example.app;

import com.example.dao.DaoAlimentInterface;
import com.example.dao.DaoFactory;
import com.example.entity.Aliment;
import com.example.service.AlimentService;

public class App {


    public static void main(String[] args) {
       /*   DaoAlimentInterface dao = DaoFactory.getAlimentDao();
       Aliment ali = new Aliment();
        ali.setName("rwd");

        dao.create(ali);*/

        AlimentService service = new AlimentService();
        service.convertCsvToListAliment();
        DaoFactory.getAlimentDao();
    }
}
