#include <stdio.h>
#include <stdlib.h>

int main()
{
   /* int size = 10;
    int arr [size];
    printf("enter the value of array to 10");
    scanf("%d",arr[size]);*/
    int arr []={5,4,8,9,6,2,3,7,1,8,4,6};
    int j ,i ,s ;
    for( j=1 ; j<13 ; ++i)
    {
    for( i=0 ; i<13 ; ++i)
    {
        if (arr[j]<arr[i])
        {
            int z;
            z=arr[j];
            arr[j]=arr[i];
            arr[i]=z;
        }
    }
    }
    for (s=0; s < 13 ; ++s )
    {
        printf("%d",arr[s]);
    }

    return 0;
}
