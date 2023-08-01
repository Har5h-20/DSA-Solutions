import java.util.*;
public class test{
    public static int binarySearch(int number[], int key){
        int start = 0 , end = number.length - 1;
        while(start <= end){
            int mid = (start + end) / 2;
            if(number[mid] == key){
                return mid;
            }
            if(number[mid] > key){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return -1;
    }
    public static void main(String [] args){
        int number[] = {11,22,33,44,55,66,74,88,99};
        int key = 22;
    System.out.println(binarySearch(number,key));
}
    
}