package com.example.mitarbeiterdb.entity;

import jakarta.persistence.*;

import java.io.Serial;
import java.io.Serializable;

@Entity
@Table(name = "standorte")
public class StandortEntity implements Serializable {

    @Serial
    private static final long serialVersionUID = -4020197691067599627L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String strasse;
    private String hausnummer;
    private String plz;
    private String ort;

    public StandortEntity() {
    }

    public StandortEntity(String strasse, String hausnummer, String plz, String ort) {
        this.strasse = strasse;
        this.hausnummer = hausnummer;
        this.plz = plz;
        this.ort = ort;
    }

    public int getId() {
        return id;
    }

    public String getStrasse() {
        return strasse;
    }

    public void setStrasse(String strasse) {
        this.strasse = strasse;
    }

    public String getHausnummer() {
        return hausnummer;
    }

    public void setHausnummer(String hausnummer) {
        this.hausnummer = hausnummer;
    }

    public String getPlz() {
        return plz;
    }

    public void setPlz(String plz) {
        this.plz = plz;
    }

    public String getOrt() {
        return ort;
    }

    public void setOrt(String ort) {
        this.ort = ort;
    }

    @Override
    public String toString() {
        return "StandortEntity{" + "id = " + id + ", strasse = " + strasse + ", hausnummer = " + hausnummer + ", PLZ = " + plz + ", ort = " + ort + "}";
    }
}
