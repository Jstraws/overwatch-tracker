-----------------------------------------------------
-- Insert basic user data ---------------------------
-----------------------------------------------------
INSERT INTO APP_USER (USER_ID, FIRST_NAME, LAST_NAME, USERNAME, PASSWORD)
VALUES (500, 'Jeremy', 'Straus', 'jstraus', -1146911805);
INSERT INTO APP_USER (USER_ID, FIRST_NAME, LAST_NAME, USERNAME, PASSWORD)
VALUES (501, 'Alan', 'Sato', 'asato', -1146911805);
INSERT INTO APP_USER (USER_ID, FIRST_NAME, LAST_NAME, USERNAME, PASSWORD)
VALUES (502, 'Molly', 'Merritt', 'mmerritt', -1146911805);
INSERT INTO APP_USER (USER_ID, FIRST_NAME, LAST_NAME, USERNAME, PASSWORD)
VALUES (503, 'Rishabh', 'Ranah', 'rranah', -1146911805);

-----------------------------------------------------
-- Insert hero list ---------------------------------
-----------------------------------------------------
INSERT INTO HERO
VALUES (500, 'D.Va', 'TANK');
INSERT INTO HERO
VALUES (501, 'Orisa', 'TANK');
INSERT INTO HERO
VALUES (502, 'Reinhardt', 'TANK');
INSERT INTO HERO
VALUES (503, 'Roadhog', 'TANK');
INSERT INTO HERO
VALUES (504, 'Winston', 'TANK');
INSERT INTO HERO
VALUES (505, 'Wrecking Ball', 'TANK');
INSERT INTO HERO
VALUES (506, 'Zarya', 'TANK');
INSERT INTO HERO
VALUES (507, 'Bastion', 'DAMAGE');
INSERT INTO HERO
VALUES (508, 'Doomfist', 'DAMAGE');
INSERT INTO HERO
VALUES (509, 'Genji', 'DAMAGE');
INSERT INTO HERO
VALUES (510, 'Hanzo', 'DAMAGE');
INSERT INTO HERO
VALUES (511, 'Junkrat', 'DAMAGE');
INSERT INTO HERO
VALUES (512, 'McCree', 'DAMAGE');
INSERT INTO HERO
VALUES (513, 'Mei', 'DAMAGE');
INSERT INTO HERO
VALUES (514, 'Pharah', 'DAMAGE');
INSERT INTO HERO
VALUES (515, 'Reaper', 'DAMAGE');
INSERT INTO HERO
VALUES (516, 'Soldier: 76', 'DAMAGE');
INSERT INTO HERO
VALUES (517, 'Sombra', 'DAMAGE');
INSERT INTO HERO
VALUES (518, 'Symmetra', 'DAMAGE');
INSERT INTO HERO
VALUES (519, 'Torbjorn', 'DAMAGE');
INSERT INTO HERO
VALUES (520, 'Tracer', 'DAMAGE');
INSERT INTO HERO
VALUES (521, 'Widowmaker', 'DAMAGE');
INSERT INTO HERO
VALUES (522, 'Ana', 'SUPPORT');
INSERT INTO HERO
VALUES (523, 'Brigitte', 'SUPPORT');
INSERT INTO HERO
VALUES (524, 'Lucio', 'SUPPORT');
INSERT INTO HERO
VALUES (525, 'Mercy', 'SUPPORT');
INSERT INTO HERO
VALUES (526, 'Moira', 'SUPPORT');
INSERT INTO HERO
VALUES (527, 'Zenyatta', 'SUPPORT');

-----------------------------------------------------
-- Insert Map list ----------------------------------
-----------------------------------------------------
INSERT INTO MAP
VALUES (500, 'Hanamura', 'ASSAULT');
INSERT INTO MAP
VALUES (501, 'Horizon Lunar Colony', 'ASSAULT');
INSERT INTO MAP
VALUES (502, 'Temple of Anubis', 'ASSAULT');
INSERT INTO MAP
VALUES (503, 'Volskaya Industries', 'ASSAULT');
INSERT INTO MAP
VALUES (504, 'Dorado', 'ESCORT');
INSERT INTO MAP
VALUES (505, 'Junkertown', 'ESCORT');
INSERT INTO MAP
VALUES (506, 'Rialto', 'ESCORT');
INSERT INTO MAP
VALUES (507, 'Route 66', 'ESCORT');
INSERT INTO MAP
VALUES (508, 'Watchpoint: Gibraltar', 'ESCORT');
INSERT INTO MAP
VALUES (509, 'Blizzard World', 'HYBRID');
INSERT INTO MAP
VALUES (510, 'Eichenwalde', 'HYBRID');
INSERT INTO MAP
VALUES (511, 'Hollywood', 'HYBRID');
INSERT INTO MAP
VALUES (512, 'King''s Row', 'HYBRID');
INSERT INTO MAP
VALUES (513, 'Numbani', 'HYBRID');
INSERT INTO MAP
VALUES (514, 'Busan', 'CONTROL');
INSERT INTO MAP
VALUES (515, 'Ilios', 'CONTROL');
INSERT INTO MAP
VALUES (516, 'Lijiang Tower', 'CONTROL');
INSERT INTO MAP
VALUES (517, 'Nepal', 'CONTROL');
INSERT INTO MAP
VALUES (518, 'Oasis', 'CONTROL');
INSERT INTO MAP
VALUES (519, 'Ayutthaya', 'ARENA');
INSERT INTO MAP
VALUES (520, 'Black Forest', 'ARENA');
INSERT INTO MAP
VALUES (521, 'Castillo', 'ARENA');
INSERT INTO MAP
VALUES (522, 'Ecopoint: Antarctica', 'ARENA');
INSERT INTO MAP
VALUES (523, 'Necropolis', 'ARENA');

-----------------------------------------------------
-- Insert match data --------------------------------
-----------------------------------------------------


-----------------------------------------------------
-- Insert season data -------------------------------
-----------------------------------------------------
INSERT INTO SEASON (SEASON_ID, NAME, START_DATE, END_DATE)
VALUES (500, 'Season 8', TO_DATE('2018-01-01', 'YYYY-MM-DD'), TO_DATE('2018-02-25', 'YYYY-MM-DD'));
INSERT INTO SEASON (SEASON_ID, NAME, START_DATE, END_DATE)
VALUES (501, 'Season 9', TO_DATE('2018-02-28', 'YYYY-MM-DD'), TO_DATE('2018-04-28', 'YYYY-MM-DD'));
INSERT INTO SEASON (SEASON_ID, NAME, START_DATE, END_DATE)
VALUES (502, 'Season 10', TO_DATE('2018-05-01', 'YYYY-MM-DD'), TO_DATE('2018-07-01', 'YYYY-MM-DD'));