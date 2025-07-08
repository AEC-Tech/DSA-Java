import java.util.*;

public class LinearSearch {
    public static void main(String args[])
    {
        int a[] = {23,12,45,34,44,50,21,46};
        int n, i, num;
        boolean found = false;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to be searched : ");
        num = sc.nextInt();
        n = a.length;
        for(i = 0; i<n;i++)
        {
            if( a[i] == num)
            {
                System.out.println("Found at position "+i);
                found = true;
                break;
            }
        }
        if (found == false)
        System.out.println("Number not FOUND");
        
    }
}
