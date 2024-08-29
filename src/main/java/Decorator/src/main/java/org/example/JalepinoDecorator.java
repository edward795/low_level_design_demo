package org.example;

public class JalepinoDecorator extends PizzaDecorator{
    public JalepinoDecorator(Pizza pizza) {
        super(pizza);
    }

    public String bake(){
        return pizza.bake()+ addJalepino();
    }

    private String addJalepino() {
     return "+Jalepino";
    }
}
