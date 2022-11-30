import java.sql.Date;

import javax.swing.text.DateFormatter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import tn.enis.demo.dao.EnseignantChercheurRepository;
import tn.enis.demo.dao.EtudiantRepository;
import tn.enis.demo.dao.MembreRepository;
import tn.enis.demo.entities.Etudiant;

@SpringBootApplication
public class MemberServiceApplication {
	
	@Autowired 
	EtudiantRepository etdrepo;
	EnseignantChercheurRepository ensrepo;
	
	public static void main(String[] args) implements CommandLineRunner{
		// TODO Auto-generated method stub
		SpringApplication.run(MembreServiceApplication.class, args);
	}
	public void run(String... args) throws Exception {
	// to do
		
		Date dat1 = DateFormatter.parse("2022-11-18");
		Date dat2 = DateFormatter.parse("2022-11-18");
		Etudiant etd1 = new Etudiant("1111","nant","nio",, null,"cv1","jvsldj@gmail.com","kkkskk",2022-11-17,"diplome");
		Etudiant etd2 = new Etudiant("1234","nant","nio","2022-11-18",null,"cv1","jvsldj@gmail.com","kkkskk","2022-11-17","diplome");
		
		Etudiant etd2;
		
	}
}
