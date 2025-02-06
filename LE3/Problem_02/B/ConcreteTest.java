public class ConcreteTest extends AbsTest {

    @Override
    public void display() {
        System.out.println("Display method implemented in ConcreteTest class.");
    }

    public static void main(String[] args) {
        ConcreteTest ct = new ConcreteTest();
        ct.display();  // Calls the display method
    }
}
