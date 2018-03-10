import java.util.ArrayList;

public class Shop {

    private ISell stock;
    private String name;
//    private ArrayList<ISell> stock;

    public Shop(String name, ISell stock){
        this.name = name;
        this.stock = stock;
//        this.stock = new ArrayList<>();
    }

    public ISell getStock(){
        return stock;
    }

    public String getName() {
        return name;
    }
}






