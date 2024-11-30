public class Triangle extends Shape{
private int base = 4;
private int height = 5;

public void setBase(int base){
this.base  = base;
}

public void setHeight(int height){
this.height = height;
}

public int getBase(){

return base;
}

public int getHeight(){
return height;
}

public double area(){
return 0.5*base*height;
}



}