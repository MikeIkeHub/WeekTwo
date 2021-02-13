package weektwo;

public class Loops {

	public static void main(String[] args) {
		for (int i = 0; i <= 50; i++) // prints from 0 to 100 by 2
		{
			System.out.println(i*2);
		}
		for (int i = 100; i >= 0; i--) // prints from 100 to 0 by 3
		{
			if (i % 3 == 1) 
			{
			System.out.println(i);
			}
		}
		for (int i = 1; i <= 100; i++) //prints from 1 to 100 ignoring evens
		{
			if (i % 2!=0)
			System.out.println(i);
		}
		for (int i = 0; i <= 100; i++)
		{
			if (i % 3==0 && i % 5 != 0) // prints every 3 unless 5 can go into it 
			System.out.println("Hello");
			if (i % 5==0 && i % 3 != 0) // prints every 5 unless 3 can go into it
			System.out.println("World");
			if (i % 3==0 && i % 5==0) // print every time 3 and 5 can go into it
			System.out.println("Hello World");
		}
		

	}

}
