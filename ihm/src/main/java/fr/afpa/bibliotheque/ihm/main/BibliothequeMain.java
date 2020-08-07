/**
 * 
 */
package fr.afpa.bibliotheque.ihm.main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.mysql.cj.log.Log;

import fr.afpa.bibliotheque.business.ExempleLivreBusiness;
import fr.afpa.bibliotheque.business.LivreBusiness;
import fr.afpa.bibliotheque.business.TestBusiness;
import fr.afpa.bibliotheque.data.Livre;
import fr.afpa.bibliotheque.ihm.config.MainConfig;
import lombok.extern.log4j.Log4j;

/**
 * @author bilonjea
 *
 */
@Log4j
public class BibliothequeMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
			/*	log.info("-------------Bibliothe-----------------"
				+"---------------------------------------"
				+"---------------------------------------");*/
	
		ApplicationContext ctx = new AnnotationConfigApplicationContext(MainConfig.class);
	
		TestBusiness test = (TestBusiness) ctx.getBean("testBusiness");
		test.sayHello();
		
		
		ExempleLivreBusiness livre =  (ExempleLivreBusiness) ctx.getBean("exempleLivreBusinessImpl");
		
		int nbr = livre.getLibreByCategory("losirs");
		System.out.println("show livres de la categores loisirs "+ nbr);
		
		LivreBusiness monLivre = (LivreBusiness) ctx.getBean("livreBusinessImpl");
		monLivre.setBusinessCreateLivre("8555", "Mon premier livre", "800", "800");
		monLivre.setBusinessCreateLivre("6885", "Mon premier livre", "900", "900");
//		List<Livre>malist=monLivre.getBusinessRechercherLivreParTitre("premier");
//		System.out.println("malist"+ malist.size());
//		for( Livre monlivre : malist){
//			System.out.println("Mon livre est :"+monlivre.toString());
//		}
 
	}


}
