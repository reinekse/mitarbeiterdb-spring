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
    private long id;

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


    // Getter and Setter are needed for http statements in Angular project!

    public long getId() {
        return id;
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


    @Override
    public String toString() {
        return "PersonEntity{" + "id = " + id + ", nachname = " + nachname + ", vorname = " + vorname + ", geburtstag = " + geburtstag + ", abteilung = " + abteilung + ", standortId = " + standortId + ", anstellungstag = " + anstellungstag + "}";
    }

}
