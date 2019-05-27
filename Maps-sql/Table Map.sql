#------------------------------------------------------------
# Table: Map
#------------------------------------------------------------
CREATE SCHEMA IF NOT EXISTS BoulderDash;

CREATE TABLE IF NOT EXISTS Map(
        ID        Int  Auto_increment  NOT NULL ,
        mapModel  Varchar (10240) NOT NULL ,
        mapWidth  Int NOT NULL ,
        mapHeight Int NOT NULL
	,CONSTRAINT Map_PK PRIMARY KEY (ID)
)ENGINE=InnoDB;