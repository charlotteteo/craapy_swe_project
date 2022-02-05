package com.example.sqltrial.demo.sqltrial.carpark;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
@Controller
@RequestMapping("/api/csv")
public class CarparkController {


    CarparkService fileService;

    @Autowired
    public CarparkController(CarparkService fileService){
        this.fileService= fileService;
    }

    @GetMapping("/carparks")
    public ResponseEntity<List<Carpark>> getAllCarparks() {
        System.out.println("REQUEST");
        try {
            List<Carpark> carparks = fileService.getAllCarparks();
            if (carparks.isEmpty()) {
//                for(HawkerStall s: tutorials){
//                    System.out.println(s.toString());
//                }
//                System.out.println("success");

                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(carparks, HttpStatus.OK);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Failed");
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
