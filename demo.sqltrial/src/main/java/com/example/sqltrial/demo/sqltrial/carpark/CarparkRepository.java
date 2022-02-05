package com.example.sqltrial.demo.sqltrial.carpark;

import com.example.sqltrial.demo.sqltrial.hawker.HawkerStall;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;




@Repository
public interface CarparkRepository extends JpaRepository<Carpark, String> {

}
