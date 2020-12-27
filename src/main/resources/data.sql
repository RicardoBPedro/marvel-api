INSERT INTO CHARACTER (NAME, DESCRIPTION)
VALUES ('T’Challa', 'Black Panther'),
       ('Peter Parker', 'Spider-Man'),
       ('Bucky Barnes', 'The Winter Soldier'),
       ('Doctor Strange', NULL),
       ('Sam Wilson', 'Falcon'),
       ('Wanda Maximoff', 'Scarlet Witch'),
       ('Peter Quill', 'Star-Lord'),
       ('Drax the Destroyer', NULL),
       ('Mantis', NULL),
       ('Groot', NULL),
       ('Maria Hill', NULL),
       ('Nick Fury', NULL),
       ('Betty Ross', 'From The Incredible Hulk'),
       ('Lady Sif', NULL),
       ('Hank Pym', NULL),
       ('Janet van Dyne', NULL),
       ('Hope van Dyne', 'The Wasp');

INSERT INTO COMIC (TITLE, DESCRIPTION, FORMAT, PAGE_COUNT)
VALUES ('Black Panther #12', null, 'Comic', 32),
       ('Black Panther #11', NULL, 'Comic', 32),
       ('Black Panther #15', NULL, 'Comic', 32),
       ('Spider-Man #9', NULL, 'Comic', 32),
       ('Spider-Man #33', NULL, 'Comic', 32),
       ('The Winter Soldier #1', NULL, 'Comic', 32),
       ('Doctor Strange #144', NULL, 'Comic', 32),
       ('Doctor Strange #78', NULL, 'Comic', 32),
       ('Doctor Strange #266', NULL, 'Comic', 32),
       ('Falcon #23', NULL, 'Comic', 32),
       ('Scarlet Witch #187', NULL, 'Comic', 32),
       ('Scarlet Witch #177', NULL, 'Comic', 32),
       ('Scarlet Witch #1', NULL, 'Comic', 32),
       ('Star-Lord #153', NULL, 'Comic', 32),
       ('Star-Lord #122', NULL, 'Comic', 32),
       ('Drax the Destroyer #58', NULL, 'Comic', 32),
       ('Groot #87', NULL, 'Comic', 32),
       ('Groot #274', NULL, 'Comic', 32),
       ('Groot #188', NULL, 'Comic', 32);

INSERT INTO CHARACTER_COMICS(CHARACTER_ID, COMIC_ID)
VALUES (1,  1),
       (1,  2),
       (1,  3),
       (2,  4),
       (2,  5),
       (3,  6),
       (4,  7),
       (4,  8),
       (4,  9),
       (5,  10),
       (6,  11),
       (6,  12),
       (6,  13),
       (7,  14),
       (7,  15),
       (8,  16),
       (10, 17),
       (10, 18),
       (10, 19);


INSERT INTO EVENT (TITLE, DESCRIPTION, START, END)
VALUES ('Black Panther #12', NULL, TO_DATE('1990-12-25 00:00:00', 'YYYY-MM-DD HH:MM:SS'), TO_DATE('1990-12-25 00:00:00', 'YYYY-MM-DD HH:MM:SS')),
       ('Spider-Man #9', NULL, TO_DATE('1990-12-25 00:00:00', 'YYYY-MM-DD HH:MM:SS'), TO_DATE('1990-12-25 00:00:00', 'YYYY-MM-DD HH:MM:SS')),
       ('Falcon #23', NULL, TO_DATE('1990-12-25 00:00:00', 'YYYY-MM-DD HH:MM:SS'), TO_DATE('1990-12-25 00:00:00', 'YYYY-MM-DD HH:MM:SS')),
       ('Scarlet Witch #1', NULL, TO_DATE('1990-12-25 00:00:00', 'YYYY-MM-DD HH:MM:SS'), TO_DATE('1990-12-25 00:00:00', 'YYYY-MM-DD HH:MM:SS')),
       ('Star-Lord #122', NULL, TO_DATE('1990-12-25 00:00:00', 'YYYY-MM-DD HH:MM:SS'), TO_DATE('1990-12-25 00:00:00', 'YYYY-MM-DD HH:MM:SS'));

INSERT INTO CHARACTER_EVENTS(CHARACTER_ID, EVENT_ID)
VALUES (1,  1),
       (4,  2),
       (10, 3),
       (13, 4),
       (15, 5);


INSERT INTO SERIES (TITLE, DESCRIPTION, START_YEAR, END_YEAR)
VALUES ('Doctor Strange #144', NULL, 1990, 1998),
       ('Spider-Man #9', NULL, 1990, 1998),
       ('Groot #87', NULL,  1990, 1998);

INSERT INTO CHARACTER_SERIES(CHARACTER_ID, SERIES_ID)
VALUES (4,  1),
       (2,  2),
       (10, 3);

INSERT INTO STORY (TITLE, DESCRIPTION, TYPE)
VALUES ('Doctor Strange #144', NULL, '1990'),
       ('Spider-Man #9', NULL, '1990'),
       ('Groot #87', NULL,  '1990');

 INSERT INTO CHARACTER_STORIES (CHARACTER_ID, STORY_ID)
 VALUES (4,  1),
        (2,  2),
        (10, 3);
