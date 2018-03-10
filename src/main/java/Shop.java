import java.util.ArrayList;

public class Shop {

    private ISell stock;
    private String name;
    private ArrayList<Product> shopStock;

    public Shop(String name, ISell stock){
        this.name = name;
        this.stock = stock;
        this.shopStock = new ArrayList<>();
    }

    public ISell getStock(){
        return stock;
    }

    public String getShopName() {
        return name;
    }

    public void addInstrument(Instrument instrument) {
        shopStock.add(instrument);
    }

    public int getStockSize(){
        return shopStock.size();
    }

}

