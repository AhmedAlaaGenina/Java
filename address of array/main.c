#include <stdio.h>
#include <stdlib.h>
#define Size 5
int main()
{
    int a[Size];
    printf(" array    = %p \n array[0] = %p \n array    = %p",a,&a[0],&a);

    return 0;
}
