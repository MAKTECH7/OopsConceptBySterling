public class Shape {
    private int borderWidth = 0;
    private String Color = null;

    public void setBorderWidth(int borderWidth) {
        this.borderWidth = borderWidth;
    }
    public int getBorderWidth() {
        return borderWidth;
    }
    public void setColor(String Color) {
        this.Color = Color;
    }
    public String getColor() {
        return Color;
    }

    public static double area() { // overriden method
        return 0.0;
    }
}