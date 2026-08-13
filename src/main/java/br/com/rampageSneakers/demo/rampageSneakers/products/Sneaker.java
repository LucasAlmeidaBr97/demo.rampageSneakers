package br.com.rampageSneakers.demo.rampageSneakers.products;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Sneaker extends Product {

    private String sole; // sola
    private SneakerClosing sneakerClosing; // Fechamento Ex.: Cardaço, Velcro...
    private ShaftHeight shaftHeight; // Altura do cano
    private String material;
    private String suitableFor; // Indicado Para. Ex.: Corrida, dia á dia...
    private String type; // Casual, Coerida etc..

    public Sneaker(long id, String productName, String productDetails, BigDecimal productPrice, boolean status,
            LocalDateTime createdAt, String brand, double avaliation, Gender gender, String sole,
            SneakerClosing sneakerClosing, ShaftHeight shaftHeight, String material, String suitableFor, String type) {
        super(id, productName, productDetails, productPrice, status, createdAt, brand, avaliation, gender);
        this.sole = sole;
        this.sneakerClosing = sneakerClosing;
        this.shaftHeight = shaftHeight;
        this.material = material;
        this.suitableFor = suitableFor;
        this.type = type;

    }

    public enum ShaftHeight {
        LOW_PIPE, // Cano baixo
        MID_PIPE, // Cano médio
        HIGH_TOP // Cano alto
    }

    public enum SneakerClosing {
        SHOELACE, // Cardaço
        VELCRO, // Velcro
        SLIP_ON, // Elastico
        ROTATING_CLASP // Fecho giratório
    }

    @Override
    public String toString() {
        return "{\n" +
                "  \"Id\": " + getId() + ",\n" +
                "  \"Nome\": \"" + getProductName() + "\",\n" +
                "  \"Detalhes\": \"" + getProductDetails() + "\",\n" +
                "  \"Preço\": " + getProductPrice() + ",\n" +
                "  \"Status\": " + isStatus() + ",\n" +
                "  \"Data de Criação\": \"" + getCreatedAt() + "\",\n" +
                "  \"Marca\": \"" + getBrand() + "\",\n" +
                "  \"Avaliação\": " + getAvaliation() + ",\n" +
                "  \"Genêro\": \"" + getGender() + "\",\n" +
                "  \"Tipo da Sola\": \"" + sole + "\",\n" +
                "  \"Tipo do Fechamento\": \"" + sneakerClosing + "\",\n" +
                "  \"Altura do Cano\": \"" + shaftHeight + "\",\n" +
                "  \"Material\": \"" + material + "\",\n" +
                "  \"Recomendado Para\": \"" + suitableFor + "\",\n" +
                "  \"Tipo\": \"" + type + "\",\n" +
                "  \"Variações\": " + getProductVariation() + "\n" +
                "}";
    }

}
