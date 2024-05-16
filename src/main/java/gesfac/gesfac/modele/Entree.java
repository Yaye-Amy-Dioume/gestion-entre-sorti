package gesfac.gesfac.modele;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
@Entity
@Table(name = "entree")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Entree {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Long id;
    private Date date;
    private Integer prix;
    private Integer quantite;
}
