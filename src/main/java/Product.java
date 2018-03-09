import javax.sound.midi.Instrument;

public abstract class Product {

    private  Double priceBought;
    private  Double priceSold;

    public Product(Double priceBought, Double priceSold) {

        this.priceBought = priceBought;
        this.priceSold = priceSold;
    }

    public Double getPriceBought() {
        return priceBought;
    }

    public Double getPriceSold() {
        return priceSold;
    }


    public static class Flute extends Instrument {

        private String material;

        public Flute(Double priceBought, Double priceSold, String type, String make) {
            super(priceBought, priceSold, type, make);
        }
    }
}
