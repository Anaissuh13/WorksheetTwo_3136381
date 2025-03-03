package griffith;

public class Conversions {
	//Name - Hussaina Hussain
	//Student Number - 3136381
	
	
	// Converts Euro to Dollar
    public double euroToDollar(double euro) {
    	return euro * 1.08; // Example exchange rate
    }

    // Converts Dollar to Euro
    public double dollarToEuro(double dollar) {
    	return dollar * 0.926; // Assuming 1 USD = 0.926 EUR
    }

    // Converts String to Integer
    public int stringToInteger(String val) {
    	return Integer.parseInt(val);
    }

    // Converts Integer to String
    public String integerToString(int val) {
    	 return String.valueOf(val);
    }

    // Switches uppercase to lowercase and vice versa
    public String switchCase(String input) {
    	StringBuilder result = new StringBuilder();
        for (char c : input.toCharArray()) {
            if (Character.isUpperCase(c)) {
                result.append(Character.toLowerCase(c));
            } else if (Character.isLowerCase(c)) {
                result.append(Character.toUpperCase(c));
            } else {
                result.append(c);
            }
        }
        return result.toString();
    }
}
