package tn.enis.demo.beans;

import org.springframework.stereotype.Component;

@Component("fr")
//j'appelle le nom de composant fr dans contexte d'application 
public class HelloBeansFr implements IHello {

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return ("Bonjour");
	}

}
