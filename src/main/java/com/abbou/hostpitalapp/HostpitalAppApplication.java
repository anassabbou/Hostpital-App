package com.abbou.hostpitalapp;

import com.abbou.hostpitalapp.entities.Patient;
import com.abbou.hostpitalapp.repository.PatientRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;
import java.util.List;

@SpringBootApplication
public class HostpitalAppApplication {

    public static void main(String[] args) {

        SpringApplication.run(HostpitalAppApplication.class, args);
    }
    @Bean
    public CommandLineRunner start(PatientRepository patientRepository){
        return args -> {
            //creation d'un patient: 3 methods
            //* constr sans args:
            Patient p1 = new Patient();
            p1.setNom("Abbou");
            p1.setScore(100);
            p1.setPrenom("Anass");
            p1.setDatenaissance(new Date());
            p1.setMalade(false);
            //* const avec args
            Patient p2=new Patient(null,"Abbou","hassan",new Date(),100,false);
            //* utilisation de @Builder def par Lombok-> design pattern
            Patient p3= Patient.builder()
                            .nom("khalid")
                            .prenom("abbou")
                            .datenaissance(new Date())
                            .build();
        patientRepository.save(p1);// save in DB
        patientRepository.save(p2);
        patientRepository.save(p3);

        List<Patient> patients=patientRepository.findAll();
        patients.forEach(p->{
            System.out.println(p.toString());
        });


        };
    }
}
