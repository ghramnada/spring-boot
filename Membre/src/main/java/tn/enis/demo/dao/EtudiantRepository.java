package tn.enis.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import tn.enis.demo.entities.Etudiant;

public interface EtudiantRepository extends JpaRepository<Etudiant,
Long> {
	List<Etudiant>findByDiplome(String diplome);
	List<Etudiant>findByDiplomeOrderByDateInscriptionDesc(String
	diplome);
}
