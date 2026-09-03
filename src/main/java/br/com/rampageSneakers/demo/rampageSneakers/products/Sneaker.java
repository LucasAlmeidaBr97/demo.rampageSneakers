package br.com.rampageSneakers.demo.rampageSneakers.products;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Sneakers")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Sneaker extends Product {

    private String sole; // sola
    private String material;
    private String suitableFor; // Indicado Para. Ex.: Corrida, dia á dia...
    private String type; // Casual, Coerida etc..

    // Enums
    @Enumerated(EnumType.STRING)
    private SneakerClosing sneakerClosing; // Fechamento Ex.: Cardaço, Velcro...
    @Enumerated(EnumType.STRING)
    private ShaftHeight shaftHeight; // Altura do cano

    

}
