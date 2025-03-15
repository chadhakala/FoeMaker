package proj2;

public class Ogre extends Enemy {

    double heightNotInt = 200 + (int) (Math.random() * (300 - 200 + 1));

    public Ogre() {
        super();
        int weight;
        int height = (int) heightNotInt;
        //attackText = "";

    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }
    public double setHeightNotInt(){
    double heightNotInt = 200 + (int) (Math.random() * (300 - 200 + 1));
    }

}
