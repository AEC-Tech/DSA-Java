import java.util.*;

public class Sum_Avg_Array {
    public static void main(String args[])
    {
        int n, i, sum=0;
        float avg;
        int a[];
        Scanner sc = new Scanner(System.in);
        System.out.println("How many numbers are there : ");
        n = sc.nextInt();
        a = new int[n];
        for(i = 0; i<n;i++)
        {
            System.out.println("Enter Number "+(i+1)+" : ");
            a[i] = sc.nextInt();
        }
        System.out.println("Numbers are : ");
        for(i = 0; i<n;i++)
        {
            System.out.println(a[i]);
            sum += a[i];
        }
        System.out.println("Total is "+ sum);
        avg = (float)sum / n;
        System.out.println("Average is "+ avg);
    }
}
