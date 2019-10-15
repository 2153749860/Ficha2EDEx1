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

    /**
     * count - variável com o número de elementos na lista head - Node que
     * aponta para o head da lista tail - Node que aponta para a tail da lista
     */
    private Node<T> head;
    private Node<T> tail;
    private int count;

    /**
     * Método construtor que instancia o node head e tail a null e inicializa
     * count a 0 Coloca o Node tail como next de Head
     */
    public LinkedListSentinel() {
        this.head = new Node(null);
        this.tail = new Node(null);
        this.count = 0;
        this.head.setNext(this.tail);
    }

    /**
     *
     * @return número de elementos da lista
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
        Node<T> newNode = new Node<>(element);

        newNode.setNext(this.head.getNext());
        this.head.setNext(newNode);
        this.count++;
    }

    /**
     * Método que remove um elemento da lista
     *
     * @param element - elemento a remover
     * @return valor booleano conforme o sucesso ou insucesso do método
     */
    public boolean remove(T element) {
        boolean found = false;
        Node<T> current = this.head.getNext();
        Node<T> previous = this.head;

        while (current.getElement() != null) {
            if (current.getElement().equals(element)) {
                previous.setNext(current.getNext());
                this.count--;
                return found;
            } else {
                previous = current;
                current = current.getNext();
            }
        }

        return found;
    }

    /**
     * Método que imprime todos os elementos da lista
     */
    public void print() {
        Node<T> current = this.head.getNext();

        while (current != this.tail) {
            System.out.println(current.getElement().toString());
            current = current.getNext();
        }

        System.out.println("Número de elementos na lista: " + this.count);
    }

}
