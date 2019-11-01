#include <stdio.h>
#include <stdlib.h>
#define SIZE 10
int find (int array [SIZE], int key)
{
    int i;
    int index;
    for(i=0;i<SIZE;i++)
    {

        if(array[i]==key)
        {
            index = i+1;
            break;
        }
    }
    return index;
}

int main()
{
   int arr[SIZE]={1,5,6,3,4,7,8,2,9,0};
   int a = find(arr,2);
   printf("%d",a);

    return 0;
}
