/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author CORE
 */
public class D extends A {
    private B b;
    public D(int x, int y, int z) {
        super(x, z); 
        this.b = new B(y, z); 
    }
    public void incrementaXYZ() {
        incrementaZ();
        b.incrementaZ(); 
    }
    public void mostrarValores() {
        System.out.println("Valor de x: " + super.getZ());
        System.out.println("Valor de y: " + b.getZ()); 
    }
}
