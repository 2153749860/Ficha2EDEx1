/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ficha2edv2;

/**
 *
 * @author tiago
 */
public class LinkedListSentinel<T> {

    private Node<T> head;
    private Node<T> tail;
    private int count;

    public LinkedListSentinel() {
        this.head = new Node();
        this.tail = new Node();
        this.count = 0;
        this.head.setNext(this.tail);
    }

    public Node<T> getHead() {
        return head;
    }

    public void setHead(Node<T> head) {
        this.head = head;
    }

    public Node<T> getTail() {
        return tail;
    }

    public void setTail(Node<T> tail) {
        this.tail = tail;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void add(T element) {
        Node<T> newNode = new Node<>(element);

        newNode.setNext(this.head.getNext());
        this.head.setNext(newNode);
        this.count++;
    }
    
    public void remove(T element){
        Node<T> current = new Node<>();
        Node<T> previous = new Node<>();
        
        current = this.head.getNext();
        previous = this.head;
        
        for(int i=0; i<this.count; i++){
            if(current.getElement().equals(element)){
                previous.setNext(current.getNext());
                this.count--;
                break;
            }
            else{
                previous = current;
                current = current.getNext();
            }
        }
    }

    public void print() {
        Node<T> current = new Node<>();
        current = this.head;

        for (int i = 0; i < this.count+2; i++) {
            if (current.getElement() == null) {
                System.out.println("Null");
            } else {
                System.out.println(current.getElement().toString());
            }
            current = current.getNext();
        }
    }

}
