import java.util.*;

public class BinarySearch {
    public static void main(String args[])
    {
        int a[] = {3,12,15,24,34,45,51,56,67,89,90};
        int beg, end, num, mid;
        boolean found = false;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to be searched : ");
        num = sc.nextInt();
        beg = 0;
        end = a.length-1;
        
        while( beg <= end)
        {
            mid = (beg + end) /2;
            if( a[mid] == num)
            {
                System.out.println("Found at position "+mid);
                found = true;
                break;
            }
            else if(num > a[mid])
            {
                beg = mid + 1;
            }
            else if(num < a[mid])
            {
                end = mid - 1;
            }
        }
        if (found == false)
        System.out.println("Number not FOUND");
        
    }
}
