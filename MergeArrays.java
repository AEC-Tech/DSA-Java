import java.util.*;

public class MergeArrays{
    public static void main(String args[])
    {
        int a[] = {10,12,20,25,30,46,54};
        int b[] = {3,8,11,23,27,35};

        int i, n, m, size, j,k;
        n =a.length;
        m = b.length;
        size = n + m;
        int c[] =new int[size];
        

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Array 1 is ");
        for(i=0;i<n;i++)
        System.out.print(a[i] + "\t");
        System.out.println();
       
        System.out.println("Array 2 is ");
        for(i=0;i<m;i++)
        System.out.print(b[i] +"\t");
        System.out.println();

        i = 0;
        j = 0;
        k = 0;
        while( i < n && j < m)
        {
            if(a[i] < b[j])
            {
                c[k] = a[i];
                i++;
                k++;
            }
            else 
            {
                c[k] = b[j];
                k++;
                j++;
            }
        }

        if(i < n)
        {
            for(;i<n;i++,k++)
                c[k] = a[i];
        }
        else if(j < m)
        {
            for(;j<m;j++,k++)
                c[k] = b[j];
        }
        System.out.println("Merged array is  ");
        for(i=0;i<size;i++)
        System.out.print(c[i] +"\t");
        System.out.println();
    }
}
