package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {

    public static final String XPATH_DAY = "//div[contains(@class, \"_5k_5\")]/span/span/select[1]";
    public static final String XPATH_MONTH = "//div[contains(@class, \"_5k_5\")]/span/span/select[2]";
    public static final String XPATH_YEAR = "//div[contains(@class, \"_5k_5\")]/span/span/select[3]";

    public static void main(String[] args) {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://facebook.com");

        WebElement selectComboDay = driver.findElement(By.xpath(XPATH_DAY));
        Select selectDay = new Select(selectComboDay);
        selectDay.selectByIndex(23);

        WebElement selectComboMonth = driver.findElement(By.xpath(XPATH_MONTH));
        Select selectMonth = new Select(selectComboMonth);
        selectMonth.selectByIndex(2);

        WebElement selectComboYear = driver.findElement(By.xpath(XPATH_YEAR));
        Select selectYear = new Select(selectComboYear);
        selectYear.selectByIndex(35);
    }
}

