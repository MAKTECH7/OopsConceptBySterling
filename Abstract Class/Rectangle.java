public abstract class Rectangle extends Shape {
    private int length = 2;
    private int breath = 2;

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
    // public double area() {
    // return length * breath;
    // }
}