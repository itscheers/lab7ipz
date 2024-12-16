package work7;

public class Circle extends GraphicElement {

    /** The radius of the circle. */
    private int radius;

    /**
     * Constructs a Circle with specified attributes.
     *
     * @param color the color of the circle
     * @param x the x-coordinate position of the circle
     * @param y the y-coordinate position of the circle
     * @param radius the radius of the circle
     */
    public Circle(String color, int x, int y, int radius) {
        super(color, x, y);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a circle at (" + getX() + ", " + getY() + ") with radius " + radius + " and color " + getColor());
    }
}

