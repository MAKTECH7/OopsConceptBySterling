public class TestShape{
 public static void main(String[] args){

Shape s = new Shape();

s.setBorderWidth(99);
s.setColor("Black");

int bw = s.getBorderWidth();
String col = s.getColor();

System.out.println(bw);
System.out.println(col);

Shape s1 = new Shape();

s1.setBorderWidth(100);
s1.setColor("Blue");

int bw1 = s1.getBorderWidth();
String col2 = s1.getColor();

System.out.println(bw1);
System.out.println(col2);
}
}