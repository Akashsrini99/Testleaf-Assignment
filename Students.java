package week.day4;

public class Students {
public void getStudentInfo(int id)
{
	System.out.println("ID:"+id);
}
public void getStudentInfo(int id,String name)
{
	System.out.println("ID:"+id + " " +"Name:" +name);
}
public void getStudentInfo(String email,int phoneNumber)
{
	System.out.println("Email:"+email+" "+"PhoneNumber:"+phoneNumber);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Students obj=new Students();
obj.getStudentInfo(205);
obj.getStudentInfo(205,"Vineel");
obj.getStudentInfo("tes@gmail.com",882536061);
	}

}
