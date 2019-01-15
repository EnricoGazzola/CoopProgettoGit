package it.sincrono.model;

public class Fornitori {
	
	private int id;
	private String ragioneSociale;
	private String pIva;
	private String numeroTelefono;
	private int idProdotto;
	
	
	
	/**
	 * @return the ragioneSociale
	 */
	public String getRagioneSociale() {
		return ragioneSociale;
	}
	/**
	 * @param ragioneSociale the ragioneSociale to set
	 */
	public void setRagioneSociale(String ragioneSociale) {
		this.ragioneSociale = ragioneSociale;
	}
	/**
	 * @return the pIva
	 */
	public String getpIva() {
		return pIva;
	}
	/**
	 * @param pIva the pIva to set
	 */
	public void setpIva(String pIva) {
		this.pIva = pIva;
	}
	/**
	 * @return the numeroTelefono
	 */
	public String getNumeroTelefono() {
		return numeroTelefono;
	}
	/**
	 * @param numeroTelefono the numeroTelefono to set
	 */
	public void setNumeroTelefono(String numeroTelefono) {
		this.numeroTelefono = numeroTelefono;
	}
	/**
	 * @return the idProdotto
	 */
	public int getIdProdotto() {
		return idProdotto;
	}
	/**
	 * @param idProdotto the idProdotto to set
	 */
	public void setIdProdotto(int idProdotto) {
		this.idProdotto = idProdotto;
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	
	
	

}
