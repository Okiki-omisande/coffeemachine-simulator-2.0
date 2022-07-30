public class Coffee extends CoffeeMachine {
    String name;
    int Price;

    public Coffee(int WaterML, int MilkML, int coffeeBeans, int price,String name){
        super(WaterML,MilkML,coffeeBeans,1);
        this.Price = price;
        this.name = name;
    }

    public int getPrice() {
        return Price;
    }

    public String getName() {
        return name;
    }
}
