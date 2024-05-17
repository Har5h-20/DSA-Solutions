import java.util.Scanner;
public class LARGEST {
    public static int GetLargest(int number[]){
        int largest = Integer.MIN_VALUE;

        for(int i = 0; i<number.length; i++){
            if(number[i] > largest){
                largest = number[i];
            }
        }
        return largest;
    }
    public static void main(String [] args){
        int number [] = {3,5,1,6,4,8,3,9,2,1};
        System.out.println("LARGEST NUMBER IS : " + GetLargest(number));
    }
}
