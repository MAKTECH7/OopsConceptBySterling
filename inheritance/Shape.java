public class Shape{
private int borderWidth = 0;
private String color = "neela";

public void setBorderWidth(int borderWidth){
this.borderWidth = borderWidth;
}

public void SetColor(String color){
this.color = color;
}

public int getBorderWidth(){
//System.out.println("HAHAH");

return borderWidth;
}
public String getColor(){
return color;
}

}