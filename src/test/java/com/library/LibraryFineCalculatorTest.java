package com.library;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class LibraryFineCalculatorTest {
    LibraryFineCalculator calculator = new LibraryFineCalculator();
    
    @Test
    public void testCalculateStandardFine() {
        assertEquals(10, calculator.calculateStandardFine(5), "Standard fine for 5 days late should be 10");
        assertEquals(0, calculator.calculateStandardFine(0), "No fine for 0 days late");
    }
    
    @Test
    public void testCalculateReferenceBookFine() {
        assertEquals(15, calculator.calculateReferenceBookFine(3), "Reference book fine for 3 days late should be 15");
    }
    
    @Test
    public void testIsAccountSuspended() {
        assertFalse(calculator.isAccountSuspended(50), "Account should not be suspended for fines of 50");
        assertTrue(calculator.isAccountSuspended(55), "Account should be suspended for fines over 50");
    }
}
