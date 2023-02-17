/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package colas;

/**
 *
 * @author HP
 */
public class Nodo {
    
    private int dato;
    private Nodo next;
    
    public Nodo(int dato){
        this.dato=dato;
    }
    
    public int getDato(){
        return dato;
    }
    
    public void setDato(int dato){
        this. dato = dato;
    }
    
    public Nodo getNext(){
        return next;
    }
    
    public void setNext(Nodo next){
        this.next = next;
    }
    
    public String toString(){
        String s=" "+dato+" ";
        return s;
    }
    
}
