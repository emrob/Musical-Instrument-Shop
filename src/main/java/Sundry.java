public class Sundry extends Product {


    private String type;

    public Sundry(Double priceBought, Double priceSold, String type) {
        super(priceBought, priceSold);
        this.type = type;
    }

    public String getSundryType() {
        return type;
    }


}
