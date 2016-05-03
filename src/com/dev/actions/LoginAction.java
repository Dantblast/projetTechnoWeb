package com.dev.actions;


import org.db.Personnes;

import com.opensymphony.xwork2.ActionSupport;
 
public class LoginAction extends ActionSupport {
	
	
 
    private static final long serialVersionUID = 1L;    
    private String identifiant;
	private String password;
	
	public String getIdentifiant() {
		return identifiant;
	}


	public void setIdentifiant(String identifiant) {
		this.identifiant = identifiant;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}
	
	
    PersonnesDao dao = new PersonnesDao();
    Personnes personnes;
 
    /*@Override
    public void validate() {
        if (personnes.getLogin().length() == (0)) {
            this.addFieldError("personnes.login", "Name is required");
        }
        if (personnes.getPassword().length() == (0)) {
            this.addFieldError("personnes.password", "Password is required");
        }
    }*/
 
    @Override
    public String execute() {
        if (dao.find(personnes.getLogin(), personnes.getPassword())) {
            return "SUCCESS";
        } else {
            this.addActionError("Invalid username and password");
        }
        return "INPUT";
    }
    
     
 
    public Personnes getPersonnes() {
        return personnes;
    }
 
    public void setPersonnes(Personnes personnes) {
        this.personnes = personnes;
    }    
}
