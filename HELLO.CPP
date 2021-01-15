#include<iostream>
using namespace std;
struct  Node
{
	int data;
	Node * next;
};
void insert(struct Node *&head,int x)
{
	Node * temp = new Node;
	temp->data = x;
	temp->next = head;
	head = temp;
}
void Display(struct Node * head)
{
	int count = 0;
	Node * curr = head;
	cout<<"Nodes are :: ";
	while(curr!=NULL)
	{
		cout<<(curr->data)<<" ";
		curr = curr->next;
		count++;
	}
	cout<<endl;
	cout<<"Number of Nodes  :: "<<count<<endl;
}
int main()
{
	int n,x;
    Node * head = NULL;
    cout<<"Enter Nodes You want to Insert ";
    cin>>n;
    for (int i = 0; i < n; ++i)
    {
    	cin>>x;
    	insert(head,x);
    	Display(head);    }
}