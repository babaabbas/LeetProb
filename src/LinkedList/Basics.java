package LinkedList;


class linked_list{
    static node head;

    public static void insert(int data){
        node newnode=new node(data);
        if(head==null){
            head=newnode;
            return;
        }
        node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newnode;
    }
    public static void print(){
        node temp=head;
        while(temp!=null){
            System.out.print(temp.val+" -> ");
            temp=temp.next;
        }
    }
}


class node{
    int val;
    node next;
    node(){}
    node(int value){
        this.val=value;
    }
    node(int value,node next){
        this.val=val;
        this.next=next;
    }
}
class real{
    public static void main(String[] args){
        linked_list cool=new linked_list();
        cool.insert(2);
        cool.insert(3);
        cool.insert(6);
        cool.insert(4);
        cool.insert(8);
        cool.print();

    }
}
