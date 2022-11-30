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
	private String Sujet;
	@OneToMany(mappedBy="encadrant")
	private Collection<Etudiant> etudiants;
	public EnseignantChercheur(){ super();}

	public EnseignantChercheur(String grade, String etablissement, String sujet) {
		super();
		Grade = grade;
		Etablissement = etablissement;
		Sujet = sujet;
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

	public String getSujet() {
		return Sujet;
	}

	public void setSujet(String sujet) {
		Sujet = sujet;
	}

	public Collection<Etudiant> getEtudiants() {
		return etudiants;
	}

	public void setEtudiants(Collection<Etudiant> etudiants) {
		this.etudiants = etudiants;
	}
	
	
	
	
	
}
