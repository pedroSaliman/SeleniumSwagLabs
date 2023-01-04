package pages;

import org.openqa.selenium.By;

public class LoginPage extends PageBase {




    private static final By Email=By.xpath("//input[@id='user-name']");
    private static final By Password=By.cssSelector("#password");
    private static final By Button=By.cssSelector("#login-button");


    //////////////////////////////////////////////

    public Home LoginProcess(String email,String password){
        type(Email,email);
        type(Password,password);
        click(Button);
        return new Home();


    }

}
