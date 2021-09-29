package com.example.service.helper;

import com.example.entity.Aliment;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

public class CsvHelper {

    public List<Aliment> parse() {
        Reader in;
        List<Aliment> aliments = new ArrayList<Aliment>();
        try {
            in = new FileReader("ciqual.csv");
            Iterable<CSVRecord> records = CSVFormat.EXCEL.parse(in);
            for (CSVRecord record : records) {
                Aliment aliment = new Aliment();

                aliment.setName(record.get(7));
                aliments.add(aliment);
                System.out.println(aliment.getName());
            }
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return aliments;
    }

}
