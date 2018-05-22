package excercise;

public class Exe3_Parent extends Exe3_GrandParent {

	int x=50;
	public void add()
	{
		int x=super.x;//This will give you the Super class x value
		System.out.println("Value of X in Grand Parent class:"+x);
		int y=10;
		
		super.add();//This will call the immediate super class method
	}
	public void display()
	{
		add();
		
		System.out.println("Sum of two numbers present in the Parent Class is: "+(x+y));//In this value of x will be 50 which value declared in this class
	}
	public  Exe3_Parent()
	{
		super();//Parent Class constructor will be invoked
		System.out.println("Parent Class");//Constructor has precedence over other methods
	}
}
