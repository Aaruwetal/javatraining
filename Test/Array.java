//3.write a program that take 5 numbers into array and print square value of each number.
import java.util.*;
class array{
public static void main(String args[]){
int[] temp={0,1,2,3,4};
for (int value : temp)
{
System .out.println(value);
}
for(int i=0;i<temp.length;i++)
{
temp[i] = (int) Math.pow(temp[i],2);
}
for (int value :temp)
{
System.out.println(value);

}

}
}
