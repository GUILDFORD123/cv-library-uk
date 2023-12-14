package uk.co.library.testsuite;

import org.testng.annotations.Test;
import uk.co.library.pages.HomePage;
import uk.co.library.pages.ResultPage;
import uk.co.library.testbase.TestBase;

public class JobSearchTest extends TestBase {

    HomePage homePage = new HomePage();
    ResultPage resultPage = new ResultPage();
    @Test(groups = {"smoke"})
    public void verifyJobSearchResultUsingDifferentDataSet(){
        homePage.switchToIframe();
        homePage.enterJobTitle("Tester");//1
       homePage.enterLocation("guildford");
       homePage.selectDistance("up to 15 miles");
        homePage.clickOnMoreSearchOptionLink();
        homePage.enterMinSalary("50000");
        homePage.enterMaxSalary("60000");
        homePage.selectSalaryType("per anuual");
        homePage.selectJobType("contract");
        homePage.clickOnFindJobsButton();


    }
}
