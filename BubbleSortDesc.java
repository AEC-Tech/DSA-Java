import java.util.*;

public class BubbleSortDesc {
    public static void main(String args[])
    {
        int a[] = {43,12,65,24,74,45,5,56,7,19,90};
        int i, n, temp, j;
        n =a.length;
        

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Array Before Sorting is ");
        for(i=0;i<n;i++)
        System.out.print(a[i] + "\t");
        System.out.println();
        
        for(i = 0; i<n-1;i++)
        {
            for(j = 0 ; j < n-1-i; j++)
            {
                if(a[j] < a[j+1])
                {
                    temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
        System.out.println("Array After Sorting is ");
        for(i=0;i<n;i++)
        System.out.print(a[i] +"\t");
    }
}
