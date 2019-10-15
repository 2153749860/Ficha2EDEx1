/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ficha2edv2;

/**
 *
 * @author tiago Classe que representa uma Lista ligada
 */
public class LinkedList<T> {

    /**
     * count - variável com o número de elementos na lista head - Node que
     * aponta para o head da lista tail - Node que aponta para a tail da lista
     */
    private int count;
    private Node<T> head;
    private Node<T> tail;

    /**
     * Método construtor inicializa o count a 0 e head e tail a null
     */
    public LinkedList() {
        this.count = 0;
        this.head = null;
        this.tail = null;
    }

    /**
     *
     * @return o número de elementos na lista
     */
    public int getCount() {
        return count;
    }

    /**
     * Método que adiciona um elemento na lista
     *
     * @param element - elemento a adicionar na lista
     */
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

    /**
     * Método que remove um elemento da lista
     *
     * @param element - elemento a remover da lista
     * @return valor booleano conforme o sucesso e o insucesso do método
     */
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
        } //entra quando o elemento a eliminar nao existe
        else {
            return found;
        }

    }

    /**
     * Método que imprime todos os elementos da lista
     */
    public void print() {
        Node<T> current = this.head;

        while (current != null) {
            System.out.println(current.getElement().toString());
            current = current.getNext();
        }

        System.out.println("Número de elemntos na lista: " + this.count);

        if (this.head != null) {
            System.out.println("Head: " + this.head.getElement().toString());
        }
        if (this.tail != null) {
            System.out.println("Tail: " + this.tail.getElement().toString());
        }
    }
}
