package framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import stepdefinition.DriverFactory;

import java.util.List;

/**
 * Created by mdrahman on 8/1/18.
 * Spring 2018
 */
public class DarkskyPage extends BasePage{


    public By hourList       = By.xpath("//span[@class='hour']/*[1]");

    public By expandButton   = By.xpath("//*[@class='close']/*[@xpath='1']");
    public By tmButton       = By.xpath("//a[@class='button']");

    public By calYear        = By.xpath("//*[@class='pika-label'][2]");
    public By calMonth       = By.xpath("//*[@class='pika-label'][1]");
    public By calToday       = By.xpath("//td[@class='is-today']");

    public By barHighestTemp = By.xpath("//*[@class='minTemp' and @xpath = '1']");
    public By barLowestTemp  = By.xpath("//*[@class='maxTemp' and @xpath ='1' ]");
    public By higestTemp     = By.xpath("//span[@class='temp' and @xpath = '1']");
    public By lowestTemp     = By.xpath("");



    public void verifyHomePage(){
            Assert.assertEquals(pageTitle(), "Dark Sky - 260 Broadway, New York City, NY",
                    "Page Title not matched ");
    }

    public void expandTodaysTimeline(){
        clickOn(expandButton);
    }

    public void clickOnTimeMachine(){
        clickOn(tmButton);
    }

    public void verify2hourIncrement(){
        List <WebElement> hList = findElementAsList(hourList);
        int counter = getCurrentHour();
        for (WebElement h : hList ) {
            String hr = regex("[0-9]{0,2}", h.getText());
            int intHour = Integer.parseInt(hr);

            if (counter==11){
                counter = 1;
            } else if (counter == 12){
                counter = 2;
            } else {
                counter = counter + 2;
            }
            if (counter==intHour){
            }else{
                System.out.println("Hour is not incrementing as 2 hours");
           }
        }
    }

    public void verifyLowestHighestTemp(){

    }

    public void verifyTodaysDate(){
        String todaysDt = getTextFromElement(calToday);

        if (todaysDate("D").contains(todaysDt)){
                System.out.println("Calendar Date is matched. " +
                        "Today's date is correctly shown as " + todaysDt );
        }else{
                System.out.println("Date is mismatched ");
        }

    }


}


