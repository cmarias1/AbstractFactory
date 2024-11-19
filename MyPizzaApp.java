public class MyPizzaApp {
    public static void main(String[] args) {

        // Test ordering a Cheese Pizza from NY
        PizzaStore nyStore = new NYPizzaStore();
        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Ordered: " + pizza.getName() + "\n");

        // Test ordering a Veggie Pizza from Chicago
        PizzaStore chicagoStore = new ChicagoPizzaStore();
        pizza = chicagoStore.orderPizza("veggie");
        System.out.println("Ordered: " + pizza.getName() + "\n");
    }
}
