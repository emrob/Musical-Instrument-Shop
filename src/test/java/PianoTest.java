import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    private Piano piano;

    @Before
    public void setUp() throws Exception {
        piano = new Piano(800.00, 1400.00, InstrumentType.Key,"Yamaha", "Black");
    }

    @Test
    public void checkPianoColour(){
        assertEquals("Black", piano.colour);
    }
    
    @Test
    public void checkMarkUp(){
        assertEquals(600.00, piano.calculateMarkUp(), 0.01);
    }
}
