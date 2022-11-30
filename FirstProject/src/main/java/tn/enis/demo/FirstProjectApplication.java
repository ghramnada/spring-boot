package tn.enis.demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import tn.enis.demo.beans.HelloBeanAng;
import tn.enis.demo.beans.IHello;

@SpringBootApplication
public class FirstProjectApplication implements CommandLineRunner{
	
	@Autowired
	@Qualifier("fr")
	IHello h;
	public static void main(String[] args) {
		SpringApplication.run(FirstProjectApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		System.out.println(h.getMessage());
		
	}
}
