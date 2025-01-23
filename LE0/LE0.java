/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
class Juet{
   public String name;
       public int age;
    public void set(String name,int age){
        this.name=name;
        this.age=age;
    }
   public void get(){
        	System.out.println("Name is "+name);
        	System.out.println("age is "+age);
    }
    
}



public class Main
{
	public static void main(String[] args) {
	   Juet ob= new Juet();
	   ob.set("sonu",20);
	   ob.get();
	 
	}
}

