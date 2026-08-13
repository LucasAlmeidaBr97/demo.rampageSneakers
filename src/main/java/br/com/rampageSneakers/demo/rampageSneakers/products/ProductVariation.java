package br.com.rampageSneakers.demo.rampageSneakers.products;

public class ProductVariation {

    private long id;
    private long productId;

    private String color;
    private String size;
    
    private int quantityInStock;

    public ProductVariation(long id, long productId, String color, String size, int quantityInStock) {
        this.id = id;
        this.productId = productId;
        this.color = color;
        this.size = size;
        this.quantityInStock = quantityInStock;
    }

    @Override
    public String toString() {
        return "{\n" + 
            "    \"Id\": " + id + ",\n" + 
            "    \"Id do Produto\": " + productId + ",\n" + 
            "    \"Cor\": \"" + color + "\",\n" + 
            "    \"Tamanho\": " + size + ",\n" + 
            "    \"Quantidade\": " + quantityInStock + "\n" + 
            "  }";
    }

}
