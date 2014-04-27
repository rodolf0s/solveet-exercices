import java.util.Scanner;

class GenerateOddDouble {
    public static void main(String[] args) {
        int n1 = 0;
        int n2 = 0;
        int j = 0;
        
        Scanner in = new Scanner(System.in);
        
        do {
            System.out.print("Enter a positive integer: ");
            n1 = in.nextInt();
        } while(n1 < 0);
        
        do {
            System.out.print("Enter a integer greater: ");
            n2 = in.nextInt();
        } while (n2 <= n1);
        
        for (int i = n1; i + i <= n2 * 2; i++) {
            if (i % 2 != 0) {
                System.out.printf(" %d", i + i);
                j++;
            } 
        }
        
        System.out.println();
    }
}