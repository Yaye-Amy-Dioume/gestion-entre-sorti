package gesfac.gesfac.modele;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@Table(name="sortie")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor

public class Sortie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date date;
    private Double prix;
    private Integer quantite;
}
