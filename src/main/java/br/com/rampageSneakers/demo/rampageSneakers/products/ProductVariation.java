package br.com.rampageSneakers.demo.rampageSneakers.products;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "product_variation")
@Data
@NoArgsConstructor
public class ProductVariation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    
    private String color;
    private String size;
    private int quantityInStock;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id")
    private Product product;

    public ProductVariation(long id, String color, String size, int quantityInStock) {
        this.id = id;
        this.color = color;
        this.size = size;
        this.quantityInStock = quantityInStock;
    }
}
