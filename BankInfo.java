package week.day4;

public class BankInfo extends AxisBank{
public void saving()
{
	System.out.println("Savings Account");
}
public void fixed()
{
	System.out.println("Fixed Account");
}
public void deposit()
{
	System.out.println("Deposit Account");
}
public static void main(String[] args) {
	// TODO Auto-generated method stub
 AxisBank obj=new AxisBank();
 obj.deposit();
}
}
