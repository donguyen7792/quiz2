package CISC181;

 
public class CarPayment {
 private double carAmount;
 private double downPayment;
 private double salesTax;
 private double annualPercent;
 private double termInYears;
 
 
 public CarPayment(double carAmount, double downPayment, double salesTax, double annualPercent, double termInYears) {
	super();
	this.carAmount = carAmount;
	this.downPayment = downPayment;
	this.salesTax = salesTax;
	this.annualPercent = annualPercent;
	this.termInYears = termInYears;
}

public double monthlyPayment() {
	double taxPercent = salesTax /100;
    double ratePercent = annualPercent /100;
    double termInMonth = termInYears * 12;
    double totalLoan = (carAmount * (1 + taxPercent)) - downPayment;
    double monthlypayments = (totalLoan * (ratePercent /12)) / (1 - Math.pow(1 + ratePercent / 12, -termInMonth));
    	return monthlypayments;
}
public double totalInterestCost() {
	double taxPercent = salesTax /100;
    double ratePercent = annualPercent /100;
    double termInMonth = termInYears * 12;
    double totalLoan = (carAmount * (1 + taxPercent)) - downPayment;
    double monthlypayments = (totalLoan * (ratePercent /12)) / (1 - Math.pow(1 + ratePercent / 12, -termInMonth));
	double totalAmount = monthlypayments * termInMonth;
    double totalinterestCost = totalAmount - totalLoan;
    return totalinterestCost;
}
 
 

}
