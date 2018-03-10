
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.Computer;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;


public class ShopTest {
    private Shop shop;
    private Piano piano;



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


}

//    Computer computer;
//    Monitor monitor;
//
//    @Before
//    public void before() {
//        monitor = new Monitor(22, 786432);
//        computer = new Computer(8, 512, monitor);
//    }
