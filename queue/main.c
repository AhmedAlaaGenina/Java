#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include <stdbool.h>
#define maxsize 6
int queue [maxsize];
int front= 0;
int rear= -1;
int peek()
{
    return queue[front];
}

int full()
{
    if(rear==maxsize-1)
    {
      return 1;
    }
    else
    {
        return 0;
    }

}

int empty ()
{
    if (front<0||front > rear)
    {
        return 1;
    }
    else
    {
        return 0;
    }

}

int enqueue (int data)
{
    if (!full())
    {
        rear =rear +1;
        queue[rear]=data;
    }
    else
    {
        return 0;
    }
    return 1;

}

int dequeue()
{
    int data;
    if(!empty())
    {

        data = queue[front];
        front = front+1;

    }
    else
    {
        return 1;
    }
    return data;

}


int main()
{
    enqueue(3);
    enqueue(5);
    enqueue(8);
    enqueue(1);
    enqueue(6);
    enqueue(7);

    if (full())
    {
        printf("is full\n");
    }
     else
    {
        printf("not full\n");
    }

    int num =dequeue();
    printf("Element removed: %d\n",num);
    printf("Element at front: %d\n",peek());
     while(!empty()) {
      int n = dequeue();
      printf("%d\n ",n);
   }
    if (full())
    {
        printf("full\n");
    }
    else
    {
        printf("not full\n");
    }
    return 0;
}
