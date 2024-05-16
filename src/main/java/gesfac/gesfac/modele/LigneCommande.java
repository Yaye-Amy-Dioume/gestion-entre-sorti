package gesfac.gesfac.modele;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="ligneCommande")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor

public class LigneCommande {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer quantite;
    private Double prix;
    private Double montant;
}
