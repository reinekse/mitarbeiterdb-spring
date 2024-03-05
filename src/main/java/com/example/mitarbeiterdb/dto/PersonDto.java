package com.example.mitarbeiterdb.dto;

import java.util.Date;

public class PersonDto {
    private int id;

    private String nachname;
    private String vorname;
    private Date geburtstag;
    private String abteilung;
    private int standortId;
    private Date anstellungstag;

    // Getter are needed for http statements in Angular project!

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public String getAbteilung() {
        return abteilung;
    }

    public void setAbteilung(String abteilung) {
        this.abteilung = abteilung;
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
