package org.db;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Deadlines {
	@Id
	private int id_deadline;
	private String nom;
	private String num_groupe;
	private Date date_deadline;
	
	public int getId_deadline() {
		return id_deadline;
	}
	public void setId_deadline(int id_deadline) {
		this.id_deadline = id_deadline;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getNum_groupe() {
		return num_groupe;
	}
	public void setNum_groupe(String num_groupe) {
		this.num_groupe = num_groupe;
	}
	public Date getDate_deadline() {
		return date_deadline;
	}
	public void setDate_deadline(Date date_deadline) {
		this.date_deadline = date_deadline;
	}
	
	

}
