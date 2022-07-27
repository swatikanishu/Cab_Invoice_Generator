package com.invoicegenerator;
import com.cabinvoicegenerator.InvoiceBill;
import com.cabinvoicegenerator.InvoiceGenerator;
import com.cabinvoicegenerator.Ride;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class InvoiceGeneratorTest {
    @Test
    public void givenDistanceAndTime_ShouldReturnTotalFare() {
        InvoiceGenerator invoiceGenerator = new InvoiceGenerator();
        double fare = invoiceGenerator.getFare(4, 15);
        Assertions.assertEquals(55, fare, 0.0);
    }

    @Test
    public void givenDistanceAndTime_WhenTotalFareLessThan10_ShouldReturnMinFare() {
        InvoiceGenerator invoiceGenerator = new InvoiceGenerator();
        double fare = invoiceGenerator.getFare(0.100, 1);
        Assertions.assertEquals(5, fare, 0.0);
    }

    @Test
    public void givenDistanceAndTime_ForMultipleRides_ShouldReturnTotalFare() {
        InvoiceGenerator inVoiceGenerator = new InvoiceGenerator();
        inVoiceGenerator.addRide(4, 15);
        inVoiceGenerator.addRide(10, 30);
        double totalFare = inVoiceGenerator.totalFare();
        Assertions.assertEquals(185, totalFare, 0.0);
    }

    @Test
    public void givenMultipleRides_ShouldReturnInvoiceBill() {
        Ride[] rides = {
                new Ride(2.0, 5),
                new Ride(0.1, 1)
        };
        InvoiceBill invoiceBill = InvoiceGenerator.getFare(rides);
        InvoiceBill expectedInvoiceSummary = new InvoiceBill(2, 30.0);
        Assertions.assertEquals(invoiceBill, expectedInvoiceSummary);
    }
}