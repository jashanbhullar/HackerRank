/*
  Reverse a linked list and return pointer to the head
  The input list will have at least one element  
  Node is defined as  
  class Node {
     int data;
     Node next;
  }
*/
    // This is a "method-only" submission. 
    // You only need to complete this method. 
Node Reverse(Node head) {
   Node newHead = null;
   while(head != null){
       Node node = new Node();
       node.data = head.data;
       node.next = newHead;
       newHead = node;
       head = head.next;
   }
   return newHead;

}
