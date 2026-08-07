package br.com.rampageSneakers.demo.rampageSneakers.products;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public abstract class Product {
    
    private long id;
    private String productName;
    private String productDetails;
    private BigDecimal productPrice;
    private boolean status; 
    private LocalDateTime createdAt;
    private String brand;
    private double avaliation;
    private Gender gender; 
 

}
