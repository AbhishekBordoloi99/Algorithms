#include <stdio.h>

int main(void) {
	struct node
	{
	    int data;
	    struct node* next;
	};

	struct node *head=NULL, *newnode=NULL, *temp=NULL;
	//head=(struct node*)malloc(sizeof(struct node));
	//temp=(struct node*)malloc(sizeof(struct node));
	int choice=1;
	while(choice)
	{

	    newnode=(struct node*)malloc(sizeof(struct node));
	    //printf("Enter data");
	    scanf(" %d", &newnode->data);

	    if(head==0)
	    {
	        head=newnode;
	        temp=newnode;
	    }
	    else
	    {
	        temp->next = newnode;
	        temp=newnode;
	    }
	    //printf("Press 1 to continue");
	    scanf("%d", &choice);
	}


  temp=head;
	while(temp!=NULL)
	{
		printf("%d",temp->data);
		temp=temp->next;
	}

	return 0;
}
