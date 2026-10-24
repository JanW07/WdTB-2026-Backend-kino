package pl.wsb.kino.screening.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "screening")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Screening {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "starts_at", nullable = false)
    private LocalDateTime startsAt;

    @Column(name = "price", nullable = false, precision = 8, scale = 2)
    private BigDecimal price;

    @Enumerated(EnumType.STRING)
    @Column(name = "status", nullable = false, length = 20)
    private ScreeningStatus status;

    @Column(name = "language", length = 30)
    private String language;
}
