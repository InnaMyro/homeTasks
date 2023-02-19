package org.qa23.automationQA.wait;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Objects;


public class Wait {
    public static void main(String[] args) {

        WebDriverManager chromedriver = WebDriverManager.chromedriver();
        WebDriver webDriver = new ChromeDriver();
        chromedriver.setup();
        webDriver.get("https://itstep.dp.ua/");
        WebElement popup = new WebDriverWait(webDriver, Duration.ofSeconds(60)).until(webDriver1 -> webDriver1.findElement(By.cssSelector("#academy_page > div.popup.new-rpo-popup.popup__open > div.popup__content.popup__content--demo > div.form-demo > div > div > h3")));
        if (Objects.nonNull(popup)) {
            System.out.println("Expected text: "+ popup.getText());
        }
        webDriver.get("E:\\INNA\\homeTasks_html\\src\\main\\java\\org\\qa23\\automationQA\\wait\\waits.html");
        Alert until = new WebDriverWait(webDriver, Duration.ofSeconds(3))
                .until(driver -> driver.switchTo().alert());
        until.accept();

        webDriver.quit();
    }
}
