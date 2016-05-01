package org.db;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Notes {
	@Id
	private int id_eleve;
	private int note;
	
	public int getId_eleve() {
		return id_eleve;
	}
	public void setId_eleve(int id_eleve) {
		this.id_eleve = id_eleve;
	}
	public int getNote() {
		return note;
	}
	public void setNote(int note) {
		this.note = note;
	}
	
	

}
