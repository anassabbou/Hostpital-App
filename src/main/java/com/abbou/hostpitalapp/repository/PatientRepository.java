package com.abbou.hostpitalapp.repository;

import com.abbou.hostpitalapp.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient,Long> {


}
