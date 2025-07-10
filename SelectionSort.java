import java.util.*;

public class SelectionSort {
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
            for(j =i+1; j<n; j++)
            {
                if(a[i] > a[j])
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println("Array After Sorting is ");
        for(i=0;i<n;i++)
        System.out.print(a[i] +"\t");
    }
}
