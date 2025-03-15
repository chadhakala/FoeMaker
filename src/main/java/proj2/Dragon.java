package proj2;

public class Dragon extends Enemy {

    private String attackNoise;
    
    public Dragon() {
        super();
        minMulti = 
        
    }

    public void attack() {
    }
    // double heightNotInt = 7.5 + (int)(Math.random() * (20 - 7.5 + 1));
    // int height = (int)heightNotInt;
    // double weightNotInt = 100 + (int)(Math.random() * (150 - 100 + 1));
    // int weight = (int)weightNotInt;

    public int getWeight() {
        return weight;
    }
    public void setWeight(int weight){
        this.weight = weight;
    }
    public int getHeight() {
        return height;
    }
    public void setHeight(){
        this.height = height;
    }

    @Override
    public String getAttack() {
        return super.toString() " " + attackNoise;
    }
}
