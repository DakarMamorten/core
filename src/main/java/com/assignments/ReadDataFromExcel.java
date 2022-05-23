package com.assignments;

import lombok.SneakyThrows;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ReadDataFromExcel {
    @SneakyThrows
    public static void main(String[] args) {
        FileInputStream file = new FileInputStream(new File("D:\\Person.xlsx"));
        Workbook workbook = new XSSFWorkbook(file);
        Sheet sheet = workbook.getSheetAt(0);
        List<Person> list = new ArrayList<>();
        Person person = new Person();
        Map<Integer, List<String>> data = new HashMap<>();
        int i = 0;

        for (Row row : sheet) {
            data.put(i, new ArrayList<>());
            for (Cell cell : row) {
                data.get(i).add(cell.getStringCellValue());
            }
            i++;
        }

        for (List<String> value : data.values()) {
            for (int j = 0; j < value.size(); j++) {
                 person = new Person(value.get(0), value.get(1), value.get(2));
            }
            list.add(person);

        }
        System.out.println(list);
    }
}



