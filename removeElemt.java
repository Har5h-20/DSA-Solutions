public class removeElemt{
    public static int remove(int num[],int val){
        int n = 0;
        for(int i = 0;i<num.length;i++){
            if(num[i] != val){
                num[n] = num[i];
                n++;
            }
        }
        return n;
    }
    public static void main(String[] args) {
        int num[] = {3, 2, 2, 3};
        int val = 3;
        int result = remove(num, val);
        System.out.println("Output: " + result);
        System.out.print("nums = [");
        for (int i = 0; i < result; i++) {
            System.out.print(num[i]);
            if (i < result - 1) {
                System.out.print(",");
            }
        }
        System.out.println("]");
    }
}