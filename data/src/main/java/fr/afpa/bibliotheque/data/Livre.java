package fr.afpa.bibliotheque.data;

import java.util.Date;

import lombok.Data;

@Data

public class Livre {
	
	private int idlivre;
	private String titre;
	private String description;
	private int isbn;
	private int code;

}
