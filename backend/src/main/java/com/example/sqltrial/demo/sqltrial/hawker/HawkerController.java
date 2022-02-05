package com.example.sqltrial.demo.sqltrial.hawker;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

//@CrossOrigin("http://localhost:8080")
@Controller
@RequestMapping("/api/csv")
public class HawkerController {

    HawkerService fileService;

    @Autowired
    public HawkerController(HawkerService fileService){
        this.fileService= fileService;
    }


//    @PostMapping("/upload")
//    public ResponseEntity<ResponseMessage> uploadFile(@RequestParam("file") MultipartFile file) {
//        String message = "";
//        if (CsvHelper.hasCSVFormat(file)) {
//            try {
//                fileService.save(file);
//                message = "Uploaded the file successfully: " + file.getOriginalFilename();
//                return ResponseEntity.status(HttpStatus.OK).body(new ResponseMessage(message));
//            } catch (Exception e) {
//                System.out.println(e);
//                message = "Could not upload the file: " + file.getOriginalFilename() + "!";
//                return ResponseEntity.status(HttpStatus.EXPECTATION_FAILED).body(new ResponseMessage(message));
//            }
//        }
//        message = "Please upload a csv file!";
//        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new ResponseMessage(message));
//    }

    @GetMapping("/stalls")
    public ResponseEntity<List<HawkerStall>> getAllStalls() {
        System.out.println("REQUEST");
        try {
            List<HawkerStall> stalls = fileService.getAllStalls();
            if (stalls.isEmpty()) {
//                for(HawkerStall s: tutorials){
//                    System.out.println(s.toString());
//                }
//                System.out.println("success");

                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
         return new ResponseEntity<>(stalls, HttpStatus.OK);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Failed");
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }




}