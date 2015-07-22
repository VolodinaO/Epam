/**
 * Created by ооо on 22.07.2015.
 */

import model.Table;
import org.junit.Test;
import static org.junit.Assert.*;


public class ObjectTest {
    @Test
    public void testObj() {
        assertNotNull("Такой записи не существует", new Table("Test", "USD")); // Если null - тест завален
        assertNotNull("Записи не существует", new Table(900,900,"lol")); // Если null - тест завален
    }

}