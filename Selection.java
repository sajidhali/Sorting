//Selection Sort
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
        Selection(a);
        for(int l=0;l<n;l++)
        {
          System.out.print(a[l]+" ");
        }
  }
public static int Selection(int a[])
{   int n=a.length,i,j;
    for(i=0;i<(n-1);i++)
    {   int b=i;
        for(j=i+1;j<n;j++)
        {  
            if (a[b]>a[j])
            { b=j;}
            if (b!=i){
                int temp=a[i];
                a[i]=a[b];
                a[b]=temp;
            }
        }
    }
    return 1;
}
}