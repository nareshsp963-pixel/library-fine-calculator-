package com.library;
public class LibraryFineCalculator {
    public int calculateStandardFine(int daysLate) {
        if (daysLate <= 0) return 0;
        return daysLate * 2;
    }
    public int calculateReferenceBookFine(int daysLate) {
        if (daysLate <= 0) return 0;
        return daysLate * 5;
    }
    public boolean isAccountSuspended(int totalUnpaidFines) {
        return totalUnpaidFines > 50;
    }
}
