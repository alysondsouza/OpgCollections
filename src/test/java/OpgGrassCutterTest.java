import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class OpgGrassCutterTest {

    Grass.OpgGrassCutter grassCutter = new Grass.OpgGrassCutter();

    double grassSpeedPerDay = 0.8;
    double grassHeightNow;//userInput
    double grassNowTest1, grassNowTest2, grassNowTest3;
    double grassHeightToBeCut = 10.0;
    double days;

    @Before
    public void setUp() {

        grassNowTest1 = 5;
        grassNowTest2 = 5;
        grassNowTest3 = 11;


    }

    @Test
    public void whenToCutGrassExpected() {
        days = ((grassHeightToBeCut - grassNowTest1) / grassSpeedPerDay);
        days = (int) days;
        assertEquals(6, days, 0.1);
    }

    @Test
    public void whenToCutGrassFail() {
        days = ((grassHeightToBeCut - grassNowTest2) / grassSpeedPerDay);
        days = (int) days;
        assertNotEquals(6.25, days, 0.1);
    }

    @Test
    public void userInput() {
    }

    @Test
    public void display() {
    }
}