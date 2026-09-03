package br.com.rampageSneakers.demo.rampageSneakers.products;

import java.math.BigDecimal;

public record SneakerResponseDTO(
    long id,
    String productName,
    BigDecimal productPrice,
    String brand,
    Gender gender,
    String type,
    ShaftHeight shaftHeight
) {}
