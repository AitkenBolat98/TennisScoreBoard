package module;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity(name = "Players")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class  Players {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;

    @Column()
    private String name;

}
