package fr.afpa.bibliotheque.business.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import fr.afpa.bibliotheque.business.LivreBusiness;
import fr.afpa.bibliotheque.service.LivreService;

@Component

public class LivreBusinessImpl implements LivreBusiness {
	
	@Autowired
	LivreService serviceLivre;
	
	public int getNbLivre() {
		return serviceLivre.getNbLivre();
	}

	@Override
	public int getNblivre() {
		// TODO Auto-generated method stub
		return 0;
	}

	
}
