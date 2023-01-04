package pages;

import org.openqa.selenium.By;

public class FinishPage extends PageBase{
    private static final By Order=By.cssSelector(".complete-header");


    public String Message(){
        return Text(Order);
    }
}
