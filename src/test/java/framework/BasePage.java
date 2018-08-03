package framework;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import stepdefinition.DriverFactory;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Md Ziaur Rahman
 *     Spring_2018
 */

public class BasePage {


    private String pageTitle = null;



    // Page Title
    public String pageTitle() {

        String pageTitle = DriverFactory.getDriver().getTitle();
        return pageTitle;
    }

	// Click on webElement
	public void clickOn(By locator) {
		try {
			DriverFactory.getDriver().findElement(locator).click();
		} catch (NoSuchElementException e) {
			Assert.fail("Element is not found with this locator: " + locator.toString());
			e.printStackTrace();
		}
	}

	public void clickOn_JS(By locator) {
		try {
			DriverFactory.getDriver().findElement(locator).click();
		} catch (NoSuchElementException e) {
			Assert.fail("Element is not found with this locator: " + locator.toString());
			e.printStackTrace();
		}
	}


	// send & get Text
	public void sendText(By locator, String text) {
		try {
			DriverFactory.getDriver().findElement(locator).sendKeys(text);
		} catch (NoSuchElementException e) {
			Assert.fail("Element is not found with this locator: " + locator.toString());
			e.printStackTrace();
		}
	}

    public String getTextFromElement(By locator) {
		String text = null;
		try {
			text = DriverFactory.getDriver().findElement(locator).getText();
		} catch (NoSuchElementException e) {
			Assert.fail("Element is not found with this locator: " + locator.toString());
			e.printStackTrace();
		}

		return text;
	}


	// find & return Element(s)
    public WebElement findElement(By locator){
        WebElement element= DriverFactory.getDriver().findElement(locator);
        return element;
    }

    public List<WebElement> findElementAsList(By locator){
        List <WebElement> element= DriverFactory.getDriver().findElements(locator);
        return element;
    }


    // dropDown Menue ; Select key

	// perform Action

	// if element Visible/Selected/Enabled
	public boolean isDisplayed(By locator){
		Boolean isVisible= DriverFactory.getDriver().findElement(locator).isDisplayed();
		return isVisible;
	}

	public boolean isSelected(By locator){
		Boolean isVisible= DriverFactory.getDriver().findElement(locator).isSelected();
		return isVisible;
	}

	public boolean isEnabled(By locator){
		Boolean isVisible= DriverFactory.getDriver().findElement(locator).isEnabled();
		return isVisible;
	}


    //highLight Field
    public void highLightElement(By locator){
        WebElement element = DriverFactory.getDriver().findElement(locator);
        ((JavascriptExecutor) DriverFactory.getDriver()).executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", element);
    }


	// alert
	public void acceptAlert(){
    	DriverFactory.getDriver().switchTo().alert().accept();
	}

	public void dismissAlert(){
		DriverFactory.getDriver().switchTo().alert().dismiss();
	}

	public void getTextAlert(){
		DriverFactory.getDriver().switchTo().alert().getText();
	}

	public void sendTextAlert(String string){
		DriverFactory.getDriver().switchTo().alert().sendKeys(string);
	}


	//iFrame
	public void switchFrame_ByNum(int i){
		DriverFactory.getDriver().switchTo().frame(i);
	}

	public void switchFrame_ByName( String s){
		DriverFactory.getDriver().switchTo().frame(s);
	}

	public void switchto_ParentFrame(){
		DriverFactory.getDriver().switchTo().parentFrame();
	}


    // tab Navigation
    public void clickOnBrowserBackArrow() {
		DriverFactory.getDriver().navigate().back();
	}

	public void clickOnBrowserForwardArrow() {
		DriverFactory.getDriver().navigate().forward();
	}

	public void refreshBrowser() {
		DriverFactory.getDriver().navigate().refresh();
	}

	// switch windows

	// wait

	// current Date: day, Month, Year;  current Time: hour,min,sec
    public String todaysDate(String date_D__month_M__year_Y__fullDate_F){
        Date date            = new Date();
        SimpleDateFormat sdf;
        String stringFormat = null;

        switch (date_D__month_M__year_Y__fullDate_F){

            case "d":
            case "D":
                sdf = new SimpleDateFormat("dd");
                stringFormat = sdf.format(date);
                break;

            case "mmm":
            case "MMM":
                sdf = new SimpleDateFormat("MMMM");
                stringFormat = sdf.format(date);
                break;

            case "YYYY":
            case "yyyy":
                sdf = new SimpleDateFormat("YYYY");
                stringFormat = sdf.format(date);
                break;

        }

        return stringFormat;
    }

    public int getCurrentHour(){
        Date date  = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("hh");
        String hour = sdf.format(date);
        int intHour = Integer.parseInt(hour);
        return intHour;
    }

    // screenShot


    // Regex
    public String regex(String theRegex, String str2Check){

        Pattern checkRegex  = Pattern.compile(theRegex);
        Matcher regexMatcher= checkRegex.matcher(str2Check);
        String regString=null;
        while(regexMatcher.find()){
            if (regexMatcher.group().length()!=0){
                regString = regexMatcher.group();

            }
        }return regString;



    }



}
