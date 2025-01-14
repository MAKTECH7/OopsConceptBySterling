public class ArithmeticTest{
public static void add(int... arr){

int size = arr.length;
int sum =0;
for(int i = 0;i<size;i++){
//internally working as array

int  sum = sum+arr[i];
 }

}

public static void main(String[] args){
int[] abc = {1,2,3,6,56,56,2,2};
add(abc);
}

}