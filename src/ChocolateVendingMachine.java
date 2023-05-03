import java.util.List;

public class ChocolateVendingMachine {

    private final List<Product> products;
    public ChocolateVendingMachine(List<Product> products){
        this.products = products;
    }
    public Product getChocolate(String name, int calories){
        for(Product product: products){
            if (product instanceof Chocolate){
               if((product.getName() == name)&& (((Chocolate) product).getCalories() == calories)){
                   return  (Chocolate)product;
               }
            }

        }


        return null;
    }

}
