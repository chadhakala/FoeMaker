package proj2;


public abstract class Enemy {
public abstract void attack();
//I added this one because the way he makes sounds
//doesn't make sense yet.
public void grunt() {
    
}
    public Enemy() {
        //lets not guess but idk yet
//    attack();    
    }
//public abstract class Enemy {
    

    //no body here-----------------------------------------


    private int height = 0;
    private int weight = 0;
    public String grunt = "";
    
    
    public Enemy(int weight, int height, String grunt) {
        this.weight = weight;
        this.height = height;
        this.grunt = grunt;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
  
}    