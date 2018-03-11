
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.Computer;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;


public class ShopTest {
     Shop shop;


    @Before
    public void setUp() throws Exception {
        shop = new Shop("Emma's Music Shop");
    }


    @Test
    public void checkStockStartsEmpty(){
        ArrayList<ISell> stock = shop.getShopStock();
        assertEquals(0, stock.size());
    }

    @Test
    public void checkCanAddStock(){
        Flute flute = new Flute(100.00, 150.00, InstrumentType.Wind, "Muramatsu", "Silver");
        shop.addStockItem(flute);
        assertEquals(1, shop.getShopStock().size());
    }


    @Test
    public void checkCanRemoveStock(){
        Flute flute = new Flute(100.00, 150.00, InstrumentType.Wind, "Muramatsu", "Silver");
        Flute flute1 = new Flute(100.00, 150.00, InstrumentType.Wind, "Muramatsu", "Silver");
        shop.addStockItem(flute);
        shop.addStockItem(flute1);
        shop.removeStockItem(flute1);
        assertEquals(1, shop.getShopStock().size());
    }

    @Test
    public void checkMarkUp(){
        Flute flute = new Flute(100.00, 150.00, InstrumentType.Wind, "Muramatsu", "Silver");
        shop.addStockItem(flute);
        assertEquals(50.00, shop.markup(flute),0.01);
    }

}

