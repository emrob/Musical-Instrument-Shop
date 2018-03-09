import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SundryTest {

    private Sundry sundry;

    @Before
    public void setUp() throws Exception {
        sundry = new Sundry(5.00, 15.00, "Guitar strings");
    }

    @Test
    public void testSundryBoughtPrice(){
        assertEquals(5.00, sundry.getPriceBought(),0.01);
    }

    @Test
    public void testSundrySoldPrice(){
        assertEquals(15.00, sundry.getPriceSold(),0.01);
    }

    @Test
    public void testSundryType(){
        assertEquals("Guitar strings", sundry.getSundryType());
    }
}
