package br.com.rampageSneakers.demo.rampageSneakers.products;

import java.math.BigDecimal;

public record SneakerResponseDTO(
    long id,
    String productName,
    String productDetails,
    BigDecimal productPrice,
    boolean status,
    String brand,
    double avaliation,
    Gender gender,
    String sole,
    String material,
    String suitableFor,
    String type,
    SneakerClosing sneakerClosing,
    ShaftHeight shaftHeight
) {}
