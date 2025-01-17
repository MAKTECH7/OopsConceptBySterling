public class TestShape {
    public static void main(String[] args) {
        Shape s = new Rectangle(); // Rectangle area method if we use overriding because instatiate and non static
        // Shape area method will be called if we use static context in both methods
        // that is know as method hiding
        double z = s.area();
        System.out.println(z);

    }
}
