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
        // TODO code application logic here
                
        Pessoa pessoa1 = new Pessoa("Tiago", 20);
        Pessoa pessoa2 = new Pessoa("Vitor", 21);
        Pessoa pessoa3 = new Pessoa("Carlos", 21);
        Pessoa pessoa4 = new Pessoa("Joao", 21);
        
        LinkedList<Pessoa> lista = new LinkedList<>();
        
        //Teste remover Pessoa de lista vazia
        /*
        lista.remove(pessoa1);
        */
        
        //Adição de Pessoas
        lista.add(pessoa1);
        lista.add(pessoa2);
        lista.add(pessoa3);
        lista.add(pessoa4);
        
        lista.print();
        System.out.println("");
        
        //teste remover uma Pessoa
        lista.remove(pessoa4);
        
        lista.print();
        System.out.println("");
        
        lista.remove(pessoa3);
        
        lista.print();
        
    }
    
    
}
