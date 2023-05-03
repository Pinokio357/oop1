import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        Product product1 = new Product("chocolate", 65.23);

        System.out.println(product1.displayInfo());
        Product product2 = new Product("milka");

        System.out.println(product2.displayInfo());

        Product product3 = new Product();

        System.out.println(product3.displayInfo());
        Product product4 = new Product("yu", "rt", - 23);
        System.out.println(product4.displayInfo());
        Chocolate choco = new Chocolate("alpengold", 50, 1600);
        System.out.println(choco.displayInfo());
        Product choco2 = new Chocolate( "milka", 67, 1500);
        List<Product> products = new ArrayList<>();
        products.add(product1);
        products.add(product2);
        products.add(choco);
        products.add(choco2);
        ChocolateVendingMachine machine = new ChocolateVendingMachine(products);
        Chocolate res = (Chocolate) machine.getChocolate("milka", 1500);
        if(res != null){
            System.out.println("you buy: ");
            System.out.println(res.displayInfo());
        }
        else {
            System.out.println("there is not chocolate like you want");
        }


    }
}
