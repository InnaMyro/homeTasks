package org.qa23.automationQA.windowsExceptions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;


public class WindowsException {
    public static void main(String[] args) {

        WebDriverManager chromedriver = WebDriverManager.chromedriver();
        WebDriver webDriver = new ChromeDriver();
        chromedriver.setup();

        webDriver.get("E:\\INNA\\homeTasks_html\\src\\main\\java\\org\\qa23\\automationQA\\windowsExceptions\\windows.html");
        String windowHandle = webDriver.getWindowHandle();
        clickNewTab(webDriver);
        webDriver.switchTo().window(webDriver.getWindowHandle());
        webDriver.switchTo().window(windowHandle);
        clickNewWindow(webDriver);
        webDriver.getWindowHandles().forEach(el-> {
            webDriver.switchTo().window(el);
            System.out.println(webDriver.getTitle());
        });
        webDriver.quit();
    }

    private static void clickNewTab(WebDriver webDriver) {
        List<WebElement> button = webDriver.findElements(By.tagName("button"));
        for (WebElement singleButton: button) {
            if (singleButton.getText().equals("New Browser Tab")) {
                singleButton.click();
            }
        }
    }
    private static void clickNewWindow(WebDriver webDriver) {
        List<WebElement> button = webDriver.findElements(By.tagName("button"));
        for (WebElement singleButton: button) {
            if (singleButton.getText().equals("New Browser Window")) {
                singleButton.click();
            }
        }
    }
}
