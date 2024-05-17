import java.util.*;

public class Update {
    public static void update(int marks[]){
      for(int i = 0; i<marks.length;i++){
        marks[i] = marks[i] + 2;
      }
    }
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        int marks[] = {1,4,5,8};
        for(int i = 0; i <marks.length;i++){
            System.out.print( marks[i]+ " ");
        }
        update(marks);
        System.out.println("\nUpdated marks:");
        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i] + " ");
        }
    }
}
