// Two.java
class Two extends One {
    Two(int x) {
        super(x); // Explicitly call the parameterized constructor of One
        System.out.println("Constructor of Class Two : " + x);
    }
}