import java.util.*;

public class DeleteArray {
    public static void main(String args[])
    {
        int a[] = {3,12,15,24,34,45,51,56,67,89,90};
        int max, n=11, num, pos;
        max = a.length;

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the position of number to be deleted : ");
        pos = sc.nextInt();
        
        if( n == 0)
            System.out.println("Array is Empty");
        else if(pos < 1 || pos > n)
            System.out.println("Invalid Position");
        else
        {
            for(int i = pos-1; i<n-1; i++)
                a[i] = a[i+1];
            a[n-1] = 0;
            n--;
        }
        System.out.println("Array After Insertion is ");
        for(int i=0;i<n;i++)
        System.out.println(a[i]);
    }
}
