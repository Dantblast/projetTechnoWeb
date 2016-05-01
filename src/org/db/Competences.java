package org.db;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Competences {
	@Id
	private int id_competence;
	private int id_famille;
	private String nom;
	private int coefficient;
	
	public int getId_competence() {
		return id_competence;
	}
	public void setId_competence(int id_competence) {
		this.id_competence = id_competence;
	}
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
	public int getCoefficient() {
		return coefficient;
	}
	public void setCoefficient(int coefficient) {
		this.coefficient = coefficient;
	}
	
	

}
