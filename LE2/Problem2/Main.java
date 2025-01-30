/* 2. Writing beautiful code
With reference to the above program, if you call hear() before prepareVoice() or only
call hear() but no prepareVoice(), the program will not work as expected. So you may
want to enforce some way on users to use your program. One way to do so is by
creating another method inside Voice that will call the methods in required sequence.
You can compare this approach to making a special dish according to a recipe. Recipe is
a procedure; if you don’t follow it you will not get the perfect taste. This is a very-very
special way of writing beautiful codes when your procedures are to be called in a strict
order. In the world of Software Design, this way of writing codes is called ‘Template
Methods’.
Write another class Voice2 having a templateMethod() to call the required procedures
in sequence.
Learning: Observe that you may enforce some strict order, a recipe, for the methods of
your class to achieve some goal—displaying voices of animals, for instance.
*/



// Base class: Voice
class Voice {
    public void prepareVoice() {
        System.out.println("Preparing the voice...");
    }

    public void hear() {
        System.out.println("Hearing the voice...");
    }
}

class Voice2 extends Voice {
    public void templateMethod() {
        prepareVoice();
        hear();
    }
}


public class Main {
    public static void main(String[] args) {
        Voice2 voice = new Voice2();
        voice.templateMethod(); // Enforces the sequence: prepareVoice() -> hear()

        // Attempting to call hear() directly without prepareVoice()
        System.out.println("\nDirect call without sequence:");
        
        Voice originalVoice = new Voice();
        originalVoice.hear(); // No enforcement of sequence, may not work as expected
    }
}
