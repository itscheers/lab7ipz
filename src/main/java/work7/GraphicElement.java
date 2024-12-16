package work7;

/**
 * Represents a generic graphic element with common attributes.
 */
public abstract class GraphicElement {

    /** The color of the graphic element. */
    private String color;

    /** The x-coordinate position of the graphic element. */
    private int x;

    /** The y-coordinate position of the graphic element. */
    private int y;

    /**
     * Constructs a GraphicElement with specified color and position.
     *
     * @param color the color of the graphic element
     * @param x the x-coordinate position
     * @param y the y-coordinate position
     */
    public GraphicElement(String color, int x, int y) {
        this.color = color;
        this.x = x;
        this.y = y;
    }

    // Getters and setters
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    /**
     * Saves the current state of the graphic element.
     *
     * @return a Memento object containing the current state
     */
    public Memento saveState() {
        return new Memento(color, x, y);
    }

    /**
     * Restores the graphic element to a previous state.
     *
     * @param memento the Memento object containing the saved state
     */
    public void restoreState(Memento memento) {
        this.color = memento.getColor();
        this.x = memento.getX();
        this.y = memento.getY();
    }

    /**
     * Abstract method for drawing the graphic element.
     */
    public abstract void draw();

    /**
     * Inner class representing the Memento for saving state.
     */
    public static class Memento {

        private final String color;
        private final int x;
        private final int y;

        public Memento(String color, int x, int y) {
            this.color = color;
            this.x = x;
            this.y = y;
        }

        public String getColor() {
            return color;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }
    }
}

