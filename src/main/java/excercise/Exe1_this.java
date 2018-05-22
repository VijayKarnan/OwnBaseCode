package excercise;

public class Exe1_this {
	int x, y;

	public int input(int x, int y) {
		// this keyword is used diff b/w parameters and local variables if both
		// are same.(x)
		this.x = x + 1;

		System.out.println("Value of X is:" + x + "\nValue of Y is:" + y);

		return y;
	}

	public Exe1_this()

	{

		System.out.println("this() constructor is invoked");
	}

	public void input1(int y)

	{

		System.out.println("Value of Y in input1 is : " + y);
		System.out.println("Value of X in input1 is : " + this.x);
		// X Value is incremented one in input() so it will be the new value of
		// X in this class
	}

	public void display() {
		System.out.println("Begining");
	}

	public Exe1_this(int x) {
		// display(); //If you enable this method u will get Compile time error
		// message as constructor call should be first in the constructor

		this();// this keyword as constructor to invoke the constructor .
		// This block will be executed first and there is no need to create
		// object for constructors

		this.display();
		// We can access the Class methods using this Keyword
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exe1_this obj = new Exe1_this(5);

		obj.input1(obj.input(5, 6));

	}

}
