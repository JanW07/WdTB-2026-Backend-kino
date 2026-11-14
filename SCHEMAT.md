# Schemat bazy danych

Plik generują reguły projektu (panel Maven → Lifecycle → verify). Nie edytujcie go ręcznie.

Tabele: 8 (w tym tabele łączące @ManyToMany: reservation_seat) · kolumny: 37 · relacje: 5 × @ManyToOne, 1 × @OneToMany, 1 × @OneToOne, 1 × @ManyToMany

| Tabela | Encja | Kolumny | Klucze obce |
|---|---|---|---|
| hall | Hall | 5 | — |
| movie | Movie | 5 | — |
| payment | Payment | 5 | reservation_id |
| reservation | Reservation | 5 | screening_id, user_id |
| screening | Screening | 7 | hall_id, movie_id |
| seat | Seat | 5 | hall_id |
| user_account | UserAccount | 5 | — |

```mermaid
erDiagram
    hall {
        Long id PK
        Integer hall_number
        String name
        Integer seat_rows
        Integer seats_per_row
    }
    movie {
        Long id PK
        Integer duration_minutes
        Genre genre
        LocalDate release_date
        String title
    }
    payment {
        Long id PK
        BigDecimal amount
        PaymentMethod method
        LocalDateTime paid_at
        Long reservation_id FK
    }
    reservation {
        Long id PK
        LocalDateTime created_at
        Long screening_id FK
        ReservationStatus status
        Long user_id FK
    }
    screening {
        Long id PK
        Long hall_id FK
        String language
        Long movie_id FK
        BigDecimal price
        LocalDateTime starts_at
        ScreeningStatus status
    }
    seat {
        Long id PK
        Long hall_id FK
        Integer seat_number
        Integer seat_row
        SeatType seat_type
    }
    user_account {
        Long id PK
        LocalDateTime created_at
        String display_name
        String email
        AccountRole role
    }
    hall |o--o{ screening : "hall_id"
    hall |o--o{ seat : "hall_id"
    movie |o--o{ screening : "movie_id"
    reservation |o--o| payment : "reservation_id"
    reservation }o--o{ seat : "reservation_seat"
    screening |o--o{ reservation : "screening_id"
    user_account |o--o{ reservation : "user_id"
```
