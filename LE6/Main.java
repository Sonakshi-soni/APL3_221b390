/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
// 		System.out.println("Hello World");
		
		Offering offering = new Coffee();
		offering = new Rum(offering);
		offering = new Rum(offering);
		System.out.println(offering.getName()+" "+offering.getPrice());
		
		Offering offering1 = new Tea();
		offering1 = new Gin(offering1);
		offering1 = new Gin(offering1);
		System.out.println(offering1.getName()+" "+offering1.getPrice());
		
		
		Offering offering2 = new Icecream();
		offering2 = new Gin(offering2);
		System.out.println(offering2.getName()+" "+offering2.getPrice());
		
		
		
	}
}
