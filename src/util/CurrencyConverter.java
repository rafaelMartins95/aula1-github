package util;

public class CurrencyConverter {
	
	public static double convert(double tax, double amount) {
		return tax * amount + (tax*amount) * 0.06;
	}

	
}
