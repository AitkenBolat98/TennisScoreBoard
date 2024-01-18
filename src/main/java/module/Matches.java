package module;

import jakarta.persistence.*;
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
    @GeneratedValue
    private Integer id;
    @OneToOne
    private Players player1;
    @OneToOne
    private Players player2;
    @OneToOne
    private Players winner;
}
