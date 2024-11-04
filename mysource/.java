class CLNode
{
int element;
CLNode next;
CLNode(int evalue, CLNode nvalue){
element=evalue;
next=nvalue;
}

void MakeEmpty(){

    CLNode location=listData;
    while (listData.next != listData)
    {
    location = listData.next;
    listData.next=location.next;
    delete location;
    
    }
    if(listData.next==listData){
    
    location=listData;
    listData=NULL;
    delete location;
    
    }
    class CircularLinkedList
{
CLNode listData;
public:
CircularLinkedList ();
~CircularLinkedList ();
bool IsEmpty() ;
void MakeEmpty();
void InsertItem (Data item);
bool FindItem(Data key);
void DeleteItem(Data item);
void Print();
};
CircularLinkedList::CircularLinkedList()
{
listData= NULL;
}
CircularLinkedList::~CircularLinkedList(){

    MakeEmpty();
    
    }