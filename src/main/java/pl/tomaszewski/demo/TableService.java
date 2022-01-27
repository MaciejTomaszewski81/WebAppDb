package pl.tomaszewski.demo;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TableService {

    TableRepository tableRepository;

    public TableService(TableRepository tableRepository) {
        this.tableRepository = tableRepository;
    }

    public List<Table> findAllSorted(String sort, String sort1) {
        List<Table> tableList = new ArrayList<>();
        if (sort1.equals("2")) {

            switch (sort) {
                case "kolumna1":
                    tableList = tableRepository.findTable1Unique();
                    break;
                case "kolumna2":
                    tableList = tableRepository.findTable2Unique();
                    break;
                case "kolumna3":
                    tableList = tableRepository.findTable3Unique();
                    break;
                case "kolumna4":
                    tableList = tableRepository.findTable4Unique();
                    break;
            }
        }
        if (sort1.equals("1")) {
            switch (sort) {
                case "kolumna1":
                    tableList = tableRepository.findTable1Repeat();
                    break;
                case "kolumna2":
                    tableList = tableRepository.findTable2Repeat();
                    break;
                case "kolumna3":
                    tableList = tableRepository.findTable3Repeat();
                    break;
                case "kolumna4":
                    tableList = tableRepository.findTable4Repeat();
                    break;
            }
        }
        return tableList;
    }

    public List<Table> findAll() {
        return tableRepository.findAll();
    }
}