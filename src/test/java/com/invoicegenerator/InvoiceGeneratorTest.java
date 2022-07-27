package com.invoicegenerator;
import com.censusanalyser.InvoiceGenerator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class InvoiceGeneratorTest {
    @Test
    public void givenDistanceAndTime_ShouldReturnTotalFare() {
        InvoiceGenerator invoiceGenerator = new InvoiceGenerator();
        double fare = invoiceGenerator.getFare(4, 15);
        System.out.println(fare);
        Assertions.assertEquals(55, fare);
    }

    @Test
    public void givenDistanceAndTime_WhenTotalFareLessThan10_ShouldReturnMinFare() {
        InvoiceGenerator invoiceGenerator = new InvoiceGenerator();
        double fare = invoiceGenerator.getFare(0.100, 1);
        System.out.println(fare);
        Assertions.assertEquals(5, fare);
    }

    @Test
    public void givenDistanceAndTime_ForMultipleRides_ShouldReturnTotalFare() {
        InvoiceGenerator inVoiceGenerator = new InvoiceGenerator();
        inVoiceGenerator.addRide(4, 15);
        inVoiceGenerator.addRide(10, 30);
        double totalFare = inVoiceGenerator.totalFare();
        System.out.println(totalFare);
        Assertions.assertEquals(185, totalFare);
    }


}