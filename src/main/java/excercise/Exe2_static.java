package excercise;

public class Exe2_static {
	static int x=32;
	//Memory for static value will be assigned only once and same will be used for all the object instance,so whenever value is updated new value will be stored.
	public void add(int x)
	{
		x=this.x+x;//First this.x will give you the static value 32 then parameter value will be added with static value
		System.out.println("The value of X is:"+x);
	}
	
	public void subtract()
	{
		Exe2_static.display();
		//Though the static value is modified in the previous method ,As the variable X is static value remains same whenever it is used in the another method
		System.out.println("The value of X is:"+x);
	}
	
	public Exe2_static() {
		System.out.println("Constructor: Static method has higher precendence than constructor");
		// TODO Auto-generated constructor stub
	}
	static
	{
		Exe2_static.display();
		System.out.println("There is no need for main method if the JDK is less than 1.7 .Using Static block also we can execute a pgm and it will be excuted first");
	}
	public static void display()
	{
		System.out.println("Static Method");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Exe2_static obj=new Exe2_static();
		obj.add(10);
		obj.subtract();
		//We can't use this and Super keywords in static method
		//We can't access non-static methods inStatic method thats why we are usingObject to access data members and functions
		//Static method will be invoked automatically Object is not required to call this method
	}

}
