import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FluteTest {
    private Flute flute;


    @Before
    public void setUp() throws Exception {
        flute = new Flute(100.00, 150.00, InstrumentType.Wind, "Muramatsu", "Silver");
    }

    @Test
    public void checkGetFluteBoughtPrice(){
        assertEquals(100.00, flute.getPriceBought(), 0.01);
    }

    @Test
    public void checkGetFlueSoldPrice(){
        assertEquals(150.00, flute.getPriceSold(),0.01);
    }

    @Test
    public void checkFluteType(){
        assertEquals(InstrumentType.Wind, flute.getInstrumentType());
    }

    @Test
    public void checkFluteMake(){
        assertEquals("Muramatsu", flute.getInstrumentMake());
    }

    @Test
    public void checkFluteMaterial(){
        assertEquals("Silver", flute.getFluteMaterial());
    }
}
