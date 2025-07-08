import java.util.*;

public class InsertionArray {
    public static void main(String args[])
    {
        int a[] = {3,12,15,24,34,45,51,56,67,89,90,0,0,0,0};
        int max, n=11, num, pos;
        max = a.length;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to be inserted : ");
        num = sc.nextInt();
        System.out.println("Enter the position where number is to be inserted : ");
        pos = sc.nextInt();
        
        if( n == max)
            System.out.println("Array is Full");
        else
        {
            for(int i = n; i>pos; i--)
                a[i+1] = a[i];
            a[pos-1] = num;
            n++;
        }
        System.out.println("Array After Insertion is ");
        for(int i=0;i<n;i++)
        System.out.println(a[i]);
    }
}
