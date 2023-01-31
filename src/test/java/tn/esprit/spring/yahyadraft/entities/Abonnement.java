package tn.esprit.spring.yahyadraft.entities;

import javax.persistence.*;
import java.util.Date;

public class Abonnement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "numAbon")
    private long numAbon;
    private Date dateDebut;
    private Date datefin;
    private float prixAbon;

    @Enumerated(EnumType.STRING)
    private TypeAbonnement TypeAbonnement;


}
