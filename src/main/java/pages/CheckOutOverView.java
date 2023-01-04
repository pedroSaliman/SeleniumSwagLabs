package pages;

import org.openqa.selenium.By;

public class CheckOutOverView extends PageBase{
    private static final By Tittle= By.xpath("//span[@class='title']");
    private static final By Button=By.cssSelector("#finish");

    public String Tex(){
        return Text(Tittle);
    }

    public FinishPage clickF(){
        click(Button);
        return new FinishPage();
    }
}
