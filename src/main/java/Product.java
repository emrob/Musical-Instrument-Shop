import javax.sound.midi.Instrument;

public abstract class Product implements ISell {

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

    @Override
    public double calculateMarkUp() {
        return getPriceSold() - getPriceBought();
    }


}
