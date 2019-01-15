package it.sincrono.model;

import java.util.List;

public interface FornitoriInterface {
	
	public List<Fornitori> getAllFornitori();
	public List<Fornitori> findById();
	public List<Fornitori> findByragioneSociale();
	public List<Fornitori> findByPIva();
	


}
