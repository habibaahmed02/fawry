package onlineshop;
import java.util.ArrayList;
public class ShoppingCart {
    ArrayList <Product> products=new ArrayList<>();
    public void addProduct(Product product){
        products.add(product);
    }
    public void removeProduct(Product product){
        products.remove(product);
    }
    public double total(){
        double cost=0;
        for(Product product: products){
            cost+=product.getPrice();
        }
        return cost;
    }
    public ArrayList<Product> getProducts(){
        return products;
    }
}
