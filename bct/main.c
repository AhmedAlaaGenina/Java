#include <stdio.h>
#include <stdlib.h>
struct node
{
    int data;
    struct node *rightchild;
    struct node *liftchild;
};
struct node *root=NULL;

void insert (int data)
{
    struct node *temp=(struct node*)malloc(sizeof(struct node));
    temp->data=data;
    struct node *current;
    struct node *parrent;


    if (root==NULL)
    {
        root=temp;
    }
    else
    {
        current=root;
        parrent=NULL;

        while(1)
        {
           parrent=current;

           if(data<current->data)
           {
               current=current->liftchild;

               if (current==NULL)
               {
                   parrent->liftchild=temp;
               }
               return;
           }
           else
           {
             current=current->liftchild;

             if(current==NULL)
             {
                  parrent->rightchild=temp;
             }
             return;
           }

        }
    }
}

struct node *search(int data)
{
    struct node *temp=root;

    while(data!=temp->data)
    {
        if(temp!=NULL)
        {
            if (data<temp->data)
            {
                temp=temp->liftchild;

            }

            if (data>temp->data)
            {
                temp=temp->rightchild;
            }
            if(temp == NULL) {
         return NULL;
            }
        }
    }
return temp;
}

void preorder(struct node *root)
{
    printf("%d",root->data);
    preorder(root->liftchild);
    preorder(root->rightchild);
}

void inorder(struct node *root)
{

    preorder(root->liftchild);
    printf("%d",root->data);
    preorder(root->rightchild);
}

void postorder(struct node *root)
{

    preorder(root->liftchild);
    preorder(root->rightchild);
    printf("%d",root->data);
}

int main()
{
     int i;
   int array[7] = { 27, 14, 35, 10, 19, 31, 42 };

   for(i = 0; i < 7; i++)
      insert(array[i]);

   i = 31;
   struct node * temp = search(i);

   if(temp != NULL) {
      printf("[%d] Element found.", temp->data);
      printf("\n");
   }else {
      printf("[ x ] Element not found (%d).\n", i);
   }

   i = 15;
   temp = search(i);

   if(temp != NULL) {
      printf("[%d] Element found.", temp->data);
      printf("\n");
   }else {
      printf("[ x ] Element not found (%d).\n", i);
   }

   printf("\nPreorder traversal: ");
   preorder(root);

   printf("\nInorder traversal: ");
   inorder(root);

   printf("\nPost order traversal: ");
   postorder(root);

   return 0;
}

