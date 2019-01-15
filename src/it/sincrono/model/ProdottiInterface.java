package it.sincrono.model;

import java.util.List;

public interface ProdottiInterface {
	
	public List<Prodotti> getAllProdotti();
	public List<Prodotti> findById();
	public List<Prodotti> findByDescrizione();
	public List<Prodotti> findByMarca();
	public List<Prodotti> findByPrezzo();
}
