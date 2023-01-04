package pages;

import org.openqa.selenium.By;

public class CheckOutPage extends PageBase{
    private static final By Tittle=By.xpath("//span[@class='title']");
    private static final By fname=By.cssSelector("#first-name");
    private static final By lastname=By.cssSelector("#last-name");
    private static final By zibcode=By.cssSelector("#postal-code");
    private static final By Button=By.cssSelector("#continue");
    public String message(){
        return Text(Tittle);

    }
public void info(String First,String Last,String Zib){
        type(fname,First);
        type(lastname,Last);
        type(zibcode,Zib);
        click(Button);
}
}
