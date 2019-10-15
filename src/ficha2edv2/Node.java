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
public class Node<T> {

    /**
     * next - variável do tipo Node que aponta para o seguinte Node da lista
     * element - vaiável do tipo genérico T que aponta para um elemento
     */
    private Node<T> next;
    private T element;

    /**
     * Método contrutor que inicializa o next a null e coloca element a apontar
     * para o elemento que recebe
     *
     * @param element - elemento apontado
     */
    public Node(T element) {
        this.element = element;
        this.next = null;
    }

    /**
     *
     * @return apontado de next
     */
    public Node<T> getNext() {
        return next;
    }

    /**
     *
     * @param next - aponta para um novo Node
     */
    public void setNext(Node<T> next) {
        this.next = next;
    }

    /**
     *
     * @return elemento apontado
     */
    public T getElement() {
        return element;
    }

}
