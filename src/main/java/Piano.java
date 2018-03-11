public class Piano extends Instrument {

    public String colour;

    public Piano(Double priceBought, Double priceSold, InstrumentType instrumenttype, String make, String colour) {
        super(priceBought, priceSold, instrumenttype, make);
        this.colour = colour;
    }

    public String getColour() {
        return colour;
    }

}
