package com.example.service;
import com.example.dao.DaoAlimentInterface;
import com.example.dao.DaoFactory;
import com.example.entity.Aliment;
import com.example.service.helper.CsvHelper;

import java.util.List;

public class AlimentService {

    public void convertCsvToListAliment() {
        CsvHelper helper = new CsvHelper();
        List<Aliment> aliments = helper.parse();
        DaoAlimentInterface daoAliment = DaoFactory.getAlimentDao();

        for (Aliment ali :aliments) {
            daoAliment.create(ali);
        }
    }

}
