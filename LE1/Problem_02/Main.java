/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/


// 2. Test for Overriding
// Make a function with the same return type, name of the function, number and type of 
// arguments in the Child class as they are in the Mother class. Change the string to be 
// displayed on the screen. For example, if Mother class version of show ( ) was displaying 
// “Hello World” then the child class version of show ( ) will display “Hello JUET”. Run the 
// application class and discuss the results obtained with your instructor.


class Main {
    public static void main (String args[]){
    System.out.println("Hello World");
    Mother m= new Mother ( );
    m.show( ); 
    Child ch=new Child ( ); 
    ch. show ( ); 
 }
}