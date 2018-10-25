-----------------------------------------------------
-- Insert basic user data ---------------------------
-----------------------------------------------------
INSERT INTO APP_USER (USER_ID, FIRST_NAME, LAST_NAME, USERNAME, PASSWORD, RANK)
VALUES (500, 'Jeremy', 'Straus', 'jstraus', -1146911805, 3000);
INSERT INTO APP_USER (USER_ID, FIRST_NAME, LAST_NAME, USERNAME, PASSWORD, RANK)
VALUES (501, 'Alan', 'Sato', 'asato', -1146911805, 3000);
INSERT INTO APP_USER (USER_ID, FIRST_NAME, LAST_NAME, USERNAME, PASSWORD, RANK)
VALUES (502, 'Molly', 'Merritt', 'mmerritt', -1146911805, 3000);
INSERT INTO APP_USER (USER_ID, FIRST_NAME, LAST_NAME, USERNAME, PASSWORD, RANK)
VALUES (503, 'Rishabh', 'Ranah', 'rranah', -1146911805, 3000);

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
        'https://vignette.wikia.nocookie.net/overwatch/images/d/dd/Hanamura_screenshot_21.png/revision/latest/scale-to-width-down/165?cb=20160626193608');
INSERT INTO MAP (MAP_ID, NAME, TYPE, ICON_URL)
VALUES (501,
        'Horizon Lunar Colony',
        'ASSAULT',
        'https://vignette.wikia.nocookie.net/overwatch/images/b/b8/Horizon_screenshot_1.png/revision/latest/scale-to-width-down/165?cb=20170620220601');
INSERT INTO MAP (MAP_ID, NAME, TYPE, ICON_URL)
VALUES (502,
        'Temple of Anubis',
        'ASSAULT',
        'https://vignette.wikia.nocookie.net/overwatch/images/1/12/Anubis_screenshot_4.png/revision/latest/scale-to-width-down/165?cb=20160628005051');
INSERT INTO MAP (MAP_ID, NAME, TYPE, ICON_URL)
VALUES (503,
        'Volskaya Industries',
        'ASSAULT',
        'https://vignette.wikia.nocookie.net/overwatch/images/9/93/Volskaya_screenshot_13.png/revision/latest/scale-to-width-down/165?cb=20160704000922');
INSERT INTO MAP (MAP_ID, NAME, TYPE, ICON_URL)
VALUES (504,
        'Dorado',
        'ESCORT',
        'https://vignette.wikia.nocookie.net/overwatch/images/5/51/Dorado_screenshot_9.png/revision/latest/scale-to-width-down/165?cb=20160630045807');
INSERT INTO MAP (MAP_ID, NAME, TYPE, ICON_URL)
VALUES (505,
        'Junkertown',
        'ESCORT',
        'https://vignette.wikia.nocookie.net/overwatch/images/0/02/OVR_Junkertown_007.png/revision/latest/scale-to-width-down/165?cb=20170821174847');
INSERT INTO MAP (MAP_ID, NAME, TYPE, ICON_URL)
VALUES (506,
        'Rialto',
        'ESCORT',
        'https://vignette.wikia.nocookie.net/overwatch/images/f/ff/Rialto.jpg/revision/latest/scale-to-width-down/165?cb=20180510203937');
INSERT INTO MAP (MAP_ID, NAME, TYPE, ICON_URL)
VALUES (507,
        'Route 66',
        'ESCORT',
        'https://vignette.wikia.nocookie.net/overwatch/images/8/87/Route66_screenshot_1.png/revision/latest/scale-to-width-down/165?cb=20160708033615');
INSERT INTO MAP (MAP_ID, NAME, TYPE, ICON_URL)
VALUES (508,
        'Watchpoint: Gibraltar',
        'ESCORT',
        'https://vignette.wikia.nocookie.net/overwatch/images/7/73/Gibraltar_screenshot_1.png/revision/latest/scale-to-width-down/165?cb=20160710225230');
INSERT INTO MAP (MAP_ID, NAME, TYPE, ICON_URL)
VALUES (509,
        'Blizzard World',
        'HYBRID',
        'https://vignette.wikia.nocookie.net/overwatch/images/8/8d/Overwatch_BlizzardWorld_000_png_jpgcopy.jpg/revision/latest/scale-to-width-down/165?cb=20171103212134');
INSERT INTO MAP (MAP_ID, NAME, TYPE, ICON_URL)
VALUES (510,
        'Eichenwalde',
        'HYBRID',
        'https://vignette.wikia.nocookie.net/overwatch/images/5/5e/Eichenwalde_sreenshot_1.png/revision/latest/scale-to-width-down/165?cb=20160823041053');
INSERT INTO MAP (MAP_ID, NAME, TYPE, ICON_URL)
VALUES (511,
        'Hollywood',
        'HYBRID',
        'https://vignette.wikia.nocookie.net/overwatch/images/9/98/Hollywood_screenshot_4.jpg/revision/latest/scale-to-width-down/165?cb=20160605011629');
INSERT INTO MAP (MAP_ID, NAME, TYPE, ICON_URL)
VALUES (512,
        'King''s Row',
        'HYBRID',
        'https://vignette.wikia.nocookie.net/overwatch/images/2/21/Kingsrow_screenshot_8.png/revision/latest/scale-to-width-down/165?cb=20160711195544');
INSERT INTO MAP (MAP_ID, NAME, TYPE, ICON_URL)
VALUES (513,
        'Numbani',
        'HYBRID',
        'https://vignette.wikia.nocookie.net/overwatch/images/e/eb/Numbani_screenshot_5.jpg/revision/latest/scale-to-width-down/165?cb=20160504022045');
INSERT INTO MAP (MAP_ID, NAME, TYPE, ICON_URL)
VALUES (514,
        'Busan',
        'CONTROL',
        'https://vignette.wikia.nocookie.net/overwatch/images/6/6f/Busan_screenshot_1.png/revision/latest/scale-to-width-down/165?cb=20180822153609');
INSERT INTO MAP (MAP_ID, NAME, TYPE, ICON_URL)
VALUES (515,
        'Ilios',
        'CONTROL',
        'https://vignette.wikia.nocookie.net/overwatch/images/7/7d/Ilios_screenshot_1.png/revision/latest/scale-to-width-down/165?cb=20160712060605');
INSERT INTO MAP (MAP_ID, NAME, TYPE, ICON_URL)
VALUES (516,
        'Lijiang Tower',
        'CONTROL',
        'https://vignette.wikia.nocookie.net/overwatch/images/e/ed/Lijiang_screenshot_34.jpg/revision/latest/scale-to-width-down/165?cb=20160711182404');
INSERT INTO MAP (MAP_ID, NAME, TYPE, ICON_URL)
VALUES (517,
        'Nepal',
        'CONTROL',
        'https://vignette.wikia.nocookie.net/overwatch/images/7/7a/Nepal_screenshot_1.png/revision/latest/scale-to-width-down/165?cb=20160711235021');
INSERT INTO MAP (MAP_ID, NAME, TYPE, ICON_URL)
VALUES (518,
        'Oasis',
        'CONTROL',
        'https://vignette.wikia.nocookie.net/overwatch/images/7/70/Oasis_screenshot_first.png/revision/latest/scale-to-width-down/165?cb=20161203031638');
INSERT INTO MAP (MAP_ID, NAME, TYPE, ICON_URL)
VALUES (519,
        'Ayutthaya',
        'ARENA',
        'https://vignette.wikia.nocookie.net/overwatch/images/0/00/Ayutthaya_screenshot_1.png/revision/latest/scale-to-width-down/165?cb=20180209123247');
INSERT INTO MAP (MAP_ID, NAME, TYPE, ICON_URL)
VALUES (520,
        'Black Forest',
        'ARENA',
        'https://vignette.wikia.nocookie.net/overwatch/images/b/b4/Blackforest_screenshot_1.png/revision/latest/scale-to-width-down/165?cb=20170524021255');
INSERT INTO MAP (MAP_ID, NAME, TYPE, ICON_URL)
VALUES (521,
        'Castillo',
        'ARENA',
        'https://vignette.wikia.nocookie.net/overwatch/images/4/46/Castillo_screenshot_1.png/revision/latest/scale-to-width-down/165?cb=20170524022946');
INSERT INTO MAP (MAP_ID, NAME, TYPE, ICON_URL)
VALUES (522,
        'Ecopoint: Antarctica',
        'ARENA',
        'https://vignette.wikia.nocookie.net/overwatch/images/b/b8/Antarctica_screenshot_1.png/revision/latest/scale-to-width-down/165?cb=20161123001301');
INSERT INTO MAP (MAP_ID, NAME, TYPE, ICON_URL)
VALUES (523,
        'Necropolis',
        'ARENA',
        'https://vignette.wikia.nocookie.net/overwatch/images/4/40/Necropolis_screenshot_1.png/revision/latest/scale-to-width-down/165?cb=20170524023228');

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