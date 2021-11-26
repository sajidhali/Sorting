int main()
{
    int a[10],n,i,j,k,count,m;
    scanf("%d",&n); 
    printf("Enter array elements :");
    for(m=0;m<n;m++)
    {   scanf("%d",&a[m]);
    }
       for(i=0;i<n;i++) 
        { if(a[i] == -1)
             continue;
          else{
              k = a[i]; 
              count=0;
              printf("%d\n",k); 
              for(j=i+1;j<n;j++)
                 { if(k == a[j])
                     count +=1; 
                     a[j] = -1; }
              printf("%d",count);}
               
         
        }}