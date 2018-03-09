public abstract class Product {

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



}
