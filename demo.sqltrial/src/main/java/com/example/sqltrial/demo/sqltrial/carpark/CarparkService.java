package com.example.sqltrial.demo.sqltrial.carpark;

import com.example.sqltrial.demo.sqltrial.hawker.HawkerRepository;
import com.example.sqltrial.demo.sqltrial.hawker.HawkerStall;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;



@Service
public class CarparkService {

    private CarparkRepository repository;

    @Autowired
    public CarparkService(CarparkRepository repository){
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
    public List<Carpark> getAllCarparks() {
        return repository.findAll();
    }
}

