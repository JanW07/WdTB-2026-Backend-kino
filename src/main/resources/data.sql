-- Dane startowe aplikacji. Tabele tworzy Hibernate z encji, a ten plik Spring Boot uruchamia zaraz potem.
-- LAB 01: dopiszcie tu konta wszystkich osób z zespołu (reguła R1.03).
-- LAB 02: dopiszcie dane do swoich tabel (kolejność: najpierw tabele, na które wskazują klucze obce).
insert into user_account (email, display_name, role, created_at) values
    ('ola@student.merito.pl',   'Ola',   'USER',    current_timestamp),
    ('kuba@student.merito.pl',  'Kuba',  'USER',    current_timestamp),
    ('firma@example.com',       'Firma', 'PARTNER', current_timestamp),
    ('admin@example.com',       'Admin', 'ADMIN',   current_timestamp);

-- LAB 01: Wasze konta (zmieńcie na swoje dane, rola USER)
-- insert into user_account (email, display_name, role, created_at) values
--     ('imie.nazwisko@student.merito.pl', 'Imię', 'USER', current_timestamp);
insert into user_account (email, display_name, role, created_at) values
    ('jan.worozanski@student.merito.pl',  'Jan',    'USER', current_timestamp),
    ('michal.zielinski@student.merito.pl', 'Michał', 'USER', current_timestamp),
    ('dawid.laka@student.merito.pl',      'Dawid',  'USER', current_timestamp);

-- ===== LAB 02 · movie =====
insert into movie (title, duration_minutes, genre, release_date) values
    ('Diuna: Część druga',   166, 'SCI_FI', '2024-03-01'),
    ('Truman Show',          103, 'COMEDY', '1998-06-05'),
    ('Skazani na Shawshank', 142, 'DRAMA',  '1994-09-23');

-- ===== LAB 02 · hall =====
insert into hall (name, hall_number, seat_rows, seats_per_row) values
    ('Sala 1',   1, 10, 12),
    ('Sala 2',   2,  8, 10),
    ('Sala VIP', 3,  5,  6);

-- ===== LAB 02 · screening =====
insert into screening (starts_at, price, status, language) values
    ('2026-11-01 18:00:00', 28.00, 'SCHEDULED', 'PL'),
    ('2026-11-01 20:30:00', 32.00, 'SCHEDULED', 'EN'),
    ('2026-11-02 17:00:00', 25.00, 'SOLD_OUT',  'PL');
