package org.db;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Remarques {
	@Id
	private int id_remarque;
	private int id_from;
	private String id_to;
	private String text_remarque;
	
	public int getId_remarque() {
		return id_remarque;
	}
	public void setId_remarque(int id_remarque) {
		this.id_remarque = id_remarque;
	}
	public int getId_from() {
		return id_from;
	}
	public void setId_from(int id_from) {
		this.id_from = id_from;
	}
	public String getId_to() {
		return id_to;
	}
	public void setId_to(String id_to) {
		this.id_to = id_to;
	}
	public String getText_remarque() {
		return text_remarque;
	}
	public void setText_remarque(String text_remarque) {
		this.text_remarque = text_remarque;
	}
	

}
