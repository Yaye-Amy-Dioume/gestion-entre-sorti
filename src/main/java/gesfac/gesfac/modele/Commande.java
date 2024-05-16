package gesfac.gesfac.modele;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
@Entity
@Table(name = "commande")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Commande {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Long id;
    private String nomClient;
    private String adresseClient;
    private String telephoneClient;
    private Date dateCommande;
    private Double montant;
    private  String etatCommande;
}
