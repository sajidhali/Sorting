#include<stdio.h>

int main()
{
   int a[5],n,i,j,count=0,k; 
   printf("Array Size: \n");
   scanf("%d",&n); 
   printf("Enter array elements:\n"); 
   for(i=0;i<n;i++)
   {
     scanf("%d",&a[i]);
    } 
   for(i=0;i<=n-1;i++)
    {
    for(j=i+1;j<n;j++)
    {
     if(a[i] != a[j]){
         count++;
           }
    
   
    }
     }printf("%d\n",count-n);
    
    

}