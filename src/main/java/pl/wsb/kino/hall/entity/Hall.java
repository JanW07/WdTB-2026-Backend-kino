package pl.wsb.kino.hall.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import pl.wsb.kino.screening.entity.Screening;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "hall")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Hall {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false, length = 40)
    private String name;

    @Column(name = "hall_number", nullable = false)
    private Integer hallNumber;

    @Embedded
    private SeatLayout layout;

    @OneToMany(mappedBy = "hall", fetch = FetchType.LAZY)
    private List<Screening> screenings = new ArrayList<>();
}
