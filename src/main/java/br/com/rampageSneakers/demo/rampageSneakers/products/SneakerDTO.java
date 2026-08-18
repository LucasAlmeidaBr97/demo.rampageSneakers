package br.com.rampageSneakers.demo.rampageSneakers.products;

import java.math.BigDecimal;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SneakerDTO {
    private String productName;
    private BigDecimal productPrice;
    private boolean status;
    private double avaliation;    
}
