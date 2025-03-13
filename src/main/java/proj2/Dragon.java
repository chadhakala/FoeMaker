/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proj2;

/**
 *
 * @author papaollie
 */
public class Dragon extends Enemy {
    
    private String grunt;
    public int height;
    
    public Dragon() {
    super();
    attack();
    System.out.println("RAWR!");
    
    }
    

  
    @Override
    public String toString() {
        return grunt;
    }

    public abstract void attack();
}
