
// Child.java
class Child extends Mother {
    // static void show() -> error: show() in Child cannot override show() in Mother
        static void show() {
        System.out.println("Child's show method");
    }
}