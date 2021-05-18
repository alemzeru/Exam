
public class Q1 {

	public static void main(String[] args) {
		String name;
		String city_and_state= "Charlotte, NC";
		double gross_salary=100000;
		double tax=0.2;
		double taxAmount = tax*gross_salary;
		double net_salary= gross_salary -taxAmount;
		
		System.out.print("Hello My name is Alem Zeru," + "I live in "+city_and_state +" my gross salary is $"+
Math.round(gross_salary)+". I pay "+ Math.round(taxAmount)+" in tax and I take home $"+Math.round(net_salary));
	}

}
