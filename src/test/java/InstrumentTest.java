import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class InstrumentTest {

    private Instrument instrument;


    @Before
    public void setUp() throws Exception {
        instrument = new Instrument(40.00,60.00,"Wind", "Muramatsu");
    }

    @Test
    public void checkBoughtPrice(){
        assertEquals(40.00, instrument.getPriceBought(),0.01);
    }

    @Test
    public void checkSoldPrice(){
        assertEquals(60.00, instrument.getPriceSold(),0.01);
    }

    @Test
    public void checkInstrumentType(){
        assertEquals("Wind", instrument.getInstrumentType());
    }

    @Test
    public void checkInstrumentMake(){
        assertEquals("Muramatsu", instrument.getInstrumentMake());
    }
}
