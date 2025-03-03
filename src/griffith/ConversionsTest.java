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
    
    // Test dollarToEuro
    @Test
    public void testDollarToEuro() {
        assertEquals(9.26, conv.dollarToEuro(10), 0.01); // Expected 1 USD = 0.926 EUR
        assertEquals(0.0, conv.dollarToEuro(0), 0.01);
        assertEquals(-9.26, conv.dollarToEuro(-10), 0.01);
    }

    // Test stringToInteger
    @Test
    public void testStringToInteger() {
        assertEquals(123, conv.stringToInteger("123"));
        assertEquals(-456, conv.stringToInteger("-456"));
        assertThrows(NumberFormatException.class, () -> conv.stringToInteger("abc"));
    }

    // Test integerToString
    @Test
    public void testIntegerToString() {
        assertEquals("123", conv.integerToString(123));
        assertEquals("-456", conv.integerToString(-456));
        assertEquals("0", conv.integerToString(0));
    }

    // Test switchCase
    @Test
    public void testSwitchCase() {
        assertEquals("hELLO wORLD", conv.switchCase("Hello World"));
        assertEquals("tEsT123", conv.switchCase("TeSt123"));
        assertEquals("", conv.switchCase("")); // Edge case: empty string
    }

	@Test
	void test() {
		fail("Not yet implemented");
	}

}
