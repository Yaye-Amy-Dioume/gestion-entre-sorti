package gesfac.gesfac.modele;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="stock")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor

public class Stock {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;
    private String designation;
    private Integer quantite;
    private Double prix;
    private String etat;
}
