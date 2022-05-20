CREATE TABLE POKEMON(

    NUM_POKEDEX INTEGER(2) PRIMARY KEY,
    NOMBRE VARCHAR(16) NOT NULL,
    TIPO1 VARCHAR(16) NOT NULL,
    TIPO2 VARCHAR(16),
    IMAGEN INTEGER(2),
    SONIDO INTEGER(2)
	
);

CREATE TABLE MOVIMIENTOS(

    ID_MOVIMIENTO INTEGER(2) PRIMARY KEY AUTO_INCREMENT,
    TIPO VARCHAR(16) NOT NULL,
    NOMBRE VARCHAR(16)  NOT NULL,
    NIVEL INTEGER(2)  NOT NULL,
    ESTAMINA INTEGER (3) NOT NULL,
    POTENCIA INTEGER(3),
    TIPO_ELEMENTO VARCHAR(20),
    NUM_TURNO INTEGER(2) NOT NULL,
    ESTADO VARCHAR(20),
    MEJORA VARCHAR(20),
    CANT_MEJORA INTEGER(2)
	
);

CREATE TABLE ENTRENADOR(

    ID_ENTRENADOR INTEGER(2) PRIMARY KEY AUTO_INCREMENT,
    NOMBRE VARCHAR(16) NOT NULL,
    POKEMONEDAS INTEGER(6)
	
);

CREATE TABLE POKEMON_ENTRENADOR(

    ID_POKEMON INTEGER(2) PRIMARY KEY AUTO_INCREMENT,
    NUM_POKEDEX INTEGER(2),
    ID_ENTRENADOR INTEGER(2),
    MOTE VARCHAR(10),
    VITALIDAD INTEGER(3) NOT NULL,
    ATAQUE INTEGER(3) NOT NULL,
    ATAQUE_ESP INTEGER(3) NOT NULL,
    DEFENSA INTEGER(3)  NOT NULL,
    DEFENSA_ESP INTEGER(3) NOT NULL,
    ESTAMINA INTEGER(3) NOT NULL,
    VELOCIDAD INTEGER(3) NOT NULL,
    NIVEL INTEGER(3),
    FERTILIDAD INTEGER(2) DEFAULT (5),
    EQUIPO INTEGER (1) DEFAULT(0)
    );
	

CREATE TABLE MOVIMIENTOS_POKEMON(

    ID_POKEMON INTEGER(4),
    ID_MOVIMIENTO INTEGER(4), PRIMARY KEY(ID_POKEMON,ID_MOVIMIENTO),
    LISTA INTEGER(1) DEFAULT(0)
	
);

CREATE TABLE COMBATE(

    ID_COMBATE INTEGER(4)PRIMARY KEY AUTO_INCREMENT,
    ID_JUGADOR INTEGER(4),
    ID_RIVAL INTEGER(4),
    GANADOR INTEGER(4),
    POKE_KO_ENTRENADOR INTEGER(1),
    POKE_KO_RIVAL INTEGER(1)
	
);

CREATE TABLE TURNO(

    ID_TURNO INTEGER(4) AUTO_INCREMENT,
    ID_COMBATE INTEGER(3),PRIMARY KEY (ID_TURNO,ID_COMBATE),
    NUM_TURNO INTEGER(2),
    ACCION_RIVAL VARCHAR(10) NOT NULL,
    ACCION_ENTRENADOR VARCHAR(10) NOT NULL
	

);

ALTER TABLE pokemon_entrenador
ADD CONSTRAINT Pok_NumPok_FK FOREIGN KEY (num_pokedex)
	REFERENCES pokemon (NUM_POKEDEX);
	
	
	ALTER TABLE pokemon_entrenador
ADD CONSTRAINT Pok_IdEntre_FK FOREIGN KEY (id_entrenador)
	REFERENCES entrenador (id_entrenador);
	
	
	ALTER TABLE movimientos_pokemon
ADD CONSTRAINT Mov_IdPok_FK FOREIGN KEY (id_pokemon)
	REFERENCES pokemon_entrenador (id_pokemon);
	
	
ALTER TABLE movimientos_pokemon
ADD CONSTRAINT Mov_idMov_FK FOREIGN KEY (id_movimiento)
	REFERENCES movimientos (id_movimiento);
	
	
ALTER TABLE turno
ADD CONSTRAINT Mov_idComb_FK FOREIGN KEY (id_combate)
	REFERENCES combate (id_combate);
	
ALTER TABLE combate
ADD CONSTRAINT Mov_idJug_FK FOREIGN KEY (id_jugador)
	
	REFERENCES entrenador (id_entrenador);
	
ALTER TABLE combate
ADD CONSTRAINT Mov_idRiv_FK FOREIGN KEY (id_rival)
	REFERENCES entrenador (id_entrenador);
	
	
ALTER TABLE combate
ADD CONSTRAINT Mov_Gan_FK FOREIGN KEY (ganador)
	REFERENCES entrenador (id_entrenador);
	


ALTER TABLE pokemon_entrenador
ADD EXPERIENCIA INTEGER(3);


ALTER TABLE pokemon_entrenador
MODIFY ESTAMINA DECIMAL (5,2);


ALTER TABLE pokemon_entrenador
MODIFY ATAQUE DECIMAL(5,2);


ALTER TABLE movimientos
MODIFY POTENCIA DECIMAL (5,2);




    
