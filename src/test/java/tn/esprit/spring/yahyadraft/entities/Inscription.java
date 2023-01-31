package tn.esprit.spring.yahyadraft.entities;


import javax.persistence.*;

@Entity
@Table( name = "Inscription")
public class Inscription {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "numInscription")
    private Long numInscription; // Clé primaire
    private Long numSemaine;
}
