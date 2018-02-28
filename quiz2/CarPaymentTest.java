package CISC181;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CarPaymentTest {

	@Test
	void testTotalInterestPaid1() { 
		CarPayment test = new CarPayment(35000, 0, 0, 0.10, 60); 
		double expectedValue = 1061.95;
		double result = test.totalInterestCost();
		assertEquals (expectedValue, result,0.01);
	}
	void testMonthlyPayment1() {
		CarPayment test = new CarPayment(35000, 0, 0, 0.1, 60); 
		double expectedValue = 743.65;
		double result = test.monthlyPayment();
		assertEquals (expectedValue, result,0.01);
}
}