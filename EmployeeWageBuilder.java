package javapractice;

public class EmployeeWageBuilder {
	public static void main(String[] args) {
		System.out.println("Welcome Employee Wage");
		int empCheck = (int) Math.floor(Math.random() * 10) % 2;
		System.out.println(empCheck);
		if(empCheck == 1)
		{
			System.out.println("emolyee is present");
	
		}
		else
		{
			System.out.println("employee is not present");
		}
	}

}
	