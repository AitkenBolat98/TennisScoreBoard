package module;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name = "Matches")
@Table(name = "matches")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Matches {
    @Id
    @SequenceGenerator( name = "match_sequence",
                        sequenceName = "match_sequence",
                        allocationSize = 1)
    @GeneratedValue( strategy = GenerationType.SEQUENCE,
                     generator = "match_sequence")
    @Column(name = "id",
            updatable = false)
    private Long id;

    private Players player1;

    private Players player2;

    private Players winner;
}
