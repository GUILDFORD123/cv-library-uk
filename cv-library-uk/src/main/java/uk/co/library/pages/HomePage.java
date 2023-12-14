package uk.co.library.pages;


import org.openqa.selenium.By;
import uk.co.library.utility.Utility;

public class HomePage extends Utility {

    By jobtitle = By.id("keywords"); //1
    By Location = By.id("location"); //2
    By distanceDropDown = By.id("distance");//3
    By moreSearchOptionsLink = By.id("toggle-hp-search");//4
    By salaryMin = By.id("salarymin");//5
    By salaryMax = By.id("salarymax");//6
    By salaryTypeDropDown = By.id("salarytype");//7
    By jobTypeDropDown = By.id("tempperm");//8
    By findJobsBtn = By.id("hp-search-btn");//9
    public void switchToIframe(){
        driver.switchTo().frame("gdpr-consent-notice");
        clickOnElement(By.xpath("//div[@class='action-buttons top-bottom right-column ng-star-inserted']/button[2]"));
        driver.switchTo().defaultContent();

    }

    public void enterJobTitle(String jobTitle) {

        sendTextToElement(jobtitle, jobTitle);
    }

    public void enterLocation(String location) {
mouseHoverToElementAndClick(Location);
        sendTextToElement(Location, location);
    }

    public String selectDistance(String distance) {
        sendTextToElement(distanceDropDown, distance);
        return distance;
    }
    public void clickOnMoreSearchOptionLink(){
        clickOnElement(moreSearchOptionsLink);
    }

    public void enterMinSalary(String minSalary){
        sendTextToElement(salaryMin,minSalary);
    }
    public void enterMaxSalary(String maxSalary){
        sendTextToElement(salaryMax,maxSalary);
    }
    public void selectSalaryType(String sType){
        sendTextToElement(salaryTypeDropDown,sType);
    }
       public void  selectJobType(String jobType){
        sendTextToElement(jobTypeDropDown,jobType);
       }
       public void clickOnFindJobsButton(){
        clickOnElement(findJobsBtn);
       }

}