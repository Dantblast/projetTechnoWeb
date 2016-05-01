package org.db;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Groupes {
	@Id
	private String id_groupe;
	private int id_tuteur;
	private String num_groupe;
	public String getId_groupe() {
		return id_groupe;
	}
	public void setId_groupe(String id_groupe) {
		this.id_groupe = id_groupe;
	}
	public int getId_tuteur() {
		return id_tuteur;
	}
	public void setId_tuteur(int id_tuteur) {
		this.id_tuteur = id_tuteur;
	}
	public String getNum_groupe() {
		return num_groupe;
	}
	public void setNum_groupe(String num_groupe) {
		this.num_groupe = num_groupe;
	}
	
	
}
