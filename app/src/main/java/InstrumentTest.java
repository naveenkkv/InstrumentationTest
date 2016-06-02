import android.test.InstrumentationTestCase;

/**
 * Created by naveenkumark on 4/5/16.
 */
public class InstrumentTest extends InstrumentationTestCase {
    int x = 10;
    public void testEmptyTest(){
    }

    public void testAssertNull(){
        assertEquals(null, null);
    }

    public void testAssertString() {
        assertEquals("Naveen", "Naveen");
    }

    public void testAssertBoolean(){
        assertEquals(true, x == 10);
    }

    public void testassertNotNull() {
        assertNotNull("Who are you", "Katta");
    }
}