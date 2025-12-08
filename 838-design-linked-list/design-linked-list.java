class MyLinkedList {
    //Creation of new node 
    private class Node{
        int val;
        Node next;
        Node(int val){
            this.val=val;
            this.next=null;
        }
    }

    private Node head;
    private int size;
    public MyLinkedList() {
        head=null;
        size=0;
    }
    //How to get value of the element at particular index 
    public int get(int index) {
        if(index<0 || index>=size){
            return -1;
        }
        Node curr = head;
        for(int i=0;i<index;i++){
            curr=curr.next;
        }
        return curr.val;
    }
    //How to add new node at HEAD
    public void addAtHead(int val) {
        Node newNode = new Node(val);
        newNode.next=head;
        head=newNode;
        size++;
    }
    //How to add a new node at TAIL
    public void addAtTail(int val) {
        Node newNode = new Node(val);
        if(head==null){
            head=newNode;
        }
        else{
            Node curr = head;
            while(curr.next!=null){
                curr=curr.next;
            }
            curr.next=newNode;
        }
        size++;
    }
    //How to add a new node at particular index
    public void addAtIndex(int index, int val) {
        if(index<0 || index>size) return;
        if(index==0) addAtHead(val);
        else if(index==size) addAtTail(val);
        else{
            Node newNode = new Node(val);
            Node curr = head;
            for(int i=0;i<index-1;i++){
                curr=curr.next;
            }
            newNode.next=curr.next;
            curr.next=newNode;
            size++;
        }
    }
    //How to delete a new node at particular index 
    public void deleteAtIndex(int index) {
        if(index<0 || index>=size) return;
        if(index==0) head=head.next;
        else{
            Node curr=head;
            for(int i=0;i<index-1;i++){
                curr=curr.next;
            }
            curr.next=curr.next.next;
        }
        size--;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */