package module;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name = "Players")
@Table(name = "players")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class  Players {

    @Id
    @SequenceGenerator(name = "player_sequence",
                        sequenceName = "player_sequence",
                        allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
                    generator = "player_sequence")
    @Column(name = "id",
            updatable = false)
    private Long id;

    @Column(name = "name",
            nullable = false,
            columnDefinition = "TEXT")
    private String name;

}
