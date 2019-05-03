package application;

public class Calculation {
	static double math(double n1,double n2,String sign) {
switch (sign) {
case "+":
	return n1 + n2;
	
case "-":
	return n1 - n2;
	
case "x":
	return n1 * n2;
	
case "/":
	return n1 / n2;
	
default:
	return 0.0;
	
}
}
}