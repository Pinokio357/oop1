public class Product {

    protected String name;
    protected String brand;
    protected double price;
    int param1;
    String param2;
    boolean param3;
    {
        System.out.println("inicializer");
        param1 = 100;
        param2 = "str";
        param3 = true;
    }
    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        if(price <= 0)
            this.price = 1;
        else
            this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.length() < 3)
            this. name = "product";
        else
            this.name = name;
    }

    public Product(){
        this("product");

    }
    public Product(String name){
        this(name, 3.5);

    }
    public Product(String name, double price){
        this("noname",name, price);

    }
    public Product(String brand,String name, double price){
        System.out.println("constructor");
    if(brand.length() < 3)
        this.brand = "noname";
    else
        this.brand = brand;
    if(name.length() < 3)
        this. name = "product";
    else
        this.name = name;
    if(price <= 0)
        this.price = 1;
    else
        this.price = price;

    }



    /*
    * получить информацию о продукте
    * */

    String displayInfo(){
        return String.format("%s - %s - %f", brand, name, price);
    }
}
