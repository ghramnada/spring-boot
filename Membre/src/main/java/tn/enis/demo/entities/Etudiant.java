package tn.enis.demo.entities;

import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import java.io.Serializable;

@Entity
@DiscriminatorValue("etd")
public class Etudiant extends Membre implements Serializable{
	
	private Date dateInscription;
	private String Diplome;
	
	
	
	public Etudiant(String cin, String nom, String prenom, java.util.Date date, byte[] photo, String cv, String email,
			String password, java.util.Date dateInscription, String diplome) {
		super(cin, nom, prenom, date, photo, cv, email, password);
		this.dateInscription = dateInscription;
		Diplome = diplome;
	}
	@ManyToOne
	private EnseignantChercheur encadrant;
	Etudiant()
	{super();}
	
	public Date getDateInscription() {
		return dateInscription;
	}
	public void setDateInscription(Date dateInscription) {
		this.dateInscription = dateInscription;
	}
	public String getDiplome() {
		return Diplome;
	}
	public void setDiplome(String diplome) {
		Diplome = diplome;
	}

}
