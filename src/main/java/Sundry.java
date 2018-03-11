public class Sundry extends Product implements ISell {

    private AccessoryType accessorytype;

    public Sundry(Double priceBought, Double priceSold, AccessoryType accessorytype) {
        super(priceBought, priceSold);
        this.accessorytype = accessorytype;
    }

    public AccessoryType getAccessorytype() {
        return accessorytype;
    }

    @Override
    public double calculateMarkUp() {
        return getPriceSold() - getPriceBought();
    }

}
