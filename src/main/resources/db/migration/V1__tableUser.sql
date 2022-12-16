

DROP TABLE IF EXISTS userInfo;


CREATE TABLE user_info
(
    id BIGSERIAL PRIMARY KEY NOT NULL,
    nom varchar(64),
    prenom varchar(64),
    pseudo varchar(64),
	mdp varchar(64),
	date_naissance varchar(64),
	email varchar(64),
	tel varchar(64),
	status varchar(64)
)