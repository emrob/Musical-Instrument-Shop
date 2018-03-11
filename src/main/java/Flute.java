public class Flute extends Instrument {


    private String material;

    public Flute(Double priceBought, Double priceSold, InstrumentType instrumenttype, String make, String material) {
        super(priceBought, priceSold, instrumenttype, make);
        this.material = material;
    }


    public String getFluteMaterial() {
        return material;
    }

}
