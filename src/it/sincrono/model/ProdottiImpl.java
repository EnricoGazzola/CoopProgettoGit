package it.sincrono.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ProdottiImpl implements ProdottiInterface {
	
	List<Prodotti> l=new ArrayList<Prodotti>();
	Prodotti pr=null;

	@Override
	public List<Prodotti> getAllProdotti() {
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/coop?user=root&password=root");
			
			Statement t=c.createStatement();
			
			ResultSet r=t.executeQuery("select * from prodotti");
			
			
			while(r.next()) {
				pr=new Prodotti();
				pr.setId(r.getInt("idprodotti"));
				pr.setDescrizione(r.getString("descrizione"));
				pr.setMarca(r.getString("marca"));
				pr.setPrezzo(r.getInt("prezzo"));
				pr.setIdCategorieProdotti(r.getInt("idcategorie_prodotti"));
				l.add(pr);
				System.out.println(pr.getDescrizione());
			}
			
			
			
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return l;
	}

	@Override
	public List<Prodotti> findById() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Prodotti> findByDescrizione() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Prodotti> findByMarca() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Prodotti> findByPrezzo() {
		// TODO Auto-generated method stub
		return null;
	}

}
