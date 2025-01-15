/*

Uses of polymorphism
-> there are 3 uses of polymorphism

1-> polymorphism in array 
2-> polymorphism in method arguments
3-> polymorphism in method return type 


Object have 3 component 
identity(address)
state (variables and attribute)
behavior (Methods)
*/

public class UseOfPoymorphism {
  public static void main(String[] args) {
    Shape[] arr = new Shape[3];
    arr[0] = new Circle();
    arr[1] = new Triangle(); // Example of Polymorphism in Array
    arr[2] = new Rectangle();
    double CompleteArea = TotalArea(arr);
    System.out.println(CompleteArea + " Total Area ");
    Shape s = new Circle();
    Shape s1 = new Rectangle();
    Shape s2 = new Triangle();
    System.out.println(s.area() + " Circle area");
    System.out.println(s1.area() + " Rectangle area");
    System.out.println(s2.area() + " Triangle area");

    ///////////
    Shape ss = getShape(1); // if i is equal to 1 then they can hold the object of Circle
    Shape ss2 = getShape(2);
    Shape ss3 = getShape(3);
    Shape ss4 = getShape(4);
    System.out.println(ss);
    System.out.println(ss2);
    System.out.println(ss3);
    System.out.println(ss4);

  }

  public static double TotalArea(Shape[] abc) {
    int size = abc.length;
    double ta = 0.0;
    for (int i = 0; i < size; i++) { // 2nd use Polymorphism in method
      ta = ta + abc[i].area();
    }
    return ta;
  }

  public static Shape getShape(int i) { // 3rd use Of Polymorphism which is
    // polymorphism in method return type
    if (i == 1)
      return new Circle();
    if (i == 2)
      return new Triangle();
    if (i == 3)
      return new Rectangle();

    return null;
  }

}