public class Instrument extends Product {

    private String type;
    private String make;


    public Instrument(Double priceBought, Double priceSold, String type, String make) {
        super(priceBought, priceSold);
        this.type = type;
        this.make = make;
    }

    public String getInstrumentType() {
        return type;
    }

    public String getInstrumentMake() {
        return make;
    }
}
