package gesfac.gesfac.modele;

import jakarta.persistence.*;

@Entity
@Table(name = "Utilisateur")
public class Utilisateur {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String nom;
    private String email;
    private String motDePasse;
}
