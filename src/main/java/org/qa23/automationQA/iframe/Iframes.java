package org.qa23.automationQA.iframe;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Iframes {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager chromedriver = WebDriverManager.chromedriver();
        WebDriver webDriver = new ChromeDriver();
        chromedriver.setup();
        webDriver.manage().timeouts().pageLoadTimeout(4, TimeUnit.SECONDS);
        try {
            webDriver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_iframe");
        } catch (Exception e) {
        }
        WebElement myFrame = webDriver.findElement(By.id("iframeResult"));
        if (myFrame != null) {
            webDriver.switchTo().frame(myFrame);
            String title = webDriver.getTitle();
            if ("W3Schools Online Web Tutorials".equals(title)) {
                System.out.println("TEST COMPLETED");
            } else {
                System.out.println(String.format("TEST FAILED. Expected result [W3Schools Online Web Tutorials] - actual result [%s]", title));

            }
        }
        webDriver.get("E:\\INNA\\homeTasks_html\\src\\main\\java\\org\\qa23\\automationQA\\iframe\\alert.html");
        WebElement alert = webDriver.findElement(By.id("alert"));
        if (alert != null) {
            WebElement button = alert.findElement(By.tagName("button"));
            button.click();
            Alert targetAlert = webDriver.switchTo().alert();
            targetAlert.accept();
        }
        WebElement span = alert.findElement(By.tagName("span"));
        if (span != null) {
            if (span.getText().equals("+")) {
                System.out.println("TEST COMPLETED");
            } else {
                System.out.println("TEST FEILED. Don't have text + in span");
            }
        }
        WebElement confirm = webDriver.findElement(By.id("confirm"));
        if (confirm != null) {
            WebElement button = confirm.findElement(By.tagName("button"));
            button.click();
            Alert targetAlert = webDriver.switchTo().alert();
            targetAlert.accept();
        }
        WebElement confirmSpan = confirm.findElement(By.tagName("span"));
        if (confirmSpan != null) {
            if (confirmSpan.getText().equals("+")) {
                System.out.println("TEST COMPLETED");
            } else {
                System.out.println("TEST FEILED. Don't have text + in span");
            }
        }
        WebElement prompt = webDriver.findElement(By.id("prompt"));
        if (prompt != null) {
            WebElement button = prompt.findElement(By.tagName("button"));
            button.click();
            Alert targetAlert = webDriver.switchTo().alert();
            targetAlert.accept();
        }
        WebElement promtSpan = prompt.findElement(By.tagName("span"));
        if (promtSpan != null) {
            if (promtSpan.getText().equals("+")) {
                System.out.println("TEST COMPLETED");
            } else {
                System.out.println("TEST FEILED. Don't have text + in span");
            }
        }
        webDriver.quit();

    }
}
