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

    public void attack() {
        System.out.println("RAWR!");
    }
   double heightNotInt = 7.5 + (int)(Math.random() * (20 - 7.5 + 1));
   int height = (int)heightNotInt;
   double weightNotInt = 100 + (int)(Math.random() * (150 - 100 + 1));
   int weight = (int)weightNotInt;
    

    public Dragon(int height, int weight) {
      
        this.weight = weight;
    }
    public void getDragon(int height) {
        
double heightNotInt = 7.5 + (double)(Math.random() * (20 - 7.5 + 1));
        
        
        
    }

    @Override
    public String toString() {
        return grunt;
    }

    public abstract void attack();
}
