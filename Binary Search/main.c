#include <stdio.h>
#include <stdlib.h>
#define SIZE 10

int find(const int array[],int key)
{
    int index =-1;
    int low = 0;
    int high = SIZE -1;
    while(low<=high)
    {

        int mid = low +(high-low)/2;
        if(array [mid]==key)
        {
            mid=index;

        }
       else if(array [mid]<key)
        {
            low = mid+1;


        }
        else
        {
            high = mid-1;

        }

    }
    return index;
}

int main()
{
    int ar[SIZE]={1,5,7,8,9,13,16,17,20,22};
    int a=17;
   int result = find(ar[SIZE],a);

   if (result != -1){
        printf("\n found at index \n");
    }
    else{
        printf("\n not found\n");
    }

    return 0;
}
