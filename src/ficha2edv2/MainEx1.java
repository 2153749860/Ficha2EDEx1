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
public class MainEx1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         //instancia que vao ser usadas para testar
        Pessoa pessoa1 = new Pessoa("Tiago", 20);
        Pessoa pessoa2 = new Pessoa("Vitor", 21);
        Pessoa pessoa3 = new Pessoa("Carlos", 21);
        Pessoa pessoa4 = new Pessoa("Joao", 21);
        
        //instanciaçao de uma lista
        LinkedList<Pessoa> lista = new LinkedList<>();
        
        // teste de adicionar pessoas
        lista.add(pessoa1);
        lista.add(pessoa2);
        lista.add(pessoa3);
        System.out.println("Teste de adicionar pessoas:");
        lista.print();
        
        //teste remover uma instancia nao existente na lista
        System.out.println("\nTeste remover uma instancia nao existente na lista, deve dar return false :"+lista.remove(pessoa4));
        
        // teste de remover o head
        System.out.println("\nTeste para remover o head, deve dar return true: "+lista.remove(pessoa3));
        lista.print();
       
       // teste para remover o tail
       System.out.println("\nTeste para remover o tail, deve dar return true: "+lista.remove(pessoa1));
       lista.print();
       
       
       //teste para remover quando so existe um elemento na lista
        System.out.println("\nTeste para remover quando so existe um elemento na lista, deve dar return true: "+lista.remove(pessoa2));
        lista.print();
        
    }
    
    
}
