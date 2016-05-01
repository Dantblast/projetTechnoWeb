package org.db;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Droits {
	@Id
	private int id_droit;
	private String nom;
	
	public int getId_droit() {
		return id_droit;
	}
	public void setId_droit(int id_droit) {
		this.id_droit = id_droit;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	
}
