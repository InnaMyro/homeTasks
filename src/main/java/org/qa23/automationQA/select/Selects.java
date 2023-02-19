package org.qa23.automationQA.select;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Selects {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("E:\\INNA\\homeTasks_html\\src\\main\\java\\org\\qa23\\automationQA\\select\\select_practice.html");
        String[] expectedResults = new String[] {
                "",
                "value:volvo",
                "value:saab",
                "value:mercedes",
                "value:audio"};
        Select auto = new Select(webDriver.findElement(By.id("auto")));


        for (int i = 1; i < auto.getOptions().size(); i++) {
            switch (i) {
                case 1:
                    case 4: auto.selectByIndex(i); break;
                case 2: auto.selectByValue(auto.getOptions().get(i).getAttribute("value")); break;
                case 3: auto.selectByVisibleText(auto.getOptions().get(i).getText());break;
            }
            WebElement out1 = webDriver.findElement(By.id("out1"));
            String resultString = "value:" + auto.getOptions().get(i).getAttribute("value");
            if (expectedResults[i].equals(resultString)) {
                System.out.println("TEST COMPLETED. Value is correct");
            } else {
                System.out.println(String.format("TEST FAILED. Selected value is [%s] but displayed value is [%s]", auto.getOptions().get(i).getText(), out1.getAttribute("value")));
            }
            Thread.sleep(1000);
        }


        webDriver.quit();

    }
}
