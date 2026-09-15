package com.pasargad.customer;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

class CalculatorTest {

	@Test
	 void shouldAddTwoNumbers() {

        // Arrange
        Calculator calculator = new Calculator();

        // Act
        int result = calculator.add(2, 3);

        // Assert
        assertEquals(6, result);
    }

}
