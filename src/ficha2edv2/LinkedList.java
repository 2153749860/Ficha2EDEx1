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
public class LinkedList<T> {
    private int count;

    private Node<T> head;
    private Node<T> tail;

    public LinkedList() {
        this.count = 0;
        this.head = null;
        this.tail = null;
    }

    public int getCount() {
        return count;
    }

    public void add(T element) {
        Node<T> newNode = new Node<T>(element);

        if (this.count == 0) {
            this.head = newNode;
            this.tail = newNode;
        } else {
            newNode.setNext(this.head);
            this.head = newNode;
        }
        this.count++;
    }

    public boolean remove(T element) {
        boolean found = false;
        
        //entra quando a lista está vazia
        if (this.count == 0) {
            return found;
        }
        
        Node<T> previous = null;
        Node<T> current = this.head;

        while (current != null && !found) {
            if (current.getElement().equals(element)) {
                found = true;
            } else {
                previous = current;
                current = current.getNext();
            }
        }

        if (found) {
            if (previous == null) {
                if (this.count == 1) {
                    this.tail = null;
                }
                this.head = current.getNext();
            } else {
                previous.setNext(current.getNext());
            }
            if (current.equals(this.tail)) {
                this.tail = previous;
            }
            this.count--;
            return found;
        } 
        //entra quando o elemento a eliminar nao existe
        else {
            return found;
        }

    }
    
    public void print() {
        Node<T> current = this.head;

        while (current != null) {
            System.out.println(current.getElement().toString());
            current = current.getNext();
        }

        System.out.println("");

        if (this.head != null) {
            System.out.println(this.head.getElement().toString());
        }
        if (this.tail != null) {
            System.out.println(this.tail.getElement().toString());
        }
    }
}
