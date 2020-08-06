/**
 * 
 */
package fr.afpa.bibliotheque.ihm.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import fr.afpa.bibliotheque.business.ExempleLivreBusiness;
import fr.afpa.bibliotheque.business.LivreBusiness;
import fr.afpa.bibliotheque.business.TestBusiness;
import fr.afpa.bibliotheque.business.impl.ExempleLivreBusinessImpl;
import fr.afpa.bibliotheque.ihm.config.MainConfig;
import fr.afpa.bibliotheque.repository.impl.LivreDaoImpl;
import javafx.application.Application;
import javafx.stage.Stage;
import lombok.extern.log4j.Log4j;


@Log4j
public class BibliothequeMain {
	
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		log.info("--------------------------------------"
				+"---------------------------------------"
				+"-------------Bibliotheque-----------------"
				+"---------------------------------------"
				+"---------------------------------------");
	
		ApplicationContext ctx = new AnnotationConfigApplicationContext(MainConfig.class);
	
		TestBusiness test = (TestBusiness) ctx.getBean("testBusiness");
		test.sayHello();
		
		ExempleLivreBusiness livre =  (ExempleLivreBusiness) ctx.getBean("exempleLivreBusinessImpl");
		
		int nbr = livre.getLibreByCategory("losirs");
		System.out.println("show livres de la categores loisirs "+ nbr);
		
		log.info("-------------Create Livre------------------");
		
		LivreBusiness livre1 = (LivreBusiness) ctx.getBean("LivreBusinessImpl");
		
		int num = livre1.getNblivre();
		
		System.out.println("Le nombre des livres est  "+num);
		

	}
	
	     


}
