package framework;

import org.openqa.selenium.By;

import java.util.Random;

/**
 * Md Ziaur Rahman
 *     Spring_2018
 */

public class SignupPage extends BasePage {


    private By userNameTextField= By.xpath("//input[@name='username']");
    private By emailTextField   = By.xpath("//input[@name='email']");
    private By passwordTextField= By.xpath("//input[@name='password']");
    private By submitButton     = By.xpath("//button[@type='submit']");
    private By signUpLabel      = By.xpath("//*[contains(text(),'Signup')]");


    public void enterUserName(String text){
        sendText(userNameTextField,text);
    }

    public void enterEmail(String text){
        Random randomNum= new Random();
        int randomNumber=randomNum.nextInt(3000);
        String rnS=Integer.toString(randomNumber);
        String email= rnS+text;
        sendText(emailTextField,email);
    }

    public void enterPassword(String text){
        sendText(passwordTextField,text);
    }

    public void submitButton(){
        clickOn(submitButton);
    }

    public boolean verifyInvalidLogIn(){
        return isDisplayed(signUpLabel);
    }
}
