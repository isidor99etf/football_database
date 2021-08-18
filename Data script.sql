-- Drzava --
insert into drzava (naziv) values ('England'), ('France'), ('Spain'), ('Germany'), ('Italy');
insert into drzava (naziv) values ('Senegal');
insert into drzava (naziv) values ('Uruguay');
insert into drzava (naziv) values ('Portugal');
insert into drzava (naziv) values ('Egypt');
insert into drzava (naziv) values ('South Korea');

-- Grad --
insert into grad (idDrzava, naziv) values (1, 'London'), (1, 'Manchester'), (1, 'Liverpool');
insert into grad (idDrzava, naziv) values (2, 'Paris'), (2, 'Lyon');
insert into grad (idDrzava, naziv) values (3, 'Madrid'), (3, 'Barcelona'), (3, 'Valencia');
insert into grad (idDrzava, naziv) values (4, 'Berlin'), (4, 'Frankfurt'), (4, 'Munich');
insert into grad (idDrzava, naziv) values (5, 'Rome'), (5, 'Naples'), (5, 'Milan');
insert into grad (idDrzava, naziv) values (1, 'Portsmouth');
insert into grad (idDrzava, naziv) values (4, 'Aachen');
insert into grad (idDrzava, naziv) values (6, 'Sedhiou');
insert into grad (idDrzava, naziv) values (7, 'Salto');
insert into grad (idDrzava, naziv) values (8, 'Maia');
insert into grad (idDrzava, naziv) values (1, 'Stockport');
insert into grad (idDrzava, naziv) values (3, 'Foios');
insert into grad (idDrzava, naziv) values (1, 'Walthamstow');
insert into grad (idDrzava, naziv) values (9, 'Nagrig');
insert into grad (idDrzava, naziv) values (10, 'Chuncheon-si');

-- Admin --
insert into administrator (korisnickoIme, lozinka) values ('admin', 'admin123');

-- Stadion --
insert into stadion (naziv, kapacitet) values ('Old Trafford', 74140), ('Stamford Bridge', 41837), ('Anfield', 61905), ('White Hart Lane', 36284);
insert into stadion (naziv, kapacitet) values ('Etihad', 55017), ('Emirates', 60704);
insert into stadion (naziv, kapacitet) values ('Santiago Bernabeu', 81044);

-- Klubovi --
insert into klub (ime, grb, idStadion, idGrad) values ('Chelsea F.C.', null, 3, 1);
insert into klub (ime, grb, idStadion, idGrad) values ('Manchester United F.C.', null, 2, 2);
insert into klub (ime, grb, idStadion, idGrad) values ('Manchester City F.C.', null, 6, 2);
insert into klub (ime, grb, idStadion, idGrad) values ('Arsenal F.C.', null, 7, 1);
insert into klub (ime, grb, idStadion, idGrad) values ('Tottenham Hotspur F.C.', null, 5, 1);
insert into klub (ime, grb, idStadion, idGrad) values ('Liverpool F.C.', null, 4, 3);
insert into klub (ime, grb, idStadion, idGrad) values ('Real Madrid CF', null, 8, 6);

-- Sezone -- 
insert into sezona (oznakaSezone) values ('20/21'), ('19/20'), ('18/19');

-- Lige --
insert into liga (naziv, idDrzava) values ('Premier League', 1), ('Bundesliga', 4), ('Seria A', 5);

-- Tabela --
insert into tabela (idLiga, idSezona, brojKlubova) values (1, 1, 6);

-- Utakmice --
insert into utakmica (datumVrijeme, kolo, idSezona, idLiga, idDomaci, idGosti) values ('2021-08-22 17:00:00', 1, 1, 1, 1, 4);
insert into utakmica (datumVrijeme, kolo, idSezona, idLiga, idDomaci, idGosti) values ('2021-08-24 17:00:00', 1, 1, 1, 2, 5);
insert into utakmica (datumVrijeme, kolo, idSezona, idLiga, idDomaci, idGosti) values ('2021-08-22 17:00:00', 1, 1, 1, 6, 3);

insert into utakmica (datumVrijeme, kolo, idSezona, idLiga, idDomaci, idGosti) values ('2021-09-01 17:00:00', 2, 1, 1, 6, 1);
insert into utakmica (datumVrijeme, kolo, idSezona, idLiga, idDomaci, idGosti) values ('2021-09-01 14:00:00', 2, 1, 1, 5, 4);
insert into utakmica (datumVrijeme, kolo, idSezona, idLiga, idDomaci, idGosti) values ('2021-08-31 21:30:00', 2, 1, 1, 3, 2);

insert into utakmica (datumVrijeme, kolo, idSezona, idLiga, idDomaci, idGosti) values ('2021-09-08 12:00:00', 3, 1, 1, 1, 2);
insert into utakmica (datumVrijeme, kolo, idSezona, idLiga, idDomaci, idGosti) values ('2021-09-10 17:45:00', 3, 1, 1, 4, 6);
insert into utakmica (datumVrijeme, kolo, idSezona, idLiga, idDomaci, idGosti) values ('2021-09-09 19:30:00', 3, 1, 1, 3, 5);

-- Osobe --
insert into osoba (ime, prezime, datumRodjenja, idGradRodjenja) values ('Mason', 'Mount', '1999-01-10', 15);
insert into osoba (ime, prezime, datumRodjenja, idGradRodjenja) values ('Kai', 'Havertz', '1999-06-11', 16);
insert into osoba (ime, prezime, datumRodjenja, idGradRodjenja) values ('Sadio', 'Mane', '1992-03-10', 17);
insert into osoba (ime, prezime, datumRodjenja, idGradRodjenja) values ('Edinson', 'Cavani', '1987-02-14', 18);
insert into osoba (ime, prezime, datumRodjenja, idGradRodjenja) values ('Bruno', 'Fernandes', '1994-09-08', 19);
insert into osoba (ime, prezime, datumRodjenja, idGradRodjenja) values ('Phil', 'Foden', '2000-05-28', 20);
insert into osoba (ime, prezime, datumRodjenja, idGradRodjenja) values ('Ferran', 'Torres', '2000-02-29', 21);
insert into osoba (ime, prezime, datumRodjenja, idGradRodjenja) values ('Harry', 'Kane', '1993-07-28', 22);
insert into osoba (ime, prezime, datumRodjenja, idGradRodjenja) values ('Mohamed', 'Salah', '1992-06-15', 23);
insert into osoba (ime, prezime, datumRodjenja, idGradRodjenja) values ('Son', 'Heung-min', '1992-07-08', 24);

-- Fudbaleri --
insert into fudbaler (idOsoba, visina, tezina, noga, specijalnost) values (1, 178, 70, 'right', 'Free kicks');
insert into fudbaler (idOsoba, visina, tezina, noga, specijalnost) values (11, 180, 77, 'both', 'One-to-one');
insert into fudbaler (idOsoba, visina, tezina, noga, specijalnost) values (3, 189, 82, 'left', 'Shoot');
insert into fudbaler (idOsoba, visina, tezina, noga, specijalnost) values (4, 175, 76, 'right', 'One-to-one');
insert into fudbaler (idOsoba, visina, tezina, noga, specijalnost) values (5, 184, 71, 'right', 'Finish');
insert into fudbaler (idOsoba, visina, tezina, noga, specijalnost) values (6, 179, 69, 'right', 'Assists');
insert into fudbaler (idOsoba, visina, tezina, noga, specijalnost) values (7, 171, 70, 'left', null);
insert into fudbaler (idOsoba, visina, tezina, noga, specijalnost) values (8, 184, 77, 'right', 'Crossing');
insert into fudbaler (idOsoba, visina, tezina, noga, specijalnost) values (9, 188, 86, 'right', 'Finishing');
insert into fudbaler (idOsoba, visina, tezina, noga, specijalnost) values (10, 175, 71, 'left', 'Dribbling');

-- Pozicija na tabeli -
insert into pozicija_na_tabeli (idLiga, idSezona, idKlub, brojPostignutihGolova, brojPrimljenihGolova, brojBodova) values (1, 1, 1, 0, 0, 0);
insert into pozicija_na_tabeli (idLiga, idSezona, idKlub, brojPostignutihGolova, brojPrimljenihGolova, brojBodova) values (1, 1, 2, 0, 0, 0);
insert into pozicija_na_tabeli (idLiga, idSezona, idKlub, brojPostignutihGolova, brojPrimljenihGolova, brojBodova) values (1, 1, 3, 0, 0, 0);
insert into pozicija_na_tabeli (idLiga, idSezona, idKlub, brojPostignutihGolova, brojPrimljenihGolova, brojBodova) values (1, 1, 4, 0, 0, 0);
insert into pozicija_na_tabeli (idLiga, idSezona, idKlub, brojPostignutihGolova, brojPrimljenihGolova, brojBodova) values (1, 1, 5, 0, 0, 0);
insert into pozicija_na_tabeli (idLiga, idSezona, idKlub, brojPostignutihGolova, brojPrimljenihGolova, brojBodova) values (1, 1, 6, 0, 0, 0);

-- Gol --
insert into gol (idOsoba, idUtakmica, idKlub, autogol, minuta) values (1, 5, 1, false, 15);
insert into gol (idOsoba, idUtakmica, idKlub, autogol, minuta) values (1, 5, 1, false, 35);

