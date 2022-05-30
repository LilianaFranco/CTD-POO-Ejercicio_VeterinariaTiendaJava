import java.lang.reflect.Array;

public class pet {
    String typeOfPet;
    String name;
    double servingSize;

    public pet(String typeOfPet, String name, double servingSize) {
        this.typeOfPet = typeOfPet;
        this.name = name;
        this.servingSize = servingSize;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getServingSize() {
        return servingSize;
    }

    public void setServingSize(double servingSize) {
        this.servingSize = servingSize;
    }

    public int showQtyFoodPackeges(double[] foodPackages){
        int numberPackages = 0;
        double foodWeight = 0;
        int i = 0;
        while (i<=foodPackages.length && foodWeight <= this.servingSize){
            foodWeight = foodPackages[i]+ foodWeight;
            numberPackages+=1;
        }
        i++;
        return numberPackages;
    }
}
