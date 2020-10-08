package homework1;

public class Porsche extends Vehicle implements RaceCarFunctionalities{
    public Porsche(double price, int gears){
        super();
        super.setModel("Porsche");
    }

    public Porsche(String model, double price, double gears) {
        super(model, price, gears);
    }

    public void warmup_engine(){

    }
    public void move_to_start(){

    }
    public void race(){

    }
    public void superService(){
        System.out.println("I need this every three months.");
    }

}
