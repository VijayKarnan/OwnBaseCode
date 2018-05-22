package excercise;

public class Exe3_super extends Exe3_Parent {

	public void display(int x)
	{
		super.display();
		System.out.println("Child Class");
		System.out.println("The value of X in Child class is:"+x);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Exe3_super obj=new Exe3_super();
		
		obj.display(50);

	}

}
