package com.second;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Scope;

@SpringBootApplication
public class NewApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context =SpringApplication.run(NewApplication.class, args);
		Empy E= context.getBean(Empy.class);
		Empy E1= context.getBean(Empy.class);
		E.comity();
		E1.comity();
		Factory f=new Factory();
		f.incharge();
	}

}
