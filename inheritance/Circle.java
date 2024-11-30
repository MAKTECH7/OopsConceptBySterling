public class Circle extends Shape{

private int radius = 0;

public void setRadius(int radius){
this.radius = radius;
}
public int getRadius(){
return radius;
}

public double area(){
return Math.PI*Math.pow(radius,2);
}
}