package br.com.rampageSneakers.demo.rampageSneakers.products;

public class Sneaker extends Product {

    private String sole; // sola
    private SneakerClosing sneakerClosing; // Fechamento Ex.: Cardaço, Velcro...
    private ShaftHeight shaftHeight; // Altura do cano
    private String material;
    private String suitableFor; // Indicado Para. Ex.: Corrida, dia á dia...
    private String type;

    private enum ShaftHeight {
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
}
