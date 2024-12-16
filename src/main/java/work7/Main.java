package work7;

/**
 * The Main class demonstrates the use of the Memento pattern.
 * It shows how to save and restore the state of a graphic element (Circle).
 */
public class Main {

    /**
     * The entry point of the program.
     *
     * @param args the command-line arguments
     */
    public static void main(String[] args) {

        CareTaker caretaker = new CareTaker();

        Circle circle = new Circle("Red", 10, 15, 5);
        circle.draw();

        caretaker.saveState(circle);

        circle.setColor("Blue");
        circle.setX(20);
        circle.setY(25);
        circle.setRadius(10);
        circle.draw();

        caretaker.restoreState(circle);
        circle.draw();
    }
}
