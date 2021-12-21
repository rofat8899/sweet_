package model;

public class Sweet {
    private String name;
    private double weight;
    private double SugarWeight;

    public Sweet(String name, double weight, double sugarWeight) {
        this.name = name;
        this.weight = weight;
        SugarWeight = sugarWeight;
    }


    @Override
    public String toString() {
        return "Sweet{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", SugarWeight=" + SugarWeight +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getSugarWeight() {
        return SugarWeight;
    }

    public void setSugarWeight(double sugarWeight) {
        SugarWeight = sugarWeight;
    }
}
