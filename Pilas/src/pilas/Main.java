/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pilas;


public class Main {
    
    public static void main(String[] args){
        Pilas pila = new Pilas();
        System.out.println("<<-- Ejemplo de Pila -->>\n\n");
        
        pila.apilar(4);
        pila.apilar(16);
        pila.apilar(12);
        pila.apilar(8);
        pila.apilar(65);
        
        System.out.println("<<-- Pila -->>");
        pila.listar();
        
        System.out.println("\n<<-- Tamaño -->");
        System.out.println(pila.getTamanio());
        
        System.out.println("\n<<-- Retirar el elemento del tope de la pila -->>");
        pila.retirar();
        
        pila.listar();
        System.out.println("Tamaño: " + pila.getTamanio());
        
        System.out.println("\n<<-- Actualizar el valor del nodo con el valor 12 por 24 -->>");
        pila.editar(12, 24);
        
        pila.listar();
        System.out.println("Tamaño: " + pila.getTamanio());
        
        System.out.println("\n<<-- Eliminar el nodo con el valor 16 -->>");
        pila.remover(16);
        
        pila.listar();
        System.out.println("Tamaño: " + pila.getTamanio());
        
        System.out.println("\n<<-- Consulta si existe el valor 10 -->>");
	System.out.println(pila.buscar(10));
        System.out.println("\n<<-- Elimina la pila -->>");
	pila.eliminar();
        
        System.out.println("\n<<-- Consulta si la pila esta vacia -->>");
	System.out.println(pila.esVacia());
	//imprimir en pantalla el fin del ejemplo
	System.out.println("\n\n<<-- Fin de ejemplo pila -->>");


    }
    
}
