package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {
    public static final String XPATH_WAIT_FOR ="//select[1]";
    public static final String XPATH_SELECT ="//*[@id=\"day\"]";
    public static final String XPATH_SELECT1 ="//*[@id=\"month\"]";
    public static final String XPATH_SELECT2 ="//*[@id=\"year\"]";



    public static void main(String[] args) {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.FIREFOX);
        driver.get("https://www.facebook.com");


        while (!driver.findElement(By.xpath(XPATH_WAIT_FOR)).isDisplayed());

        WebElement selectCombo = driver.findElement(By.xpath(XPATH_SELECT));
        Select selectDay = new Select(selectCombo);
        selectDay.selectByValue("1");

        WebElement selectCombo2 = driver.findElement(By.xpath(XPATH_SELECT1));
        Select selectMonth= new Select(selectCombo2);
        selectMonth.selectByValue("3");

        WebElement selectCombo3 = driver.findElement(By.xpath(XPATH_SELECT2));
        Select selectYear = new Select(selectCombo3);
        selectYear.selectByValue("1996");


    }
}
