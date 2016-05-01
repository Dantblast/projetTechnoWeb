package org.db;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Familles {
	@Id
	private int id_famille;
	private String nom;
	
	public int getId_famille() {
		return id_famille;
	}
	public void setId_famille(int id_famille) {
		this.id_famille = id_famille;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	

}
