package br.com.rampageSneakers.demo.rampageSneakers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.rampageSneakers.demo.rampageSneakers.products.Sneaker;
import br.com.rampageSneakers.demo.rampageSneakers.products.Sneaker.ShaftHeight;
import br.com.rampageSneakers.demo.rampageSneakers.products.Sneaker.SneakerClosing;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		Sneaker sneaker1 = new Sneaker("Borracha", SneakerClosing.SHOELACE, 
				ShaftHeight.MID_PIPE, "Couro",
				"Dia à Dia", "Casual");
		System.out.println("OOOOOOI");
		System.out.println(sneaker1.toString());
	}

}
