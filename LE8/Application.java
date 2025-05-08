/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Application
{
	public static void main(String[] args) {
// 		System.out.println("Hello World");
		Crow crow = new IndianCrow();
		CrowAdapter crowadapter = new CrowAdapter(crow);
		Client(crowadapter);
		
	}	
	public static void Client(Swan swan){
	  	swan.eat();
	    swan.swim();
	    swan.sing();
		
	}
	
}
