import java.text.DecimalFormat;
import java.util.Scanner;

public class Circle {

public Circle(double radius)    {
	
	
}

public double getCircumference(double radius ) {
	
double Pi = 3.14159;
double	circumference = 2 * Pi * radius;
	

	return circumference;
	
}

public String getFormattedCircumference(double radius)  {
double circumference = getCircumference(radius);
String nowFormatted =formatNumber(circumference);             // uses the getCircumference method and the formatNumber method to output a formatted calculation of the cirumference
 
	return nowFormatted;
}

public double getArea(double radius)  {
double Pi = 3.14159;
double area = Pi * radius * radius;
	
return area;
}

public String getFormattedArea(double radius) {
	double area = getArea(radius);
	String nowFormatted = formatNumber(area);
	 
		return nowFormatted;
	
}

private String formatNumber(double x )  {

	DecimalFormat df = new DecimalFormat(".00");  
	
	String formatNum = df.format(x);

	
	return formatNum;
}


}
