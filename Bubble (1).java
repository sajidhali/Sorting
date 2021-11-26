//Bubble Sort
import java.util.*;
public class Main {
  public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        System.out.println("Enter Array length:");
        int n =s.nextInt();
        int a[] =new int[n];
        for (int k=0;k<n;k++){
            a[k]=s.nextInt();
        }
        bubble(a);
        for(int l=0;l<n;l++)
        {
          System.out.print(a[l]+" ");
        }
  }
public static int bubble(int a[])
{   int n=a.length,i,j;
    for(i=n-1;i>=0;i--)
    {
        for(j=0;j<=(i-1);j++)
        {
            if (a[j]>a[j+1])
            {
                int temp=a[j];
                a[j]=a[j+1];
                a[j+1]=temp;
            }
        }
    }
    return 1;
}
}