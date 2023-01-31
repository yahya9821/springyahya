package tn.esprit.spring.yahyadraft.entities;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

public class Moniteur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "numMoniteur")
    private long numMoniteur;
    private String nomM;
    private String prenomM;
    private Date dateRecu;

}
