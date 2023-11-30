package org.java.spring;

import org.java.spring.db.pojo.Pizza;
import org.java.spring.db.serv.PizzaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringLaMiaPizzeriaCrudApplication implements CommandLineRunner{
	
	@Autowired
	private PizzaService pizzaService;

	public static void main(String[] args) {
		SpringApplication.run(SpringLaMiaPizzeriaCrudApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
			
			pizzaService.save(new Pizza("Margherita", "pomodoro e mozzarella", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT3NFXJq5RkSlTIUyzeI5qdsMGuas67eganCCziHibUvZKPmLTUY5n58YMmO1phDPLY_l8&usqp=CAU", 6D));
			
		
	}
	
	


}
