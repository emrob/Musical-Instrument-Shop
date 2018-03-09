public class Instrument extends Product {

    private InstrumentType instrumenttype;
    private String make;


    public Instrument(Double priceBought, Double priceSold, InstrumentType instrumenttype, String make) {
        super(priceBought, priceSold);
        this.instrumenttype = instrumenttype;
        this.make = make;
    }

    public InstrumentType getInstrumentType() {
        return instrumenttype;
    }

    public String getInstrumentMake() {
        return make;
    }
}
