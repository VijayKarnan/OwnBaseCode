package excercise;

public class Exe3_GrandParent {

	int x=32;
	int y=42;
	public void add()
	{
		int result=x+y;
		System.out.println("Sum of two numbers present in the Grand Parent Class is: "+result);
	}
	public  Exe3_GrandParent()
	{
		System.out.println("Grand Parent Class");
	}
}
