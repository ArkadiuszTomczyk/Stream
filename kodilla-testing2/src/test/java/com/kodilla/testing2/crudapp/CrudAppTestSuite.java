package com.kodilla.testing2.crudapp;

import com.kodilla.testing2.config.WebDriverConfig;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import sun.dc.pr.PRError;

public class CrudAppTestSuite {
    private static final String BASE_URL = "HTTPS://G01d3NDUck.github.io/";
    private WebDriver driver;

    @Before
    public void initTests() {
        driver = WebDriverConfig.getDriver(WebDriverConfig.FIREFOX);
        driver.get(BASE_URL);
    }
    @Test
    public void shouldCreateTrelloCard() {
        final String XPATH_TASK_NAME = "//from[CONTAINS(@ACTION,\"createTask\")]/fieldset[1]/input";
        final String XPATH_TASK_CONTENT = "";
        final String XPATH_ADD_BUTTON = "";

    }

    @After
    public void cleaanAfterTests() {
        driver.close();
    }
}
