package com.example.mitarbeiterdb.entity;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "personen")
public class PersonEntity implements Serializable {

	private static final long serialVersionUID = -1216940057213328598L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(nullable = false, updatable = false)
	private int id;

	private String nachname;
	private String vorname;
	private Date geburtstag;
	private String abteilung;
	private int standortId;
	private Date anstellungstag;

	public PersonEntity() {
	}

	public PersonEntity(String nachname, String vorname, Date geburtstag, String abteilung, int standortId,
			Date anstellungstag) {
		this.setNachname(nachname);
		this.setVorname(vorname);
		this.setGeburtstag(geburtstag);
		this.setAbteilung(abteilung);
		this.setStandortId(standortId);
		this.setAnstellungstag(anstellungstag);

	}

	public String getNachname() {
		return nachname;
	}

	public void setNachname(String nachname) {
		this.nachname = nachname;
	}

	public String getVorname() {
		return vorname;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

	public Date getGeburtstag() {
		return geburtstag;
	}

	public void setGeburtstag(Date geburtstag) {
		this.geburtstag = geburtstag;
	}

	public String getAbteilung() {
		return abteilung;
	}

	public void setAbteilung(String abteilung) {
		this.abteilung = abteilung;
	}

	public int getStandortId() {
		return standortId;
	}

	public void setStandortId(int standortId) {
		this.standortId = standortId;
	}

	public Date getAnstellungstag() {
		return anstellungstag;
	}

	public void setAnstellungstag(Date anstellungstag) {
		this.anstellungstag = anstellungstag;
	}

}
