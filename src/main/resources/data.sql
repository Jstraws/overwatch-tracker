-- noinspection SqlNoDataSourceInspectionForFile

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
INSERT INTO HERO (HERO_ID, NAME, TYPE, ICON_URL)
VALUES (1,
        'Orisa',
        'TANK',
        'https://d1u5p3l4wpay3k.cloudfront.net/overwatch_gamepedia/1/11/Icon-Orisa.png?version=34ef578689695a798c1e4f15832e0539');
INSERT INTO HERO (HERO_ID, NAME, TYPE, ICON_URL)
VALUES (2,
        'Reinhardt',
        'TANK',
        'https://d1u5p3l4wpay3k.cloudfront.net/overwatch_gamepedia/8/83/Icon-Reinhardt.png?version=5e9fe8ee3ff8e9889b5805ad99806e1a');
INSERT INTO HERO (HERO_ID, NAME, TYPE, ICON_URL)
VALUES (3,
        'Roadhog',
        'TANK',
        'https://d1u5p3l4wpay3k.cloudfront.net/overwatch_gamepedia/1/16/Icon-Roadhog.png?version=66e75bb2a39387f4b3061efb9289011c');
INSERT INTO HERO (HERO_ID, NAME, TYPE, ICON_URL)
VALUES (4,
        'Winston',
        'TANK',
        'https://d1u5p3l4wpay3k.cloudfront.net/overwatch_gamepedia/f/f8/Icon-Winston.png?version=ec5d948150e814888114ac2d30237ebe');
INSERT INTO HERO (HERO_ID, NAME, TYPE, ICON_URL)
VALUES (5,
        'Wrecking Ball',
        'TANK',
        'https://d1u5p3l4wpay3k.cloudfront.net/overwatch_gamepedia/c/ca/Icon-Wrecking_Ball.png?version=feb9b997b3a7c21c33a5f8968c6e181c');
INSERT INTO HERO (HERO_ID, NAME, TYPE, ICON_URL)
VALUES (6,
        'Zarya',
        'TANK',
        'https://d1u5p3l4wpay3k.cloudfront.net/overwatch_gamepedia/7/75/Icon-Zarya.png?version=2dac71ef6f2a874076bd45170721f473');
INSERT INTO HERO (HERO_ID, NAME, TYPE, ICON_URL)
VALUES (7,
        'Bastion',
        'DAMAGE',
        'https://d1u5p3l4wpay3k.cloudfront.net/overwatch_gamepedia/5/51/Icon-Bastion.png?version=0cff9daf2e8b53c9ca9e79375fd20a34');
INSERT INTO HERO (HERO_ID, NAME, TYPE, ICON_URL)
VALUES (8,
        'Doomfist',
        'DAMAGE',
        'https://d1u5p3l4wpay3k.cloudfront.net/overwatch_gamepedia/a/a1/Icon-Doomfist.png?version=ce049d237425cacce54adbd78a05b9ab');
INSERT INTO HERO (HERO_ID, NAME, TYPE, ICON_URL)
VALUES (9,
        'Genji',
        'DAMAGE',
        'https://d1u5p3l4wpay3k.cloudfront.net/overwatch_gamepedia/1/1c/Icon-Genji.png?version=a9e5afaca36f7dc1f6da99bf89abb2e5');
INSERT INTO HERO (HERO_ID, NAME, TYPE, ICON_URL)
VALUES (10,
        'Hanzo',
        'DAMAGE',
        'https://d1u5p3l4wpay3k.cloudfront.net/overwatch_gamepedia/7/71/Icon-Hanzo.png?version=3d088f6cf6ca83213f2aefe4d3f543f3');
INSERT INTO HERO (HERO_ID, NAME, TYPE, ICON_URL)
VALUES (11,
        'Junkrat',
        'DAMAGE',
        'https://d1u5p3l4wpay3k.cloudfront.net/overwatch_gamepedia/9/99/Icon-Junkrat.png?version=48f826ccb90babef3b92d24bc7ca5c57');
INSERT INTO HERO (HERO_ID, NAME, TYPE, ICON_URL)
VALUES (12,
        'McCree',
        'DAMAGE',
        'https://d1u5p3l4wpay3k.cloudfront.net/overwatch_gamepedia/5/59/Icon-McCree.png?version=581cece81e320e6af31650a4360a3ece');
INSERT INTO HERO (HERO_ID, NAME, TYPE, ICON_URL)
VALUES (13,
        'Mei',
        'DAMAGE',
        'https://d1u5p3l4wpay3k.cloudfront.net/overwatch_gamepedia/9/99/Icon-Mei.png?version=644cf60ff1d670c7255d9aedcbf6491c');
INSERT INTO HERO (HERO_ID, NAME, TYPE, ICON_URL)
VALUES (14,
        'Pharah',
        'DAMAGE',
        'https://d1u5p3l4wpay3k.cloudfront.net/overwatch_gamepedia/2/29/Icon-Pharah.png?version=833e4b31b246453d9431f3859353790c');
INSERT INTO HERO (HERO_ID, NAME, TYPE, ICON_URL)
VALUES (15,
        'Reaper',
        'DAMAGE',
        'https://d1u5p3l4wpay3k.cloudfront.net/overwatch_gamepedia/a/a9/Icon-Reaper.png?version=13f1d74d4281b54d49876d3446b5650d');
INSERT INTO HERO (HERO_ID, NAME, TYPE, ICON_URL)
VALUES (16,
        'Soldier: 76',
        'DAMAGE',
        'https://d1u5p3l4wpay3k.cloudfront.net/overwatch_gamepedia/2/2b/Icon-Soldier_76.png?version=481afd615b6c66cdec8172b25a8386ce');
INSERT INTO HERO (HERO_ID, NAME, TYPE, ICON_URL)
VALUES (17,
        'Sombra',
        'DAMAGE',
        'https://d1u5p3l4wpay3k.cloudfront.net/overwatch_gamepedia/7/70/Icon-Sombra.png?version=f9fa9701f40e1d04f906958d0f148793');
INSERT INTO HERO (HERO_ID, NAME, TYPE, ICON_URL)
VALUES (18,
        'Symmetra',
        'DAMAGE',
        'https://d1u5p3l4wpay3k.cloudfront.net/overwatch_gamepedia/0/06/Icon-Symmetra.png?version=cab51e10df9a16a2e4691bf233ecca91');
INSERT INTO HERO (HERO_ID, NAME, TYPE, ICON_URL)
VALUES (19,
        'Torbjorn',
        'DAMAGE',
        'https://d1u5p3l4wpay3k.cloudfront.net/overwatch_gamepedia/c/ca/Icon-Torbj%C3%B6rn.png?version=ac3bd20306b28c618b3714db72a2fe93');
INSERT INTO HERO (HERO_ID, NAME, TYPE, ICON_URL)
VALUES (20,
        'Tracer',
        'DAMAGE',
        'https://d1u5p3l4wpay3k.cloudfront.net/overwatch_gamepedia/2/29/Icon-Tracer.png?version=bd08c3080823f198b1de7484993d5629');
INSERT INTO HERO (HERO_ID, NAME, TYPE, ICON_URL)
VALUES (21,
        'Widowmaker',
        'DAMAGE',
        'https://d1u5p3l4wpay3k.cloudfront.net/overwatch_gamepedia/5/54/Icon-Widowmaker.png?version=b6f7976d7bfc0bfcfce578d57ac0a6e3');
INSERT INTO HERO (HERO_ID, NAME, TYPE, ICON_URL)
VALUES (22,
        'Ana',
        'SUPPORT',
        'https://d1u5p3l4wpay3k.cloudfront.net/overwatch_gamepedia/3/3d/Icon-Ana.png?version=6c1b6131bd6445d374a7472557199600');
INSERT INTO HERO (HERO_ID, NAME, TYPE, ICON_URL)
VALUES (23,
        'Brigitte',
        'SUPPORT',
        'https://d1u5p3l4wpay3k.cloudfront.net/overwatch_gamepedia/a/a6/Icon-Brigitte.png?version=adfdc4239254206658804d0b57c54d85');
INSERT INTO HERO (HERO_ID, NAME, TYPE, ICON_URL)
VALUES (24,
        'Lucio',
        'SUPPORT',
        'https://d1u5p3l4wpay3k.cloudfront.net/overwatch_gamepedia/5/51/Icon-L%C3%BAcio.png?version=5f000c64ce2105af6c36792cb21d02c8');
INSERT INTO HERO (HERO_ID, NAME, TYPE, ICON_URL)
VALUES (25,
        'Mercy',
        'SUPPORT',
        'https://d1u5p3l4wpay3k.cloudfront.net/overwatch_gamepedia/0/03/Icon-Mercy.png?version=7029004f729632a59be88264fc533013');
INSERT INTO HERO (HERO_ID, NAME, TYPE, ICON_URL)
VALUES (26,
        'Moira',
        'SUPPORT',
        'https://d1u5p3l4wpay3k.cloudfront.net/overwatch_gamepedia/5/55/Icon-Moira.png?version=e6912cc8411e7919341dd21977b60e56');
INSERT INTO HERO (HERO_ID, NAME, TYPE, ICON_URL)
VALUES (27,
        'Zenyatta',
        'SUPPORT',
        'https://d1u5p3l4wpay3k.cloudfront.net/overwatch_gamepedia/f/f7/Icon-Zenyatta.png?version=60a48d307e65de900a638e99c82c7494');
INSERT INTO HERO (HERO_ID, NAME, TYPE, ICON_URL)
VALUES (28,
        'D.Va',
        'TANK',
        'https://d1u5p3l4wpay3k.cloudfront.net/overwatch_gamepedia/1/19/Icon-D.Va.png?version=a304c3fc9fadb7b885e28f677a9aec8e');

-----------------------------------------------------
-- Insert Map list ----------------------------------
-----------------------------------------------------
INSERT INTO MAP (MAP_ID, NAME, TYPE, ICON_URL)
VALUES (500,
        'Hanamura',
        'ASSAULT',
        'https://d1u5p3l4wpay3k.cloudfront.net/overwatch_gamepedia/thumb/4/46/Hanamura_concept.jpg/700px-Hanamura_concept.jpg?version=312538bfcb0690338ae37ea8624d3223');
INSERT INTO MAP (MAP_ID, NAME, TYPE, ICON_URL)
VALUES (501,
        'Horizon Lunar Colony',
        'ASSAULT',
        'https://d1u5p3l4wpay3k.cloudfront.net/overwatch_gamepedia/thumb/7/7c/Horizon_Lunar_Colony2.jpg/700px-Horizon_Lunar_Colony2.jpg?version=b45aed0d7bcd264c6af95764b5c10580');
INSERT INTO MAP (MAP_ID, NAME, TYPE, ICON_URL)
VALUES (502,
        'Temple of Anubis',
        'ASSAULT',
        'https://d1u5p3l4wpay3k.cloudfront.net/overwatch_gamepedia/thumb/d/de/Anubis_concept.jpg/700px-Anubis_concept.jpg?version=af88ee728e327ae9c5199886932c6169');
INSERT INTO MAP (MAP_ID, NAME, TYPE, ICON_URL)
VALUES (503,
        'Volskaya Industries',
        'ASSAULT',
        'https://d1u5p3l4wpay3k.cloudfront.net/overwatch_gamepedia/thumb/d/de/Volskaya_Industries.jpg/700px-Volskaya_Industries.jpg?version=2a438d7ba13cfffff471cb6bea904155');
INSERT INTO MAP (MAP_ID, NAME, TYPE, ICON_URL)
VALUES (504,
        'Dorado',
        'ESCORT',
        'https://d1u5p3l4wpay3k.cloudfront.net/overwatch_gamepedia/thumb/e/ec/Dorado-streets2.jpg/700px-Dorado-streets2.jpg?version=02778846dc060f57c2100d68498ac510');
INSERT INTO MAP (MAP_ID, NAME, TYPE, ICON_URL)
VALUES (505,
        'Junkertown',
        'ESCORT',
        'https://d1u5p3l4wpay3k.cloudfront.net/overwatch_gamepedia/thumb/e/e3/Junkertown.jpg/700px-Junkertown.jpg?version=e7efc7fbc9127ada7dea7b12cc8bedbd');
INSERT INTO MAP (MAP_ID, NAME, TYPE, ICON_URL)
VALUES (506,
        'Rialto',
        'ESCORT',
        'https://d1u5p3l4wpay3k.cloudfront.net/overwatch_gamepedia/thumb/f/ff/Rialto.jpg/700px-Rialto.jpg?version=dc6332cbe0db29bc0715f83bbd8399af');
INSERT INTO MAP (MAP_ID, NAME, TYPE, ICON_URL)
VALUES (507,
        'Route 66',
        'ESCORT',
        'https://d1u5p3l4wpay3k.cloudfront.net/overwatch_gamepedia/thumb/a/a6/Route_66.jpg/700px-Route_66.jpg?version=b606163f2c1ea09cecef71b74113c162');
INSERT INTO MAP (MAP_ID, NAME, TYPE, ICON_URL)
VALUES (508,
        'Watchpoint: Gibraltar',
        'ESCORT',
        'https://d1u5p3l4wpay3k.cloudfront.net/overwatch_gamepedia/thumb/8/8b/Gibraltar.jpg/700px-Gibraltar.jpg?version=d8b6f84edfe40e43e13f136ef71cd791');
INSERT INTO MAP (MAP_ID, NAME, TYPE, ICON_URL)
VALUES (509,
        'Blizzard World',
        'HYBRID',
        'https://d1u5p3l4wpay3k.cloudfront.net/overwatch_gamepedia/thumb/f/f8/Blizzard_World.jpg/700px-Blizzard_World.jpg?version=d38fae20ea91a0ce4afb7fdac38bdedb');
INSERT INTO MAP (MAP_ID, NAME, TYPE, ICON_URL)
VALUES (510,
        'Eichenwalde',
        'HYBRID',
        'https://d1u5p3l4wpay3k.cloudfront.net/overwatch_gamepedia/thumb/a/aa/Eichenwalde.png/700px-Eichenwalde.png?version=499b9b460ec5f6c9e53fb25ccbf51f70');
INSERT INTO MAP (MAP_ID, NAME, TYPE, ICON_URL)
VALUES (511,
        'Hollywood',
        'HYBRID',
        'https://d1u5p3l4wpay3k.cloudfront.net/overwatch_gamepedia/thumb/2/26/Hollywood-set.jpg/700px-Hollywood-set.jpg?version=1a713649276a32a41adcbc6129c69d80');
INSERT INTO MAP (MAP_ID, NAME, TYPE, ICON_URL)
VALUES (512,
        'King''s Row',
        'HYBRID',
        'https://d1u5p3l4wpay3k.cloudfront.net/overwatch_gamepedia/thumb/1/1b/King%27s_Row_concept.jpg/700px-King%27s_Row_concept.jpg?version=1be78027d997a6869be116ba7c06eb4b');
INSERT INTO MAP (MAP_ID, NAME, TYPE, ICON_URL)
VALUES (513,
        'Numbani',
        'HYBRID',
        'https://d1u5p3l4wpay3k.cloudfront.net/overwatch_gamepedia/thumb/1/1b/Numbani_Loading_Screen.jpg/700px-Numbani_Loading_Screen.jpg?version=205390aef635cb9a31ffd20522ce2c30');
INSERT INTO MAP (MAP_ID, NAME, TYPE, ICON_URL)
VALUES (514,
        'Busan',
        'CONTROL',
        'https://d1u5p3l4wpay3k.cloudfront.net/overwatch_gamepedia/thumb/0/09/Overwatch_Busan.jpg/700px-Overwatch_Busan.jpg?version=130afaa29a7c053c6242434593133a09');
INSERT INTO MAP (MAP_ID, NAME, TYPE, ICON_URL)
VALUES (515,
        'Ilios',
        'CONTROL',
        'https://d1u5p3l4wpay3k.cloudfront.net/overwatch_gamepedia/thumb/4/45/Ilios.jpg/700px-Ilios.jpg?version=286951575bd2192566d97a4b06f6b819');
INSERT INTO MAP (MAP_ID, NAME, TYPE, ICON_URL)
VALUES (516,
        'Lijiang Tower',
        'CONTROL',
        'https://d1u5p3l4wpay3k.cloudfront.net/overwatch_gamepedia/thumb/9/9b/Lijiang_Tower_loading_screen.jpg/700px-Lijiang_Tower_loading_screen.jpg?version=1a3dc3221e209ae92bd47f83815b8753');
INSERT INTO MAP (MAP_ID, NAME, TYPE, ICON_URL)
VALUES (517,
        'Nepal',
        'CONTROL',
        'https://d1u5p3l4wpay3k.cloudfront.net/overwatch_gamepedia/thumb/f/f3/Nepal_loading_screen.jpg/700px-Nepal_loading_screen.jpg?version=52e62bd6797f6bcbd7ae8acbde64c155');
INSERT INTO MAP (MAP_ID, NAME, TYPE, ICON_URL)
VALUES (518,
        'Oasis',
        'CONTROL',
        'https://d1u5p3l4wpay3k.cloudfront.net/overwatch_gamepedia/thumb/f/fc/Oasis.jpg/700px-Oasis.jpg?version=e0f788e071bc489f97d17ee39473058d');
INSERT INTO MAP (MAP_ID, NAME, TYPE, ICON_URL)
VALUES (519,
        'Ayutthaya',
        'ARENA',
        'https://d1u5p3l4wpay3k.cloudfront.net/overwatch_gamepedia/thumb/9/9d/Ayutthaya.png/700px-Ayutthaya.png?version=b3a160bd6f77975880bb2c3975ac861b');
INSERT INTO MAP (MAP_ID, NAME, TYPE, ICON_URL)
VALUES (520,
        'Black Forest',
        'ARENA',
        'https://d1u5p3l4wpay3k.cloudfront.net/overwatch_gamepedia/thumb/9/98/Black-Forest.jpg/700px-Black-Forest.jpg?version=14ef6c93865df2f7f9020054fd4d6f4e');
INSERT INTO MAP (MAP_ID, NAME, TYPE, ICON_URL)
VALUES (521,
        'Castillo',
        'ARENA',
        'https://d1u5p3l4wpay3k.cloudfront.net/overwatch_gamepedia/thumb/e/e8/Castillo.jpg/700px-Castillo.jpg?version=3e2e3b2b8fb225f5000bf9264eab93f5');
INSERT INTO MAP (MAP_ID, NAME, TYPE, ICON_URL)
VALUES (522,
        'Ecopoint: Antarctica',
        'ARENA',
        'https://d1u5p3l4wpay3k.cloudfront.net/overwatch_gamepedia/thumb/0/00/Ecopoint_Antarctica_BlizzCon_2016.png/700px-Ecopoint_Antarctica_BlizzCon_2016.png?version=77e655c11124896919977a5f8d356f41');
INSERT INTO MAP (MAP_ID, NAME, TYPE, ICON_URL)
VALUES (523,
        'Necropolis',
        'ARENA',
        'https://d1u5p3l4wpay3k.cloudfront.net/overwatch_gamepedia/thumb/6/69/Necropolis.jpg/700px-Necropolis.jpg?version=bcd7a3d9359b25ed31aa0a18169e5941');

-----------------------------------------------------
-- Insert match data --------------------------------
-----------------------------------------------------
INSERT INTO MATCH (MATCH_ID, RESULT, MAP_ID, MATCH_DATE, RANK, RANK_DIFFERENCE, APP_USER_ID)
VALUES (500, 'WIN', 500, TO_DATE('2018-01-05 09:40', 'YYYY-MM-DD HH24:MI'), 3000, 0, 500);
INSERT INTO MATCH (MATCH_ID, RESULT, MAP_ID, MATCH_DATE, RANK, RANK_DIFFERENCE, APP_USER_ID)
VALUES (501, 'WIN', 501, TO_DATE('2018-02-06 11:06', 'YYYY-MM-DD HH24:MI'), 3020, 20, 500);
INSERT INTO MATCH (MATCH_ID, RESULT, MAP_ID, MATCH_DATE, RANK, RANK_DIFFERENCE, APP_USER_ID)
VALUES (502, 'LOSS', 502, TO_DATE('2018-04-20 11:55', 'YYYY-MM-DD HH24:MI'), 2998, -22, 500);
INSERT INTO MATCH (MATCH_ID, RESULT, MAP_ID, MATCH_DATE, RANK, RANK_DIFFERENCE, APP_USER_ID)
VALUES (503, 'WIN', 503, TO_DATE('2018-03-19 12:22', 'YYYY-MM-DD HH24:MI'), 3028, 30, 500);
INSERT INTO MATCH (MATCH_ID, RESULT, MAP_ID, MATCH_DATE, RANK, RANK_DIFFERENCE, APP_USER_ID)
VALUES (504, 'LOSS', 504, TO_DATE('2018-07-30 13:08', 'YYYY-MM-DD HH24:MI'), 3013, -15, 500);
INSERT INTO MATCH (MATCH_ID, RESULT, MAP_ID, MATCH_DATE, RANK, RANK_DIFFERENCE, APP_USER_ID)
VALUES (505, 'LOSS', 505, TO_DATE('2018-06-10 14:12', 'YYYY-MM-DD HH24:MI'), 2993, -20, 500);
INSERT INTO MATCH (MATCH_ID, RESULT, MAP_ID, MATCH_DATE, RANK, RANK_DIFFERENCE, APP_USER_ID)
VALUES (506, 'WIN', 506, TO_DATE('2018-04-01 14:45', 'YYYY-MM-DD HH24:MI'), 3017, 24, 500);
INSERT INTO MATCH (MATCH_ID, RESULT, MAP_ID, MATCH_DATE, RANK, RANK_DIFFERENCE, APP_USER_ID)
VALUES (507, 'WIN', 507, TO_DATE('2018-02-20 16:25', 'YYYY-MM-DD HH24:MI'), 3042, 25, 500);
INSERT INTO MATCH (MATCH_ID, RESULT, MAP_ID, MATCH_DATE, RANK, RANK_DIFFERENCE, APP_USER_ID)
VALUES (508, 'WIN', 508, TO_DATE('2018-08-28 16:43', 'YYYY-MM-DD HH24:MI'), 3067, 25, 500);
INSERT INTO MATCH (MATCH_ID, RESULT, MAP_ID, MATCH_DATE, RANK, RANK_DIFFERENCE, APP_USER_ID)
VALUES (509, 'LOSS', 509, TO_DATE('2018-09-13 10:51', 'YYYY-MM-DD HH24:MI'), 3045, -22, 500);

-----------------------------------------------------
-- Insert Match/Hero data ---------------------------
-----------------------------------------------------
INSERT INTO MATCH_HERO (MATCH_ID, HERO_ID)
VALUES (501, 22);
INSERT INTO MATCH_HERO (MATCH_ID, HERO_ID)
VALUES (501, 26);
INSERT INTO MATCH_HERO (MATCH_ID, HERO_ID)
VALUES (502, 23);
INSERT INTO MATCH_HERO (MATCH_ID, HERO_ID)
VALUES (502, 26);
INSERT INTO MATCH_HERO (MATCH_ID, HERO_ID)
VALUES (503, 25);
INSERT INTO MATCH_HERO (MATCH_ID, HERO_ID)
VALUES (504, 6);
INSERT INTO MATCH_HERO (MATCH_ID, HERO_ID)
VALUES (504, 26);
INSERT INTO MATCH_HERO (MATCH_ID, HERO_ID)
VALUES (504, 23);
INSERT INTO MATCH_HERO (MATCH_ID, HERO_ID)
VALUES (505, 22);
INSERT INTO MATCH_HERO (MATCH_ID, HERO_ID)
VALUES (505, 23);
INSERT INTO MATCH_HERO (MATCH_ID, HERO_ID)
VALUES (506, 26);
INSERT INTO MATCH_HERO (MATCH_ID, HERO_ID)
VALUES (506, 23);
INSERT INTO MATCH_HERO (MATCH_ID, HERO_ID)
VALUES (507, 27);
INSERT INTO MATCH_HERO (MATCH_ID, HERO_ID)
VALUES (507, 23);
INSERT INTO MATCH_HERO (MATCH_ID, HERO_ID)
VALUES (508, 26);
INSERT INTO MATCH_HERO (MATCH_ID, HERO_ID)
VALUES (509, 17);
INSERT INTO MATCH_HERO (MATCH_ID, HERO_ID)
VALUES (509, 18);
INSERT INTO MATCH_HERO (MATCH_ID, HERO_ID)
VALUES (509, 19);
INSERT INTO MATCH_HERO (MATCH_ID, HERO_ID)
VALUES (509, 28);
INSERT INTO MATCH_HERO (MATCH_ID, HERO_ID)
VALUES (508, 13);
INSERT INTO MATCH_HERO (MATCH_ID, HERO_ID)
VALUES (508, 12);

-----------------------------------------------------
-- Insert season data -------------------------------
-----------------------------------------------------
INSERT INTO SEASON (SEASON_ID, NAME, START_DATE, END_DATE)
VALUES (-1, 'Any', TO_DATE('2016-06-28', 'YYYY-MM-DD'), TO_DATE('3016-08-17', 'YYYY-MM-DD'));
INSERT INTO SEASON (SEASON_ID, NAME, START_DATE, END_DATE)
VALUES (500, 'Season 1', TO_DATE('2016-06-28', 'YYYY-MM-DD'), TO_DATE('2016-08-17', 'YYYY-MM-DD'));
INSERT INTO SEASON (SEASON_ID, NAME, START_DATE, END_DATE)
VALUES (501, 'Season 2', TO_DATE('2016-09-02', 'YYYY-MM-DD'), TO_DATE('2016-11-24', 'YYYY-MM-DD'));
INSERT INTO SEASON (SEASON_ID, NAME, START_DATE, END_DATE)
VALUES (502, 'Season 3', TO_DATE('2016-12-01', 'YYYY-MM-DD'), TO_DATE('2017-02-21', 'YYYY-MM-DD'));
INSERT INTO SEASON (SEASON_ID, NAME, START_DATE, END_DATE)
VALUES (503, 'Season 4', TO_DATE('2017-02-28', 'YYYY-MM-DD'), TO_DATE('2017-05-28', 'YYYY-MM-DD'));
INSERT INTO SEASON (SEASON_ID, NAME, START_DATE, END_DATE)
VALUES (504, 'Season 5', TO_DATE('2017-06-01', 'YYYY-MM-DD'), TO_DATE('2017-08-28', 'YYYY-MM-DD'));
INSERT INTO SEASON (SEASON_ID, NAME, START_DATE, END_DATE)
VALUES (505, 'Season 6', TO_DATE('2017-09-01', 'YYYY-MM-DD'), TO_DATE('2017-10-28', 'YYYY-MM-DD'));
INSERT INTO SEASON (SEASON_ID, NAME, START_DATE, END_DATE)
VALUES (506, 'Season 7', TO_DATE('2017-11-01', 'YYYY-MM-DD'), TO_DATE('2017-12-29', 'YYYY-MM-DD'));
INSERT INTO SEASON (SEASON_ID, NAME, START_DATE, END_DATE)
VALUES (507, 'Season 8', TO_DATE('2018-01-01', 'YYYY-MM-DD'), TO_DATE('2018-02-25', 'YYYY-MM-DD'));
INSERT INTO SEASON (SEASON_ID, NAME, START_DATE, END_DATE)
VALUES (508, 'Season 9', TO_DATE('2018-02-28', 'YYYY-MM-DD'), TO_DATE('2018-04-28', 'YYYY-MM-DD'));
INSERT INTO SEASON (SEASON_ID, NAME, START_DATE, END_DATE)
VALUES (509, 'Season 10', TO_DATE('2018-05-01', 'YYYY-MM-DD'), TO_DATE('2018-07-01', 'YYYY-MM-DD'));
INSERT INTO SEASON (SEASON_ID, NAME, START_DATE, END_DATE)
VALUES (510, 'Season 11', TO_DATE('2018-07-02', 'YYYY-MM-DD'), TO_DATE('2018-08-28', 'YYYY-MM-DD'));
INSERT INTO SEASON (SEASON_ID, NAME, START_DATE, END_DATE)
VALUES (511, 'Season 12', TO_DATE('2018-08-31', 'YYYY-MM-DD'), TO_DATE('2018-10-28', 'YYYY-MM-DD'));
INSERT INTO SEASON (SEASON_ID, NAME, START_DATE, END_DATE)
VALUES (512, 'Season 13', TO_DATE('2018-10-31', 'YYYY-MM-DD'), TO_DATE('2018-12-28', 'YYYY-MM-DD'));