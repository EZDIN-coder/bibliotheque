package fr.afpa.bibliotheque.data;

import java.util.Date;

import lombok.Data;

@Data
public class Livre_theme {
	
	private int fk_idtheme;
	private int fk_idlivre;


}
