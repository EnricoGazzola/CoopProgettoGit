package it.sincrono.model;

public class Prodotti {
	
	/**
	 * @param id the id to set
	 */
	public void setId(int idprodotti) {
		this.idprodotti = idprodotti;
	}

	/**
	 * @param idCategorieProdotti the idCategorieProdotti to set
	 */
	public void setIdCategorieProdotti(int idCategorieProdotti) {
		this.idCategorieProdotti = idCategorieProdotti;
	}

	private int idprodotti;
	private String descrizione;
	private double prezzo;
	private String marca;
	private int idCategorieProdotti;
	
	public int getIdProdotti() {
		return idprodotti;
	}

	public Prodotti() {
		super();
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public double getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getIdCategorieProdotti() {
		return idCategorieProdotti;
	}

	
}
