-- Drzava --
insert into drzava (naziv) values ('England'), ('France'), ('Spain'), ('Germany'), ('Italy');

-- Grad --
insert into grad (idDrzava, naziv) values (1, 'London'), (1, 'Manchester'), (1, 'Liverpool');
insert into grad (idDrzava, naziv) values (2, 'Paris'), (2, 'Lyon');
insert into grad (idDrzava, naziv) values (3, 'Madrid'), (3, 'Barcelona'), (3, 'Valencia');
insert into grad (idDrzava, naziv) values (4, 'Berlin'), (4, 'Frankfurt'), (4, 'Munich');
insert into grad (idDrzava, naziv) values (5, 'Rome'), (5, 'Naples'), (5, 'Milan');

-- Admin --
insert into administrator (korisnickoIme, lozinka) values ('admin', 'admin123');

-- Stadium --
insert into stadion (naziv, kapacitet) values ('Camp Nou', 99354), ('Old Trafford', 74140), ('Stamford Bridge', 41837), ('Anfield', 61905), ('White Hart Lane', 36284);
insert into stadion (naziv, kapacitet) values ('Etihad', 55017), ('Emirates', 60704);

-- Clubs --
insert into klub (ime, grb, idStadion, idGrad) values ('Chelsea F.C.', null, 3, 1);
insert into klub (ime, grb, idStadion, idGrad) values ('Manchester United F.C.', null, 2, 2);
insert into klub (ime, grb, idStadion, idGrad) values ('Manchester City F.C.', null, 6, 2);
insert into klub (ime, grb, idStadion, idGrad) values ('Arsenal F.C.', null, 7, 1);
insert into klub (ime, grb, idStadion, idGrad) values ('Tottenham Hotspur F.C.', null, 5, 1);
insert into klub (ime, grb, idStadion, idGrad) values ('Liverpool F.C.', null, 4, 3);

-- Sezone -- 
insert into sezona (oznakaSezone) values ('20/21'), ('19/20'), ('18/19');

-- Lige --
insert into liga (naziv, idDrzava) values ('Premier League', 1), ('Bundesliga', 4), ('Seria A', 5);

