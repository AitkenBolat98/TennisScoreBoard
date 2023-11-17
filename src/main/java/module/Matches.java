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
    @SequenceGenerator(name = "match_sequence",
            sequenceName = "match_sequence",
            allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "match_sequence")
    @Column(name = "id",
            updatable = false)
    private Long id;
    @ManyToOne()
    @JoinColumn(name = "player1_id",
                nullable = false,
                referencedColumnName = "id",
                foreignKey = @ForeignKey(
                        name = "player1_match_fk"
                ))
    private Players player1;

    @ManyToOne()
    @JoinColumn(name = "player2_id",
            nullable = false,
            referencedColumnName = "id",
            foreignKey = @ForeignKey(
                    name = "player2_match_fk"
            ))
    private Players player2;
    @ManyToOne()
    @JoinColumn(name = "winner_id",
                nullable = false,
                referencedColumnName = "id",
                foreignKey = @ForeignKey(
                        name = "winner_match_fk"
                ))
    private Players winner;
}
