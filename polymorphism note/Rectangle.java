public class Rectangle extends Shape {
    private static int length = 2;
    private static int breath = 4;

    public void setLength(int length) {

        this.length = length;
    }

    public int getLength() {
        return length;
    }

    public void setBreath(int breath) {
        this.breath = breath;
    }

    public int getBreath() {
        return breath;
    }

    // @Override
    public static double area() {
        return length * breath;
    }
}