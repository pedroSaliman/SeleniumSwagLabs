package pages;

import org.openqa.selenium.By;

public class CartPage extends PageBase{
    private static final By Price=By.xpath("//div[@class='inventory_item_price']");
    private static final By CheckOut=By.cssSelector("#checkout");

    public CheckOutPage checkclick(){
        click(CheckOut);
        return new CheckOutPage();
    }
    public String ThePrice(){
        return Text(Price);
    }
}
