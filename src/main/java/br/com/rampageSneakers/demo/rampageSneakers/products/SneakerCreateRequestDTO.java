package br.com.rampageSneakers.demo.rampageSneakers.products;

import java.math.BigDecimal;


public record SneakerCreateRequestDTO(
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
}
