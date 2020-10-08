package homework1;

public class Mazda extends Vehicle implements StreetCarFunctionalities {
    public Mazda(double price, int gears){
        super("Mazda5",price,gears);


    }


    @Override
    public void startengine() {

    }

    //@Override
    public void drive() {

    }
    public void superEconomic(){System.out.println("Most economical car in my garage");}
}

