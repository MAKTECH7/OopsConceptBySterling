public class MethodOverloading{  //Static or non static method both overloaded

/*Methods having same name but different no. of args, or different type of arguments or different order of arguments in a same class(zroori nhi ) is known as method overloading
*/


public void add(int a, int b){
int sum = a+b;
System.out.println(sum);
}

public void add(int a, int b, int c)
{
int sum = a+b+c;
System.out.println(sum);
}

public void add(int a, int b, int c, int d){
int sum = a+b+c+d;
System.out.println(sum);
}

public void add(int a, int b, int c, int d, int e){
int sum = a+b+c+d+e;
System.out.println(sum);
}

public void add(double a, int b){

}
public void add(int a, double b){

}

public static void main (String[] args){
MethodOverloading MOL = new MethodOverloading();
MOL.add(20,30);
MOL.add(10,30,40);

}

}