public class Guitar extends Instrument {

    private SoundType soundType;


    public Guitar(Double priceBought, Double priceSold, InstrumentType instrumenttype, String make, SoundType soundType) {
        super(priceBought, priceSold, instrumenttype, make);
        this.soundType = soundType;
    }


    public SoundType getSoundType() {
        return soundType;
    }

}
