public class Bill
{
	private double costOfMeal;
	private int totalCustomers;

	public Bill(double totalBill, int numCustomers)
	{
		costOfMeal = totalBill;
		totalCustomers = numCustomers;
	}

	public String toString(){
		return "Your bill is $"+costOfMeal;
}
