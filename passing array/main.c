#include <stdio.h>
#include <stdlib.h>
#define Size 5
int main()
{
    int arr [Size]={1,2,3,4,5};
    printf (" Passing By ref \n");
    multi_x_2(arr, Size);
    int i;
    for ( i=0;i<Size ;++i )
    {
        printf ("%d \n",arr[i]);
    }
    printf (" passing By value \n");
    int q = elment_x_2 (arr[2]);
    printf ("%d",q);
    return 0;
}

 void multi_x_2( int array[],int s)
{
    int i;
    for ( i=0; i<s;++i)
        {
            array[i]*=2;
        }
}
elment_x_2 (int x)
{
    int z =x*2;
    return z;
}

