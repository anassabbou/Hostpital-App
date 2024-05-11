package com.abbou.hostpitalapp.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
@NoArgsConstructor @AllArgsConstructor @Getter @Setter @ToString @Builder
@Entity
@Table(name="PATIENTS")
public class Patient {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private String prenom;
    private Date datenaissance;
    private int score;
    private boolean malade;

}
