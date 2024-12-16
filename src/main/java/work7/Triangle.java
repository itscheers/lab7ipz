package work7;

/**
 * Represents a triangle as a specific type of graphic element.
 */
public class Triangle extends GraphicElement {

    /** The base of the triangle. */
    private int base;

    /** The height of the triangle. */
    private int height;

    /**
     * Constructs a Triangle with specified attributes.
     *
     * @param color the color of the triangle
     * @param x the x-coordinate position of the triangle
     * @param y the y-coordinate position of the triangle
     * @param base the base of the triangle
     * @param height the height of the triangle
     */
    public Triangle(String color, int x, int y, int base, int height) {
        super(color, x, y);
        this.base = base;
        this.height = height;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a triangle at (" + getX() + ", " + getY() + ") with base " + base + ", height " + height + " and color " + getColor());
    }
}
