import java.util.ArrayList;

public class Shop {

    private String name;
    private ArrayList<ISell> shopStock;


    public Shop(String name) {
        this.name = name;
        this.shopStock = new ArrayList<ISell>();
    }


    public String getShopName() {
        return name;
    }

    public ArrayList<ISell> getShopStock() {
        return shopStock;
    }

    public void setShopStock(ArrayList<ISell> shopStock) {
        this.shopStock = shopStock;
    }


    public void addStockItem(ISell newProduct) {
        shopStock.add(newProduct);
    }

    public void removeStockItem(ISell item) {
        shopStock.remove(item);
    }

    public double markup(ISell item) {
        if (shopStock.contains(item)) {
        }
        return item.calculateMarkUp();
    }

    public int totalProfit() {
        int total = 0;
        for (ISell item : shopStock) {
            total += item.calculateMarkUp();
        }
        return total;
    }


}