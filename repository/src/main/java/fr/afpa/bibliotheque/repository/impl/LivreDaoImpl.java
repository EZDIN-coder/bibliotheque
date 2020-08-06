package fr.afpa.bibliotheque.repository.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import fr.afpa.bibliotheque.data.Livre;
import fr.afpa.bibliotheque.repository.mapper.LivreMapper;

public class LivreDaoImpl {
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public List<Livre> getAllLivre() {
		String query = "Select * from Livre ";
		return jdbcTemplate.query(query, new LivreMapper());
	
	}
	private static final class LivreMapper implements RowMapper<Livre> {
		public Livre mapRow(ResultSet rs, int rowNum) throws SQLException {
			Livre msg = new Livre();
			msg.setIdlivre(rs.getInt("id"));
			msg.setTitre(rs.getString("titre"));
			msg.setDescription(rs.getString("description"));
			msg.setIsbn(rs.getInt("isbn"));
			msg.setCode(rs.getInt("code"));
			
			
			return msg;
		}
	
}
	
	public int getNblivre() {
		String query = "Select count(*) from livre ";
		return jdbcTemplate.queryForObject(query, Integer.class);
	}
	
	
	
	public void setLivre(int id,String titre,String description,int isbn,int code) {
		String query = "INSERT INTO Livre (ID,TITRE,DESCRIPTION,ISBN,CODE) values (?, ?, ?, ?, ?)";
		jdbcTemplate.update(query,id,titre,description,isbn,code);
	}
	
	public void deleLivreById(int id) {
		 String query= "delete from Livre where id = ?";
		 jdbcTemplate.update(query, id);
	}
	
	public int getlivreByTitre(String titre) {
		String query = "Select (*) from livre where titre equal =  ";
		return jdbcTemplate.queryForObject(query, Integer.class);
	}
	
	
	
}
