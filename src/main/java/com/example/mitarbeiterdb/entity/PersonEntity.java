package com.example.mitarbeiterdb.entity;

import jakarta.persistence.*;

import java.io.Serial;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "personen")
public class PersonEntity implements Serializable {

    @Serial
    private static final long serialVersionUID = -1216940057213328598L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public void setGeburtstag(Date geburtstag) {
        this.geburtstag = geburtstag;
    }

    public void setAbteilung(String abteilung) {
        this.abteilung = abteilung;
    }

    public void setStandortId(int standortId) {
        this.standortId = standortId;
    }

    public void setAnstellungstag(Date anstellungstag) {
        this.anstellungstag = anstellungstag;
    }

    private String nachname;
    private String vorname;
    private Date geburtstag;
    private String abteilung;
    private int standortId;
    private Date anstellungstag;


    public int getId() {
        return id;
    }


    public String getNachname() {
        return nachname;
    }


    public String getVorname() {
        return vorname;
    }

    public Date getGeburtstag() {
        return geburtstag;
    }

    public String getAbteilung() {
        return abteilung;
    }

    public int getStandortId() {
        return standortId;
    }

    public Date getAnstellungstag() {
        return anstellungstag;
    }

    @Override
    public String toString() {
        return "PersonEntity{" + "id = " + id + ", nachname = " + nachname + ", vorname = " + vorname + ", geburtstag = " + geburtstag + ", abteilung = " + abteilung + ", standortId = " + standortId + ", anstellungstag = " + anstellungstag + "}";
    }


}
