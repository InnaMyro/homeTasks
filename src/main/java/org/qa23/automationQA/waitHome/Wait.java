package org.qa23.automationQA.waitHome;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Objects;
import java.util.concurrent.TimeUnit;


public class Wait {
    public static void main(String[] args) {

        WebDriverManager chromedriver = WebDriverManager.chromedriver();
        WebDriver webDriver = new ChromeDriver();
        chromedriver.setup();

        webDriver.get("E:\\INNA\\homeTasks_html\\src\\main\\java\\org\\qa23\\automationQA\\waitHome\\waits.html");
        new WebDriverWait(webDriver, Duration.ofSeconds(20)).until(webDriver1 -> webDriver1.switchTo().alert()).accept();
        WebElement body = new WebDriverWait(webDriver, Duration.ofSeconds(100)).until(webDriver1 -> webDriver1.findElement(By.className("blue")));
        if (Objects.nonNull(body) && body.getAttribute("class").equals("blue")) {
            System.out.println("TEST COMPLETED: class .blue EXIST");
        } else {
            System.out.println("TEST FAILED: class .blue NOT EXIST");
        }
        webDriver.quit();
    }
}
