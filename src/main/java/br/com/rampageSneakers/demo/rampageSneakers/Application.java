package br.com.rampageSneakers.demo.rampageSneakers;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.rampageSneakers.demo.rampageSneakers.products.Gender;
import br.com.rampageSneakers.demo.rampageSneakers.products.Sneaker;
import br.com.rampageSneakers.demo.rampageSneakers.products.Sneaker.ShaftHeight;
import br.com.rampageSneakers.demo.rampageSneakers.products.Sneaker.SneakerClosing;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		Sneaker sneaker1 = new Sneaker(
				1,
				"AirForce 90",
				"Tênis muito bonito da Nike",
				BigDecimal.valueOf(199.55),
				true,
				LocalDateTime.now(),
				"Nike",
				5.0,
				Gender.MASCULINO,
				"Borracha",
				SneakerClosing.SHOELACE,
				ShaftHeight.MID_PIPE,
				"Couro",
				"Dia a dia",
				"Casual");

		System.out.println("OOOOOOI");
		System.out.println(sneaker1);
	}

}
