package uk.co.library.pages;

import org.openqa.selenium.By;
import uk.co.library.utility.Utility;

public class ResultPage extends Utility {


    public void verifyTheResults(String expected) {

        By tester = By.id("header-search-keywords");
        By location = By.id("header-search-location");
        By ditance = By.xpath("//div[@class='search-nav-facets sm-no md-no']/div[1]");
        By city = By.xpath("//div[@class='search-nav search-nav--wide search-nav--empty-right']/div[2]/form/div[2]/div[2]");
        By salary = By.xpath("//div[@class='search-nav search-nav--wide search-nav--empty-right']/div[2]/form/div[2]/div[3]");
        By type = By.xpath("//div[@class='search-nav search-nav--wide search-nav--empty-right']/div[2]/form/div[2]/div[4]");

    }

    }

