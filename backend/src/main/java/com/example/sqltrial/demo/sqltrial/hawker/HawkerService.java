package com.example.sqltrial.demo.sqltrial.hawker;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HawkerService {

        private HawkerRepository repository;

        @Autowired
        public HawkerService(HawkerRepository repository){
            this.repository= repository;
        }

//        public void save(MultipartFile file) {
//            try {
//                List<HawkerStall> stalls = CsvHelper.csvToTutorials(file.getInputStream());
//                repository.saveAll(stalls);
//            } catch (IOException e) {
//                throw new RuntimeException("fail to store csv data: " + e.getMessage());
//            }
//        }
        public List<HawkerStall> getAllStalls() {
            return repository.findAll();
        }
    }

