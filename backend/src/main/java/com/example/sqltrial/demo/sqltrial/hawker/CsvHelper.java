package com.example.sqltrial.demo.sqltrial.hawker;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.springframework.web.multipart.MultipartFile;

public class CsvHelper {
//    public static String TYPE = "text/csv";
//    static String[] HEADERs = { "Name", "Address", "OperationHours" };
//    public static boolean hasCSVFormat(MultipartFile file) {
//        if (!TYPE.equals(file.getContentType())) {
//            return false;
//        }
//        return true;
//    }
//    public static List<HawkerStall> csvToTutorials(InputStream is) {
//        try (BufferedReader fileReader = new BufferedReader(new InputStreamReader(is, "UTF-8"));
//             CSVParser csvParser = new CSVParser(fileReader,
//                     CSVFormat.DEFAULT.withFirstRecordAsHeader().withIgnoreHeaderCase().withTrim());) {
//            List<HawkerStall> stalls = new ArrayList<HawkerStall>();
//            Iterable<CSVRecord> csvRecords = csvParser.getRecords();
//            for (CSVRecord csvRecord : csvRecords) {
//                HawkerStall stall = new HawkerStall(
//                        csvRecord.get("Name"),
//                        csvRecord.get("Address"),
//                        csvRecord.get("OperationHours")
//                );
//                System.out.println(stall.toString());
//                stalls.add(stall);
//
//            }
//            return stalls;
//        } catch (IOException e) {
//            throw new RuntimeException("fail to parse CSV file: " + e.getMessage());
//        }
//    }
}