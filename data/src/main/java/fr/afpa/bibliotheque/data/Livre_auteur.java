package fr.afpa.bibliotheque.data;
import java.util.Date;

import lombok.Data;

@Data

public class Livre_auteur {
	
	private int fk_idlivre;
	private int fk_idauteur;

}
