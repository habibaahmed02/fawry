package onlineshop;

import java.util.ArrayList;

public class OrderProcessor {
    public void placeHolder(ShoppingCart cart) throws Exception{
        ArrayList<Product> products= cart.getProducts();
        if(products.isEmpty())
            throw new Exception("cart is empty");
        products.forEach(product-> System.out.println(product.getName()+"\t"+product.getPrice()+"\n total="+cart.total()));
        OrderProcessor order= new OrderProcessor();
        order.placeHolder(cart);
    
    } 
}

