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
        this.head = new Node(null);
        this.tail = new Node(null);
        this.count = 0;
        this.head.setNext(this.tail);
    }

    public int getCount() {
        return count;
    }

    public void add(T element) {
        Node<T> newNode = new Node<>(element);

        newNode.setNext(this.head.getNext());
        this.head.setNext(newNode);
        this.count++;
    }

    public boolean remove(T element){
        boolean found = false;
        Node<T> current = this.head.getNext();
        Node<T> previous = this.head;
        
        while(current.getElement() == null){
            if(current.getElement().equals(element)){
                previous.setNext(current.getNext());
                this.count--;
                return true;
            }
            else{
                previous = current;
                current = current.getNext();
            }
        }
        
        return false;
    }

    public void print() {
        Node<T> current = this.head.getNext();
        
        
        while(current!=this.tail){
            System.out.println(current.getElement().toString());
            current = current.getNext();
        }
    }

}
