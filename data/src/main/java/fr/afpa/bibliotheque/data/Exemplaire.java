package fr.afpa.bibliotheque.data;

import java.util.Date;

import lombok.Data;

@Data

public class Exemplaire {
	
	
	private int idexemple;
	private Boolean disponibilite;
	private int fk_idlivre;

}
