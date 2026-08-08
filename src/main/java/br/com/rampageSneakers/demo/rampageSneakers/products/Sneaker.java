package br.com.rampageSneakers.demo.rampageSneakers.products;

public class Sneaker extends Product {

    private String sole; // sola
    private SneakerClosing sneakerClosing; // Fechamento Ex.: Cardaço, Velcro...
    private ShaftHeight shaftHeight; // Altura do cano
    private String material;
    private String suitableFor; // Indicado Para. Ex.: Corrida, dia á dia...
    private String type; //Casual, Coerida etc..

    public Sneaker(String sole, SneakerClosing sneakerClosing, ShaftHeight shaftHeight, String material,
            String suitableFor, String type) {
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
        return "Sneaker [sole=" + sole + ", sneakerClosing=" + sneakerClosing + ", shaftHeight=" + shaftHeight
                + ", material=" + material + ", suitableFor=" + suitableFor + ", type=" + type + "]";
    }

    
}



