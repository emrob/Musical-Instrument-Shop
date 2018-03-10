public class Instrument extends Product implements IPlay {

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



    @Override
    public String music(String data) {
        return data + "is the sound I make";
    }
}
