package tn.esprit.spring.yahyadraft.entities;

import javax.persistence.*;


@Entity
@Table( name = "Cours")
public class Cours {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "numCours")
    private Long numCours; // Clé primaire
    private int niveau;
    @Enumerated(EnumType.STRING)
    private TypeCours TypeCours;
    private float prix;
    private int creneau;
    @Enumerated(EnumType.STRING)
    private Support Support;
}
