/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proj2;

/**
 *
 * @author papaollie
 */
public abstract class Goblin {

    public String grunt;
    public int height;
    public int weight;

   

    @Override
    public String toString() {
        return grunt;
    }

    public abstract void attack();

}
