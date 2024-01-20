package module;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity(name = "Matches")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Matches {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @OneToOne(fetch = FetchType.LAZY)
    private Players player1;
    @OneToOne(fetch =  FetchType.LAZY)
    private Players player2;
    @OneToOne(fetch = FetchType.LAZY)
    private Players winner;
}
