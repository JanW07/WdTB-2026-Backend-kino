package pl.wsb.kino.hall.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Embeddable
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SeatLayout {

    @Column(name = "seat_rows", nullable = false)
    private Integer rows;

    @Column(name = "seats_per_row", nullable = false)
    private Integer seatsPerRow;
}
