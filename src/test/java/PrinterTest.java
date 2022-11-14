import org.junit.Before;
import org.junit.Test;

public class PrinterTest {
    Printer sheetCount;

    @Before
    public void before(){
        sheetCount = new Printer(10);

    }

    @Test
    public void hasPaper() {
        assertEquals(10, sheetCount.getPaper());

    }
}

