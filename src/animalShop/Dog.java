package animalShop;

public class Dog {
    //instance field declarations
    private String name;
    private String breed;
    private String barkNoise = "Woof";
    private double weight;

    public Dog(String name, String breed, double weight){
        this.name = name;
        this.breed = breed;
        this.weight = weight;
    }//end constructor method
    public Dog(String name, String breed, String noise, double weight){
        this.name = name;
        this.breed = breed;
        barkNoise = noise;
        this.weight = weight;
    }//end constructor method

    public String getName() {
        return name;
    }//end method getName

    public void setName(String name) {
        this.name = name;
    }//end method setName

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    public void bark(){
        System.out.println(barkNoise);
    }//end method bark
    public void bark(String barkNoise){
        System.out.println(barkNoise);
    }//end method bark

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", barkNoise='" + barkNoise + '\'' +
                ", weight=" + weight +
                '}';
    }
}//end class Dog
