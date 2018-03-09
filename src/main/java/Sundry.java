public class Sundry extends Product {


    private AccessoryType accessorytype;

    public Sundry(Double priceBought, Double priceSold, AccessoryType accessorytype) {
        super(priceBought, priceSold);
        this.accessorytype = accessorytype;
    }


    public AccessoryType getAccessorytype() {
        return accessorytype;
    }
}
