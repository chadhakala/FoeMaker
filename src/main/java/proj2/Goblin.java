/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proj2;

/**
 *
 * @author papaollie
 */
public class Goblin extends Enemy {

    public void attack() {
        System.out.println("Gurgle!");
    }
   
    public String grunt;

   double heightNotInt = 70 + (int)(Math.random() * (70 - 100 + 1));
   int height = (int)heightNotInt;
   double weightNotInt = 5 + (int)(Math.random() * (10 - 5 + 1));
   int weight = (int)weightNotInt; 
   
    public Goblin(int height, int weight) {
        this.height = height;
        this.weight = weight;
    }
    @Override
    public String toString() {
        return grunt;
    }
}
