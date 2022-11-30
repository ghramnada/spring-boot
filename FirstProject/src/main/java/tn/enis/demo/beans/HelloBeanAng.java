package tn.enis.demo.beans;

import org.springframework.stereotype.Component;

@Component
public class HelloBeanAng implements IHello{
	public String getMessage()
	{
		return ("hello");
	}
}
