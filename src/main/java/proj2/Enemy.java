package proj2;


public abstract class Enemy {
    

    //no body here-----------------------------------------

    Enemy enemy
    Drago   12= new 

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
  public abstract void attack();
}    