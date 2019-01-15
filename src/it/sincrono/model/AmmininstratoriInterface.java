package it.sincrono.model;

import java.util.List;

public interface AmmininstratoriInterface {
	
	public List<Amministratori> getAllAmministratori();
	public List<Amministratori> findByUser();
	public List<Amministratori> findById();
}
