/**
 * Task_1
 */
public class Task_1 {

    public static void main(String[] args) {
        System.out.println(sum(1000));
    }
    
    public static int sum(int n) {
        if(n == 1) return 1; // base step
        return n + sum(n - 1); // recursive step  10 + sum(9) = 9 + sum(8)....
    
    
    }
    
}


        
    