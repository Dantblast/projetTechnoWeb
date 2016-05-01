package org.db;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Abscences {
	@Id
	 private int id_abscence;
	 private int id_personne;
	 private Date date_abscence;
	 private String justificatif;
	 
	public int getId_abscence() {
		return id_abscence;
	}
	public void setId_abscence(int id_abscence) {
		this.id_abscence = id_abscence;
	}
	public int getId_personne() {
		return id_personne;
	}
	public void setId_personne(int id_personne) {
		this.id_personne = id_personne;
	}
	public Date getDate_abscence() {
		return date_abscence;
	}
	public void setDate_abscence(Date date_abscence) {
		this.date_abscence = date_abscence;
	}
	public String getJustificatif() {
		return justificatif;
	}
	public void setJustificatif(String justificatif) {
		this.justificatif = justificatif;
	}

	 
}
