package tn.esprit.spring.yahyadraft.entities;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table( name = "Skieur")
public class Skieur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "numSkieur")
    private Long numSkieur; // Clé primaire
    private String nomS;
    private String prenomS;
    private Date dateNaissance;
    private String ville;
}
