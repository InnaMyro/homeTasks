package org.qa23.automationQA.forms;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Forms {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("E:\\INNA\\homeTasks_html\\src\\main\\java\\org\\qa23\\automationQA\\forms\\hw5.html");

        List<WebElement> inputs = webDriver.findElements(By.tagName("input"));
        WebElement javaElement = null;
        WebElement test = null;
        int countCheckbox = 0;
        int countRadioButton = 0;
        for (int i = 0; i < inputs.size(); i++) {
            Thread.sleep(1000);
            WebElement webElement = inputs.get(i);
            if (webElement.getAttribute("type").equals("checkbox")) {
                if (webElement.getAttribute("value").equals("Java")) {
                    javaElement = webElement;

                }
                countCheckbox++;
                webElement.click();
            }
            if (webElement.getAttribute("type").equals("radio")) {
                if (webElement.getAttribute("value").equals("Test Automation")) {
                    test = webElement;

                }
                countRadioButton++;
                webElement.click();

            }
        }
        if (javaElement != null && javaElement.isSelected()) {
            System.out.println("Test completed");
        } else {
            System.out.println("Test Failed. HTML input Java not selected");
        }
        if (test != null && test.isSelected()) {
            System.out.println("Test completed");
        } else {
            System.out.println("Test Failed. HTML input Test Automation not selected");
        }
        System.out.println("Count checkbox: " + countCheckbox);
        System.out.println("Count radio: " + countRadioButton);
        webDriver.quit();

    }
}
