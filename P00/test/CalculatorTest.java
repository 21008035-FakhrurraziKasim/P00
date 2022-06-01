import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAdd() {
		//Arrange - setting up and assigning values 
		int a = 4321;
		int b = 1234;
		Calculator cal = new Calculator();
		
		//Act - calling of class with .add function
		int actual = cal.add (a, b);
		
		//Assert - call j unit method to see if expected outcome is the same as the actual results
		int expected = 5555;
		assertEquals (expected, actual);
	}
	
	@Test 
	public void testSubtract() {
		//Arrange
		int a = 9876;
		int b = 6789;
		Calculator cal = new Calculator();
		
		//Act
		int actual = cal.subtract(a, b);
		
		//Assert
		int expected = 3087;
		assertEquals (expected, actual);
		
	}

	@Test
	public void testMultiply() {
		//Arrange
		int a = 3;
		int b = 5;
		Calculator cal = new Calculator();
		
		//Act
		int actual = cal.multiply(a, b);
		
		//Assert
		int expected = 15;
		assertEquals (expected, actual);
		
	}
	
	@Test
	public void testDivide() {
		//Arrange
		int a = 15;
		int b = 3;
		Calculator cal = new Calculator();
		
		//Act
		int actual = cal.divide(a, b);
		
		//Assert
		int expected = 5;
		assertEquals (expected, actual);
	}
	
}
