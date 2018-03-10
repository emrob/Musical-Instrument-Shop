import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {
    private Guitar guitar;


    @Before
    public void setUp() throws Exception {
        guitar = new Guitar(150.00, 300.00, InstrumentType.String,"Fender", SoundType.Acoustic);
    }

    @Test
    public void checkSoundType(){
        assertEquals(SoundType.Acoustic, guitar.getSoundType());
    }

    @Test
    public void checkPlayMethod(){
        assertEquals("Strum is the sound I make", guitar.music("Strum "));
    }
}
