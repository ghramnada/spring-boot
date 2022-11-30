package tn.enis.demo.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToMany;


@Entity
@DiscriminatorValue("ens")
public class EnseignantChercheur extends Membre implements Serializable{
	
	private String Grade;
	private String Etablissement;
	@OneToMany(mappedBy="encadrant")
	private Collection<Etudiant> etudiants;
	public EnseignantChercheur(){ super();}

	
	public EnseignantChercheur(String cin, String nom, String prenom, java.util.Date date, byte[] photo, String cv,
			String email, String password, String grade, String etablissement) {
		super(cin, nom, prenom, date, photo, cv, email, password);
		Grade = grade;
		Etablissement = etablissement;
	}


	public String getGrade() {
		return Grade;
	}

	public void setGrade(String grade) {
		Grade = grade;
	}

	public String getEtablissement() {
		return Etablissement;
	}

	public void setEtablissement(String etablissement) {
		Etablissement = etablissement;
	}

	public Collection<Etudiant> getEtudiants() {
		return etudiants;
	}

	public void setEtudiants(Collection<Etudiant> etudiants) {
		this.etudiants = etudiants;
	}

	
	
	
	
	
	
}
