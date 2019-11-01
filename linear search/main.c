#include <stdio.h>
#include <stdlib.h>
#define SIZE 5
int main()
{
    int arr [SIZE];
    int i;
    for (i=0;i<SIZE;i++)
    {
     printf("enter the value of array [%d]",i);
     scanf("%d",&arr[i]);
    }
    printf("enter the key search");
    int keysearch;
    scanf("%d",&keysearch);
    int index = search( arr,keysearch,SIZE);

    if (index != -1 )
    {
        printf("found in ");
    }


    return 0;
}
int search ( int array [],int key ,int size)
{
      int i;
    for (i=0;i<SIZE;++i)
    {
        if (key==array[i])
        {
            return i ;
        }


    }
    return -1;
}
