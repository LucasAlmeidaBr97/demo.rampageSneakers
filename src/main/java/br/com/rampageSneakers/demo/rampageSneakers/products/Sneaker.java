package br.com.rampageSneakers.demo.rampageSneakers.products;

import java.math.BigDecimal;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Sneakers")
@Data
@NoArgsConstructor
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

    public Sneaker(
            String productName,
            String productDetails,
            BigDecimal productPrice,
            String brand,
            Gender gender,
            String sole,
            String material,
            String suitableFor,
            String type,
            SneakerClosing sneakerClosing,
            ShaftHeight shaftHeight) {
        super(
                productName,
                productDetails,
                productPrice,
                brand,
                gender);
        this.sole = sole;
        this.sneakerClosing = sneakerClosing;
        this.shaftHeight = shaftHeight;
        this.material = material;
        this.suitableFor = suitableFor;
        this.type = type;
    }

}
