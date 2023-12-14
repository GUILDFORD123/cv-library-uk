package uk.co.library.pages;


import org.openqa.selenium.By;
import uk.co.library.utility.Utility;

public class LoginPage extends Utility {
    By welcomeText = By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]");


  public String getWelcomeText(){
      return getTextFromElement(welcomeText);
  }
}
