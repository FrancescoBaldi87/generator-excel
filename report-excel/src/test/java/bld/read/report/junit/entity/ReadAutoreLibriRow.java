/**
* @author Francesco Baldi
* @mail francesco.baldi1987@gmail.com
* @class bld.read.report.junit.entity.ReadAutoreLibriRow.java
*/
package bld.read.report.junit.entity;

import java.util.Calendar;

import bld.read.report.excel.annotation.ExcelReadColumn;
import bld.read.report.excel.domain.RowSheetRead;


/**
 * The Class ReadAutoreLibriRow.
 */
public class ReadAutoreLibriRow implements RowSheetRead {

	
	/** The nome. */
	@ExcelReadColumn(name = "Nome")
	private String nome;
	
	/** The cognome. */
	@ExcelReadColumn(name = "Cognome")
	private String cognome;
	
	/** The data di nascita. */
	@ExcelReadColumn(name = "Data di Nascita")
	private Calendar dataDiNascita;
	
	/** The titolo. */
	@ExcelReadColumn(name = "Titolo")
	private String titolo;
	
	/** The genere. */
	@ExcelReadColumn(name = "Genere")
	private String genere;
	
	/** The matricola. */
	@ExcelReadColumn(name = "Matricola")
	private Integer matricola;
	
	/** The prezzo. */
	@ExcelReadColumn(name = "Prezzo")
	private Double prezzo;
	
	/** The supplemento. */
	@ExcelReadColumn(name = "Supplemento")
	private Double supplemento;

	
	
	/**
	 * Instantiates a new read autore libri row.
	 */
	public ReadAutoreLibriRow() {
		super();
	}

	/**
	 * Instantiates a new read autore libri row.
	 *
	 * @param nome          the nome
	 * @param cognome       the cognome
	 * @param dataDiNascita the data di nascita
	 * @param titolo        the titolo
	 * @param genere        the genere
	 * @param matricola     the matricola
	 * @param prezzo        the prezzo
	 * @param supplemento   the supplemento
	 */
	public ReadAutoreLibriRow(String nome, String cognome, Calendar dataDiNascita, String titolo, String genere, Integer matricola,Double prezzo,Double supplemento) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.dataDiNascita = dataDiNascita;
		this.titolo = titolo;
		this.genere = genere;
		this.matricola = matricola;
		this.prezzo=prezzo;
		this.supplemento=supplemento;
	}

	/**
	 * Gets the supplemento.
	 *
	 * @return the supplemento
	 */
	public Double getSupplemento() {
		return supplemento;
	}

	/**
	 * Sets the supplemento.
	 *
	 * @param supplemento the new supplemento
	 */
	public void setSupplemento(Double supplemento) {
		this.supplemento = supplemento;
	}

	/**
	 * Gets the nome.
	 *
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * Sets the nome.
	 *
	 * @param nome the new nome
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * Gets the cognome.
	 *
	 * @return the cognome
	 */
	public String getCognome() {
		return cognome;
	}

	/**
	 * Sets the cognome.
	 *
	 * @param cognome the new cognome
	 */
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	/**
	 * Gets the data di nascita.
	 *
	 * @return the data di nascita
	 */
	public Calendar getDataDiNascita() {
		return dataDiNascita;
	}

	/**
	 * Sets the data di nascita.
	 *
	 * @param dataDiNascita the new data di nascita
	 */
	public void setDataDiNascita(Calendar dataDiNascita) {
		this.dataDiNascita = dataDiNascita;
	}

	/**
	 * Gets the titolo.
	 *
	 * @return the titolo
	 */
	public String getTitolo() {
		return titolo;
	}

	/**
	 * Sets the titolo.
	 *
	 * @param titolo the new titolo
	 */
	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	/**
	 * Gets the genere.
	 *
	 * @return the genere
	 */
	public String getGenere() {
		return genere;
	}

	/**
	 * Sets the genere.
	 *
	 * @param genere the new genere
	 */
	public void setGenere(String genere) {
		this.genere = genere;
	}

	/**
	 * Gets the matricola.
	 *
	 * @return the matricola
	 */
	public Integer getMatricola() {
		return matricola;
	}

	/**
	 * Sets the matricola.
	 *
	 * @param matricola the new matricola
	 */
	public void setMatricola(Integer matricola) {
		this.matricola = matricola;
	}

	/**
	 * Gets the prezzo.
	 *
	 * @return the prezzo
	 */
	public Double getPrezzo() {
		return prezzo;
	}

	/**
	 * Sets the prezzo.
	 *
	 * @param prezzo the new prezzo
	 */
	public void setPrezzo(Double prezzo) {
		this.prezzo = prezzo;
	}

	/**
	 * To string.
	 *
	 * @return the string
	 */
	@Override
	public String toString() {
		return "ReadAutoreLibriRow [nome=" + nome + ", cognome=" + cognome + ", dataDiNascita=" + dataDiNascita
				+ ", titolo=" + titolo + ", genere=" + genere + ", matricola=" + matricola + ", prezzo=" + prezzo
				+ ", supplemento=" + supplemento + "]";
	}
	
	
	
	
}
