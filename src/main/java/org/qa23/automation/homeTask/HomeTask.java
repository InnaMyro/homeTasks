package org.qa23.automation.homeTask;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeTask {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();

        WebDriver webDriver = new ChromeDriver();


        String url = "file:///E:/INNA/homeTasks_html/src/main/java/resourse/forms.html";
        webDriver.get(url);

        webDriver.manage().window().maximize();

        WebElement login = webDriver.findElement(By.name("login"));
        login.sendKeys("47program");
        WebElement password = webDriver.findElement(By.name("password"));
        password.sendKeys("test");
        password.submit();
    }
}
