package org.qa23.automation.praktik;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestForm {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();

        WebDriver webDriver = new ChromeDriver();


        String url = "file:///E:/INNA/homeTasks_html/src/main/java/resourse/forms.html";
        String path = "C:\\Users\\Home\\IdeaProjects\\qa23Selenium\\src\\main\\java\\lesson5\\forms.html";
        webDriver.get(url);

        WebElement login = webDriver.findElement(By.name("login"));
        login.sendKeys("47program");
        WebElement password = webDriver.findElement(By.name("password"));
        password.sendKeys("test");
        password.submit();
    }
}
