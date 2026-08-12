package br.com.rampageSneakers.demo.rampageSneakers.products;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public abstract class Product {

    private long id;
    private String productName;
    private String productDetails;
    private BigDecimal productPrice;
    private boolean status; //Disponivel ou não na loja
    private LocalDateTime createdAt;
    private String brand; // Marca
    private double avaliation;
    private Gender gender;
    private List<ProductVariation> productVariation;

    public Product(long id, String productName, String productDetails, BigDecimal productPrice, boolean status,
            LocalDateTime createdAt, String brand, double avaliation, Gender gender) {
        this.id = id;
        this.productName = productName;
        this.productDetails = productDetails;
        this.productPrice = productPrice;
        this.status = status;
        this.createdAt = createdAt;
        this.brand = brand;
        this.avaliation = avaliation;
        this.gender = gender;
        this.productVariation = new ArrayList<>();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductDetails() {
        return productDetails;
    }

    public void setProductDetails(String productDetails) {
        this.productDetails = productDetails;
    }

    public BigDecimal getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(BigDecimal productPrice) {
        this.productPrice = productPrice;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getAvaliation() {
        return avaliation;
    }

    public void setAvaliation(double avaliation) {
        this.avaliation = avaliation;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public void setVariation(ProductVariation productVariation){
        this.productVariation.add(productVariation);    
    }

    public List<ProductVariation> getProductVariation() {
        return productVariation;
    }

}
