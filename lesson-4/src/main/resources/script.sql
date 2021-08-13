use cinema;

CREATE TABLE `cinema`.`movie` (
                                  `id` INT NOT NULL AUTO_INCREMENT,
                                  `title` VARCHAR(45) NOT NULL,
                                  `duration` INT NOT NULL,
                                  PRIMARY KEY (`id`));
CREATE TABLE `cinema`.`prices` (
                                   `id` INT NOT NULL AUTO_INCREMENT,
                                   `price` DECIMAL(10,2) NOT NULL,
                                   PRIMARY KEY (`id`));

CREATE TABLE `cinema`.`schedule` (
                                     `id` INT NOT NULL AUTO_INCREMENT,
                                     `movie` INT NOT NULL,
                                     `price` INT NOT NULL,
                                     `begin_at` TIMESTAMP NOT NULL,
                                     PRIMARY KEY (`id`));

CREATE TABLE `cinema`.`tickets` (
                                    `id` INT NOT NULL AUTO_INCREMENT,
                                    `session` INT NOT NULL,
                                    PRIMARY KEY (`id`));


insert into movie (title, duration) values
('film1', 60),
('film2', 90),
('film3', 120),
('film4', 90),
('film5', 120);

insert into prices (price) values
(150),
(180),
(220),
(280);

insert into schedule (movie, price, begin_at) values
(1, 1, '2021-08-20 10:30:00'),
(2, 2, '2021-08-20 11:40:00'),
(2, 2, '2021-08-20 13:20:00'),
(4, 3, '2021-08-20 15:00:00'),
(3, 3, '2021-08-20 16:40:00'),/*cross*/
(4, 4, '2021-08-20 18:30:00'),
(5, 4, '2021-08-20 20:40:00'),
(3, 3, '2021-08-20 22:20:00');/*cross*/

insert into tickets (session) values
(2), (2), (2), (3), (3), (3), (3), (3), (4),
(4), (4), (4), (4), (5), (5), (5), (5), (5),
(5), (6), (6), (6), (6), (6), (7), (7), (7),
(7), (7), (7), (7), (8), (8), (8), (8), (8), (8);

select
    s.id,
    m.title as movie,
    p.price as price,
    m.duration as duration,
    s.begin_at,
    t.sold
from schedule s
         left join movie m on s.movie = m.id
         left join prices p on s.price = p.id
         left join (select tickets.session, count(tickets.session) as sold
                    from tickets
                    group by tickets.session) t on s.id = t.session;
    