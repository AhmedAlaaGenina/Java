#include <stdio.h>
#include <stdlib.h>

int main()
{
    int num1,num2,num3;
    printf("enter the first number");
    scanf("%d",&num1);
    printf("enter the second number");
    scanf("%d",&num2);
    num3=num1;
    num1=num2;
    num2=num3;
    printf("%d\n%d",num1,num2);
    return 0;
}
