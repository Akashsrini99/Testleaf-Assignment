package week.day3;

public class Overloading {

	
		// TODO Auto-generated method stub
public void car(String model) {
	System.out.println("car is started");
	
}
public void car(int number)
{
	System.out.println("model no");
	}

public static void main(String[] args) {
	Overloading obj=new Overloading();
	obj.car(12);
}
}


