package framework;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

/**
 * Md Ziaur Rahman
 *     Spring_2018
 */

public class HomePage extends BasePage {

	private By accountLogo   = By.xpath("//a[@role='button']//img[@class='img-circle']");
	private By logOutTab     = By.xpath("//a[contains(text(),'Logout')]");
    private By topSearchBox  = By.xpath("//input[@id='aa-search-input']");
    private By _1stSearchItem= By.xpath("//*[@class='aa-dataset-1']");
    private By posts         = By.xpath("//*[@class='container section']//*[@class='col-md-3']");
    private By pricetag      = By.xpath("//h3/.");
    private By postTitle     = By.xpath("//h4/.");
    private By images        = By.xpath("//h4/.");



	public boolean isVisibleAccountLogo(){
		return isDisplayed(accountLogo);
	}
	
	public void clickAccountLogo(){
		clickOn(accountLogo);
	}

	public boolean isVisibleLogoutTab(){
		return isDisplayed(logOutTab);
	}

	public void write_ios_topSearchBox(String text){
	    sendText(topSearchBox, text);
	    }

    public String get_1stSearchItem(){
        return getTextFromElement(_1stSearchItem);
    }

    // Get number of posts by implementing Arraylist methods
    public int numberOfPosts(){
	    List li=findElementAsList(posts);
	    ArrayList arrayList= new ArrayList<>(li);
        int numOfPosts= arrayList.size();
        return numOfPosts;

	}

    // Get number of pricetags by implementing Arraylist methods & comparing with number of posts
    public int numberOfPriceTags(){
        List <WebElement>priceTagList= findElementAsList(pricetag);
        ArrayList <WebElement> arrayList= new ArrayList (priceTagList);
        ArrayList <String> arrayList1= new ArrayList();
        String s=null;
        for (int i=0; i<arrayList.size(); i++){
            s= arrayList.get(i).getText();
            if (s.length()>=2){
                arrayList1.add(s);
            }

        }

        return arrayList1.size();
	}

    // Get number of pricetags by implementing Arraylist methods & comparing with number of titles
    public int numberOfTites(){
        List <WebElement>postTitles= findElementAsList(postTitle);
        ArrayList <WebElement> arrayList= new ArrayList (postTitles);
        ArrayList <String> newArrayList= new ArrayList();
        String string=null;
        for (int i=0; i<arrayList.size(); i++){
            string= arrayList.get(i).getText();
            if (string.length()>=1){
                newArrayList.add(string);
            }

        }
        return newArrayList.size();
    }

    // Get number of images by implementing Arraylist methods & comparing with number of posts
    public int numberOfImages(){
        List <WebElement>itemImage= findElementAsList(images);
        ArrayList <WebElement> arrayList= new ArrayList (itemImage);

        for (int i=0; i<arrayList.size(); i++) {
        }
        return arrayList.size();
    }




}




























/** Lesson: Arraylist was printing as Webelements instead of text
 *  Time  : 20 hrs
 * =========================================================================
 *  Solution:
 *  I should write List      <WebElement> list= findelementsAsLists();
 *  I should write ArrayList <WebElement> al  = findelementsAsLists();
 *
 *  instead of what I was trying :
 *  List list   = findelementaslist();
 *  ArrayList al= new Arraylist(list);
 *
 */

