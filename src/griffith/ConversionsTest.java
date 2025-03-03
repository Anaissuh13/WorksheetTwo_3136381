package griffith;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ConversionsTest {

	Conversions conv = new Conversions();

    @Test
    public void testEuroToDollar() {
        assertEquals(1.08, conv.euroToDollar(1), 0.01); // Example exchange rate
        assertEquals(0, conv.euroToDollar(0), 0.01);
        assertEquals(10.8, conv.euroToDollar(10), 0.01);
    }

	@Test
	void test() {
		fail("Not yet implemented");
	}

}
