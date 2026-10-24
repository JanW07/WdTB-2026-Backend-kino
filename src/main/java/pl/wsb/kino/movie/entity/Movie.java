package pl.wsb.kino.movie.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Table(name = "movie")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "title", nullable = false, length = 120)
    private String title;

    @Column(name = "duration_minutes", nullable = false)
    private Integer durationMinutes;

    @Enumerated(EnumType.STRING)
    @Column(name = "genre", nullable = false, length = 20)
    private Genre genre;

    @Column(name = "release_date")
    private LocalDate releaseDate;
}
