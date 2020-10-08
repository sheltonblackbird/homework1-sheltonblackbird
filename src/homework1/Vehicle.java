package homework1;

public class Vehicle<i> { public String model; public double price; public double gears; public static int length;
public Vehicle(String model, double price, double gears, int length){
    this.model=model;
    this.price=price;
    this.gears=gears;



}

    public Vehicle() {

    }

    public double getPrice(){return price;}
public String getModel(){return model;}
public double getGears(){return gears;}
public void setPrice(double Price){this.price=price;}
public void setModel(String model){this.model=model;}
public void setGears(int gears){this.gears=gears;}


    public void setType(String toString) {
    }
    public static int length;
    for (int i = 0; i < Vehicle.length; i++){
        Vehicle[i] = new Vehicle();
    }

    private class length {
    }
}
