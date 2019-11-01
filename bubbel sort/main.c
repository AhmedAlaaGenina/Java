#include <stdio.h>
#include <stdlib.h>
#define SIZE 10

void sort (int array[])
{
    int i , j ;
    for(i=0;i<SIZE;i++)
    {
        for(j=0;j<SIZE-1;j++)
        {
            int temp;
            if(array[i]>array[j])
            {
            temp =array[i];
            array[i]=array[j];
            array[j]=temp;
            }
        }
    }
}


int main()
{
    int a [SIZE] ={9,2,7,3,1,6,5,8,0,11};
    sort(a);
   int i;
   for(i = 0; i < SIZE ; i++) {
      printf("%d ",a[i]);
   }
    return 0;
}
