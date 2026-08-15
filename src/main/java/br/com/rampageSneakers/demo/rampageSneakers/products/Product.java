package br.com.rampageSneakers.demo.rampageSneakers.products;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.OneToMany;
import lombok.Data;
import lombok.NoArgsConstructor;


@MappedSuperclass
@NoArgsConstructor
@Data
public abstract class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    
    private String productName;
    private String productDetails;
    private BigDecimal productPrice;
    private boolean status; // Disponivel ou não na loja
    private LocalDateTime createdAt;
    private String brand; // Marca
    private double avaliation;

    //Enums
    @Enumerated(EnumType.STRING)
    private Gender gender;

    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<ProductVariation> productVariation;

    public Product(String productName, String productDetails, BigDecimal productPrice, boolean status,
            String brand, double avaliation, Gender gender) {
        this.productName = productName;
        this.productDetails = productDetails;
        this.productPrice = productPrice;
        this.status = status;
        this.createdAt = LocalDateTime.now();
        this.brand = brand;
        this.avaliation = avaliation;
        this.gender = gender;
        this.productVariation = new ArrayList<>();
    }
}
