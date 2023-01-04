package pages;


import org.openqa.selenium.By;

public class Home extends PageBase {



///////////////////////////////////////////////////////
    private static final     By products =By.xpath("//span[@class='title']");
    private static final By AddtoCart=By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']");
    private static final By carCart=By.xpath("//a[@class='shopping_cart_link']");

public String Message(){
    return Text(products);
}
public CartPage clickToCart(){
    click(AddtoCart);
    click(carCart);
    return new CartPage();
}






}
