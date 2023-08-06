package onlineshop;
public class OnlineShop {

    
    public static void main(String[] args) throws Exception {
       Product p1=new Product("Mug",200);
       Product p2=new Product("Notebook",150);
       Product p3= new Product("Keychain",50);
       
       ShoppingCart cart= new ShoppingCart();
       cart.addProduct(p2);
       cart.addProduct(p3);
       OrderProcessor order=new OrderProcessor();
       order.placeHolder(cart);
    }    
}
