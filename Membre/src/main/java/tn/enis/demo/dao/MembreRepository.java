package tn.enis.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import tn.enis.demo.entities.Membre;

public interface MembreRepository extends JpaRepository<Membre,
Long> {
	Membre findByCin(String cin);
	List<Membre>findByNomStartingWith(String caractere);
	Membre findByEmail(String email);
}
