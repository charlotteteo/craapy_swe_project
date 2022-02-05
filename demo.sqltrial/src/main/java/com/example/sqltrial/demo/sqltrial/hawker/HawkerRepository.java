package com.example.sqltrial.demo.sqltrial.hawker;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HawkerRepository extends JpaRepository<HawkerStall, String>{

}

