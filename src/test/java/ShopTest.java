
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.Computer;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;


public class ShopTest {
     Shop shop;
     Piano piano;


    @Before
    public void setUp() throws Exception {
        piano = new Piano(350.99, 800.00, InstrumentType.Key, "Yamaha", "Brown");
        shop = new Shop("Emma's Music Shop", piano);
    }

    @Test
    public void checkStock(){
        ISell stock = shop.getStock();
        assertNotNull(stock);

    }

    @Test
    public void checkCanAddStock(){
        Flute flute = new Flute(100.00, 150.00, InstrumentType.Wind, "Muramatsu", "Silver");
   shop.addInstrument(flute);
        assertEquals(1, shop.getStockSize());
    }

    


}

